/**
 * Copyright (c) 2005-2015, KoLmafia development team
 * http://kolmafia.sourceforge.net/
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  [1] Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *  [2] Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in
 *      the documentation and/or other materials provided with the
 *      distribution.
 *  [3] Neither the name "KoLmafia" nor the names of its contributors may
 *      be used to endorse or promote products derived from this software
 *      without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION ) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE ) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package net.sourceforge.kolmafia.textui.parsetree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import net.sourceforge.kolmafia.textui.DataTypes;
import net.sourceforge.kolmafia.textui.Interpreter;

public class MapValue
	extends AggregateValue
{
	public MapValue( final AggregateType type )
	{
		super( type );
		this.content = new TreeMap();
	}

	@Override
	public Value aref( final Value key, final Interpreter interpreter )
	{
		TreeMap map = (TreeMap) this.content;
		return (Value) map.get( key );
	}

	@Override
	public void aset( final Value key, Value val, final Interpreter interpreter )
	{
		TreeMap map = (TreeMap) this.content;

		if ( !this.getDataType().equals( val.getType() ) )
		{
			if ( this.getDataType().equals( DataTypes.TYPE_STRING ) )
			{
				val = val.toStringValue();
			}
			else if ( this.getDataType().equals( DataTypes.TYPE_INT ) && val.getType().equals(
				DataTypes.TYPE_FLOAT ) )
			{
				val = val.toIntValue();
			}
			else if ( this.getDataType().equals( DataTypes.TYPE_FLOAT ) && val.getType().equals(
				DataTypes.TYPE_INT ) )
			{
				val = val.toFloatValue();
			}
		}

		map.put( key, val );
	}

	@Override
	public Value remove( final Value key, final Interpreter interpreter )
	{
		// Look through all active foreach loops since they are
		// implemented via iterators and you must use that iterator's
		// remove method on the current element only.
		for ( int i = interpreter.iterators.size() - 3; i >= 0; i -= 3 )
		{
			AggregateValue slice = (AggregateValue) interpreter.iterators.get( i + 1 );
			if ( slice != this )
			{
				continue;
			}
			Value keyValue = (Value) interpreter.iterators.get( i );
			if ( !key.equals( keyValue ) )
			{
				throw interpreter.runtimeException( "Removing non-current key within foreach" );
			}

			// This is removing the current element of a foreach iterator.
			// That works.
			Iterator it = (Iterator) interpreter.iterators.get( i + 2 );
			Value rv = this.aref( key, interpreter );
			it.remove();

			// NULL-out the key associated with this iterator in
			// case remove is used more than once on the same key
			interpreter.iterators.set( i, null );

			return rv;
		}
		
		TreeMap map = (TreeMap) this.content;
		return (Value) map.remove( key );
	}

	@Override
	public void clear()
	{
		TreeMap map = (TreeMap) this.content;
		map.clear();
	}

	@Override
	public int count()
	{
		TreeMap map = (TreeMap) this.content;
		return map.size();
	}

	@Override
	public boolean contains( final Value key )
	{
		TreeMap map = (TreeMap) this.content;
		return map.containsKey( key );
	}

	@Override
	public Value[] keys()
	{
		Set set = ( (TreeMap) this.content ).keySet();
		Value[] keys = new Value[ set.size() ];
		set.toArray( keys );
		return keys;
	}

	@Override
	public Iterator iterator()
	{
		Set set = ( (TreeMap) this.content ).keySet();
		return set.iterator();
	}
}
