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
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package net.sourceforge.kolmafia.objectpool;

public class AdventurePool
{
	public static final int DEGRASSI_KNOLL = 18;
	public static final int FUN_HOUSE = 20;
	public static final int HIPPY_CAMP = 26;
	public static final int FRAT_HOUSE = 27;
	public static final int FRAT_HOUSE_DISGUISED = 29;
	public static final int BAT_HOLE_ENTRYWAY = 30;
	public static final int GUANO_JUNCTION = 31;
	public static final int BATRAT = 32;
	public static final String BATRAT_ID = "32";
	public static final int BEANBAT = 33;
	public static final String BEANBAT_ID = "33";
	public static final int BOSSBAT = 34;
	public static final String BOSSBAT_ID = "34";
	public static final String DUNGEON_OF_DOOM_ID = "39";
	public static final int MENAGERIE_LEVEL_2 = 52;
	public static final int HIPPY_CAMP_DISGUISED = 65;
	public static final int PIRATE_COVE = 66;
	public static final String ROULETTE_TABLES_ID = "70";
	public static final int POKER_ROOM = 71;
	public static final String PIXEL_REALM_ID = "73";
	public static final String ORC_CHASM_ID = "80";
	public static final String AIRSHIP_ID = "81";
	public static final String GIANT_CASTLE_ID = "82";
	public static final String HOLE_IN_THE_SKY_ID = "83";
	public static final int COLA_BATTLEFIELD = 85;
	public static final String COLA_BATTLEFIELD_ID = "85";
	public static final int CLOACA_BATTLEFIELD = 86;
	public static final String CLOACA_BATTLEFIELD_ID = "86";
	public static final int DYSPEPSI_BATTLEFIELD = 87;
	public static final String DYSPEPSI_BATTLEFIELD_ID = "87";
	public static final String BAD_TRIP_ID = "96";
	public static final String GREAT_TRIP_ID = "97";
	public static final String MEDIOCRE_TRIP_ID = "98";
	public static final int ROAD_TO_WHITE_CITADEL = 99;
	public static final String ROAD_TO_WHITE_CITADEL_ID = "99";
	public static final String WHITEYS_GROVE_ID = "100";
	public static final String ICY_PEAK_ID = "110";
	public static final String SLEAZY_BACK_ALLEY_ID = "112";
	public static final String HAUNTED_PANTRY_ID = "113";
	public static final String OUTSKIRTS_OF_THE_KNOB_ID = "114";
	public static final String OASIS_ID = "122";
	public static final int THEMTHAR_HILLS = 126;
	public static final int FRAT_UNIFORM_BATTLEFIELD = 132;
	public static final String FRAT_UNIFORM_BATTLEFIELD_ID = "132";
	public static final int HAIKU_DUNGEON = 138;
	public static final int HIPPY_UNIFORM_BATTLEFIELD = 140;
	public static final String HIPPY_UNIFORM_BATTLEFIELD_ID = "140";
	public static final int FCLE = 158;
	public static final String POOP_DECK_ID = "159";
	public static final int YULETIDE = 163;
	public static final String HOBOPOLIS_SEWERS_ID = "166";
	public static final int HOBOPOLIS_TOWN_SQUARE = 167;
	public static final String MINE_OFFICE_ID = "176";
	public static final int JUNKYARD_BARREL = 182;
	public static final String JUNKYARD_BARREL_ID = "182";
	public static final int JUNKYARD_REFRIGERATOR = 183;
	public static final String JUNKYARD_REFRIGERATOR_ID = "183";
	public static final int JUNKYARD_TIRES = 184;
	public static final String JUNKYARD_TIRES_ID = "184";
	public static final int JUNKYARD_CAR = 185;
	public static final String JUNKYARD_CAR_ID = "185";
	public static final String MARINARA_TRENCH_ID = "195";
	public static final String ANENOME_MINE_ID = "196";
	public static final String DIVE_BAR_ID = "197";
	public static final String MERKIN_OUTPOST_ID = "198";
	public static final int SEASIDE_MEGALOPOLIS = 206;
	public static final int MERKIN_COLOSSEUM = 210;
	public static final String MERKIN_COLOSSEUM_ID = "210";
	public static final int BROODLING_GROUNDS = 214;
	public static final int OUTER_COMPOUND = 215;
	public static final int TEMPLE_PORTICO = 217;
	public static final int CONVENTION_HALL_LOBBY = 218;
	public static final int OUTSIDE_THE_CLUB = 219;
	public static final int ISLAND_BARRACKS = 220;
	public static final int BARROOM_BRAWL = 233;
	public static final int NOOB_CAVE = 240;
	public static final int PANDAMONIUM_SLUMS = 248;
	public static final int COBB_BARRACKS = 257;
	public static final int COBB_HAREM = 259;
	public static final int DEFILED_ALCOVE = 261;
	public static final int DEFILED_CRANNY = 262;
	public static final int DEFILED_NICHE = 263;
	public static final int DEFILED_NOOK = 264;
	public static final int ITZNOTYERZITZ_MINE = 270;
	public static final String ITZNOTYERZITZ_MINE_ID = "270";
	public static final String GOATLET_ID = "271";
	public static final int NINJA_SNOWMEN = 272;
	public static final String NINJA_SNOWMEN_ID = "272";
	public static final int EXTREME_SLOPE = 273;
	public static final String EXTREME_SLOPE_ID = "273";
	public static final int CLUMSINESS_GROVE = 277;
	public static final int MAELSTROM_OF_LOVERS = 278;
	public static final int GLACIER_OF_JERKS = 279;
	public static final String HIDDEN_TEMPLE_ID = "280";
	public static final String SHROUDED_PEAK_ID = "cloudypeak2";
	public static final String ABOO_PEAK_ID = "296";
	public static final String OIL_PEAK_ID = "298";
	public static final String CASTLE_BASEMENT_ID = "322";
	public static final String CASTLE_GROUND_ID = "323";
	public static final String CASTLE_TOP_ID = "324";
	public static final int THE_DAILY_DUNGEON = 325;
	public static final String THE_DAILY_DUNGEON_ID = "325";
	public static final int THE_HALLOWED_HALLS = 326;
	public static final int SHOP_CLASS = 327;
	public static final int CHEMISTRY_CLASS = 328;
	public static final int ART_CLASS = 329;
	public static final String EDGE_OF_THE_SWAMP_ID = "330";
	public static final String DARK_AND_SPOOKY_SWAMP_ID = "331";
	public static final String CORPSE_BOG_ID = "332";
	public static final String RUINED_WIZARDS_TOWER_ID = "333";
	public static final String WILDLIFE_SANCTUARRRRRGH_ID = "334";
	public static final String SWAMP_BEAVER_TERRITORY_ID = "335";
	public static final String WEIRD_SWAMP_VILLAGE_ID = "336";
	public static final String CALIGINOUS_ABYSS_ID = "337";
	public static final int HIDDEN_APARTMENT = 341;
	public static final String HIDDEN_APARTMENT_ID = "341";
	public static final int HIDDEN_HOSPITAL = 342;
	public static final String HIDDEN_HOSPITAL_ID = "342";
	public static final int HIDDEN_OFFICE = 343;
	public static final String HIDDEN_OFFICE_ID = "343";
	public static final int HIDDEN_BOWLING_ALLEY = 344;
	public static final String HIDDEN_BOWLING_ALLEY_ID = "344";
	public static final int HIDDEN_PARK = 345;
	public static final String HIDDEN_PARK_ID = "345";
	public static final int DEGRASSI_KNOLL_GARAGE = 354;
	public static final String THE_SHORE_ID = "355";
	public static final int THE_SHORE = 355;
	public static final int ARID_DESERT = 364;
	public static final String ARID_DESERT_ID = "364";
	public static final int WARBEAR_FORTRESS_LEVEL_THREE = 368;
	public static final int YE_OLDE_MEDIEVALE_VILLAGEE = 380;
	public static final int HAUNTED_KITCHEN = 388;
	public static final int ZEPPELIN_PROTESTORS = 384;
	public static final String ZEPPELIN_PROTESTORS_ID = "384";
	public static final int RED_ZEPPELIN = 385;
	public static final String RED_ZEPPELIN_ID = "385";
	public static final int PALINDOME = 386;
	public static final String PALINDOME_ID = "386";
	public static final String HAUNTED_KITCHEN_ID = "388";
	public static final int HAUNTED_CONSERVATORY = 389;
	public static final String HAUNTED_CONSERVATORY_ID = "389";
	public static final String HAUNTED_LIBRARY_ID = "390";
	public static final String HAUNTED_BILLIARDS_ROOM_ID = "391";
	public static final String HAUNTED_BATHROOM_ID = "392";
	public static final String HAUNTED_BEDROOM_ID = "393";
	public static final String HAUNTED_GALLERY_ID = "394";
	public static final String HAUNTED_BALLROOM_ID = "395";
	public static final String HAUNTED_LABORATORY_ID = "396";
	public static final String HAUNTED_NURSERY_ID = "397";
	public static final String HAUNTED_STORAGE_ROOM_ID = "398";
	public static final String HAUNTED_BOILER_ROOM_ID = "399";
	public static final String HAUNTED_LAUNDRY_ROOM_ID = "400";
	public static final String HAUNTED_WINE_CELLAR_ID = "401";
	public static final String FUN_GUY_MANSION_ID = "402";
	public static final int SLOPPY_SECONDS_DINER = 403;
	public static final String SLOPPY_SECONDS_DINER_ID = "403";
	public static final String YACHT_ID = "404";
	public static final int BLACK_FOREST = 405;
	public static final String UPPER_CHAMBER_ID = "406";
	public static final String MIDDLE_CHAMBER_ID = "407";
	public static final String LOWER_CHAMBER_ID = "pyramid_state";
	public static final String SUMMONING_CHAMBER_ID = "manor4_chamber";
	public static final int DR_WEIRDEAUX = 415;
	public static final String DR_WEIRDEAUX_ID = "415";
	public static final int SECRET_GOVERNMENT_LAB = 416;
	public static final String SECRET_GOVERNMENT_LAB_ID = "416";
	public static final int DEEP_DARK_JUNGLE = 417;
	public static final String DEEP_DARK_JUNGLE_ID = "417";
	public static final int POST_MALL = 418;
	public static final String THE_MINES_ID = "424";
	public static final String THE_JUNGLE_ID = "425";
	public static final String THE_ICE_CAVES_ID = "426";
	public static final String THE_TEMPLE_RUINS_ID = "427";
	public static final String THE_SNAKE_PIT_ID = "429";
	public static final String THE_SPIDER_HOLE_ID = "430";
	public static final String THE_ANCIENT_BURIAL_GROUND_ID = "431";
	public static final String THE_BEEHIVE_ID = "432";
	public static final String THE_CRASHED_UFO_ID = "433";
	public static final String THE_CITY_OF_GOOOOLD_ID = "434";
	public static final int BARF_MOUNTAIN = 442;
	public static final String BARF_MOUNTAIN_ID = "442";
	public static final int GARBAGE_BARGES = 443;
	public static final String GARBAGE_BARGES_ID = "443";
	public static final int TOXIC_TEACUPS = 444;
	public static final String TOXIC_TEACUPS_ID = "444";
	public static final int LIQUID_WASTE_SLUICE = 445;
	public static final String LIQUID_WASTE_SLUICE_ID = "445";
	public static final int SMOOCH_ARMY_HQ = 448;
	public static final String SMOOCH_ARMY_HQ_ID = "448";
	public static final int VELVET_GOLD_MINE = 449;
	public static final String VELVET_GOLD_MINE_ID = "449";
	public static final int LAVACO_LAMP_FACTORY = 450;
	public static final String LAVACO_LAMP_FACTORY_ID = "450";
	public static final int BUBBLIN_CALDERA = 451;
	public static final String BUBBLIN_CALDERA_ID = "451";
}
