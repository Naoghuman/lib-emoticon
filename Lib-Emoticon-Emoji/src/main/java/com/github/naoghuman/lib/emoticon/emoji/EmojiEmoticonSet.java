/*
 * Copyright (C) 2017 Naoghuman
 *
 * This program is free software" you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http"//www.gnu.org/licenses/>.
 */
package com.github.naoghuman.lib.emoticon.emoji;

import java.util.Optional;

import com.github.naoghuman.lib.emoticon.core.Emoticon;
import com.github.naoghuman.lib.emoticon.core.EmoticonBuilder;
import com.github.naoghuman.lib.emoticon.core.EmoticonSet;
import com.github.naoghuman.lib.emoticon.emoji.images.EmojiEmoticonLoader;

/**
 *
 *
 * @author Naoghuman
 */
public final class EmojiEmoticonSet extends EmoticonSet implements EmojiEmoticonCategory {

    // START NATURE #######################################################
    /**
     * The <code>nature emoticon <b>sunny</b></code>.
     */
    public static final Emoticon NA_SUNNY = EmoticonBuilder.create().title("sunny").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>umbrella</b></code>.
     */
    public static final Emoticon NA_UMBRELLA = EmoticonBuilder.create().title("umbrella").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cloud</b></code>.
     */
    public static final Emoticon NA_CLOUD = EmoticonBuilder.create().title("cloud").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>snowflake</b></code>.
     */
    public static final Emoticon NA_SNOWFLAKE = EmoticonBuilder.create().title("snowflake").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>snowman</b></code>.
     */
    public static final Emoticon NA_SNOWMAN = EmoticonBuilder.create().title("snowman").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>zap</b></code>.
     */
    public static final Emoticon NA_ZAP = EmoticonBuilder.create().title("zap").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cyclone</b></code>.
     */
    public static final Emoticon NA_CYCLONE = EmoticonBuilder.create().title("cyclone").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>foggy</b></code>.
     */
    public static final Emoticon NA_FOGGY = EmoticonBuilder.create().title("foggy").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>ocean</b></code>.
     */
    public static final Emoticon NA_OCEAN = EmoticonBuilder.create().title("ocean").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cat</b></code>.
     */
    public static final Emoticon NA_CAT = EmoticonBuilder.create().title("cat").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>dog</b></code>.
     */
    public static final Emoticon NA_DOG = EmoticonBuilder.create().title("dog").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>mouse</b></code>.
     */
    public static final Emoticon NA_MOUSE = EmoticonBuilder.create().title("mouse").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>hamster</b></code>.
     */
    public static final Emoticon NA_HAMSTER = EmoticonBuilder.create().title("hamster").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>rabbit</b></code>.
     */
    public static final Emoticon NA_RABBIT = EmoticonBuilder.create().title("rabbit").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>wolf</b></code>.
     */
    public static final Emoticon NA_WOLF = EmoticonBuilder.create().title("wolf").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>frog</b></code>.
     */
    public static final Emoticon NA_FROG = EmoticonBuilder.create().title("frog").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>tiger</b></code>.
     */
    public static final Emoticon NA_TIGER = EmoticonBuilder.create().title("tiger").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>koala</b></code>.
     */
    public static final Emoticon NA_KOALA = EmoticonBuilder.create().title("koala").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>bear</b></code>.
     */
    public static final Emoticon NA_BEAR = EmoticonBuilder.create().title("bear").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>pig</b></code>.
     */
    public static final Emoticon NA_PIG = EmoticonBuilder.create().title("pig").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>pig_nose</b></code>.
     */
    public static final Emoticon NA_PIG_NOSE = EmoticonBuilder.create().title("pig_nose").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cow</b></code>.
     */
    public static final Emoticon NA_COW = EmoticonBuilder.create().title("cow").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>boar</b></code>.
     */
    public static final Emoticon NA_BOAR = EmoticonBuilder.create().title("boar").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>monkey_face</b></code>.
     */
    public static final Emoticon NA_MONKEY_FACE = EmoticonBuilder.create().title("monkey_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>monkey</b></code>.
     */
    public static final Emoticon NA_MONKEY = EmoticonBuilder.create().title("monkey").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>horse</b></code>.
     */
    public static final Emoticon NA_HORSE = EmoticonBuilder.create().title("horse").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>racehorse</b></code>.
     */
    public static final Emoticon NA_RACEHORSE = EmoticonBuilder.create().title("racehorse").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>camel</b></code>.
     */
    public static final Emoticon NA_CAMEL = EmoticonBuilder.create().title("camel").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>sheep</b></code>.
     */
    public static final Emoticon NA_SHEEP = EmoticonBuilder.create().title("sheep").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>elephant</b></code>.
     */
    public static final Emoticon NA_ELEPHANT = EmoticonBuilder.create().title("elephant").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>panda_face</b></code>.
     */
    public static final Emoticon NA_PANDA_FACE = EmoticonBuilder.create().title("panda_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>snake</b></code>.
     */
    public static final Emoticon NA_SNAKE = EmoticonBuilder.create().title("snake").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>bird</b></code>.
     */
    public static final Emoticon NA_BIRD = EmoticonBuilder.create().title("bird").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>baby_chick</b></code>.
     */
    public static final Emoticon NA_BABY_CHICK = EmoticonBuilder.create().title("baby_chick").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>hatched_chick</b></code>.
     */
    public static final Emoticon NA_HATCHED_CHICK = EmoticonBuilder.create().title("hatched_chick").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>hatching_chick</b></code>.
     */
    public static final Emoticon NA_HATCHING_CHICK = EmoticonBuilder.create().title("hatching_chick").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>chicken</b></code>.
     */
    public static final Emoticon NA_CHICKEN = EmoticonBuilder.create().title("chicken").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>penguin</b></code>.
     */
    public static final Emoticon NA_PENGUIN = EmoticonBuilder.create().title("penguin").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>turtle</b></code>.
     */
    public static final Emoticon NA_TURTLE = EmoticonBuilder.create().title("turtle").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>bug</b></code>.
     */
    public static final Emoticon NA_BUG = EmoticonBuilder.create().title("bug").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>honeybee</b></code>.
     */
    public static final Emoticon NA_HONEYBEE = EmoticonBuilder.create().title("honeybee").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>ant</b></code>.
     */
    public static final Emoticon NA_ANT = EmoticonBuilder.create().title("ant").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>beetle</b></code>.
     */
    public static final Emoticon NA_BEETLE = EmoticonBuilder.create().title("beetle").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>snail</b></code>.
     */
    public static final Emoticon NA_SNAIL = EmoticonBuilder.create().title("snail").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>octopus</b></code>.
     */
    public static final Emoticon NA_OCTOPUS = EmoticonBuilder.create().title("octopus").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>tropical_fish</b></code>.
     */
    public static final Emoticon NA_TROPICAL_FISH = EmoticonBuilder.create().title("tropical_fish").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>fish</b></code>.
     */
    public static final Emoticon NA_FISH = EmoticonBuilder.create().title("fish").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>whale</b></code>.
     */
    public static final Emoticon NA_WHALE = EmoticonBuilder.create().title("whale").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>whale2</b></code>.
     */
    public static final Emoticon NA_WHALE2 = EmoticonBuilder.create().title("whale2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>dolphin</b></code>.
     */
    public static final Emoticon NA_DOLPHIN = EmoticonBuilder.create().title("dolphin").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cow2</b></code>.
     */
    public static final Emoticon NA_COW2 = EmoticonBuilder.create().title("cow2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>ram</b></code>.
     */
    public static final Emoticon NA_RAM = EmoticonBuilder.create().title("ram").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>rat</b></code>.
     */
    public static final Emoticon NA_RAT = EmoticonBuilder.create().title("rat").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>water_buffalo</b></code>.
     */
    public static final Emoticon NA_WATER_BUFFALO = EmoticonBuilder.create().title("water_buffalo").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>tiger2</b></code>.
     */
    public static final Emoticon NA_TIGER2 = EmoticonBuilder.create().title("tiger2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>rabbit2</b></code>.
     */
    public static final Emoticon NA_RABBIT2 = EmoticonBuilder.create().title("rabbit2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>dragon</b></code>.
     */
    public static final Emoticon NA_DRAGON = EmoticonBuilder.create().title("dragon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>goat</b></code>.
     */
    public static final Emoticon NA_GOAT = EmoticonBuilder.create().title("goat").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>rooster</b></code>.
     */
    public static final Emoticon NA_ROOSTER = EmoticonBuilder.create().title("rooster").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>dog2</b></code>.
     */
    public static final Emoticon NA_DOG2 = EmoticonBuilder.create().title("dog2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>pig2</b></code>.
     */
    public static final Emoticon NA_PIG2 = EmoticonBuilder.create().title("pig2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>mouse2</b></code>.
     */
    public static final Emoticon NA_MOUSE2 = EmoticonBuilder.create().title("mouse2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>ox</b></code>.
     */
    public static final Emoticon NA_OX = EmoticonBuilder.create().title("ox").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>dragon_face</b></code>.
     */
    public static final Emoticon NA_DRAGON_FACE = EmoticonBuilder.create().title("dragon_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>blowfish</b></code>.
     */
    public static final Emoticon NA_BLOWFISH = EmoticonBuilder.create().title("blowfish").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>crocodile</b></code>.
     */
    public static final Emoticon NA_CROCODILE = EmoticonBuilder.create().title("crocodile").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>dromedary_camel</b></code>.
     */
    public static final Emoticon NA_DROMEDARY_CAMEL = EmoticonBuilder.create().title("dromedary_camel").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>leopard</b></code>.
     */
    public static final Emoticon NA_LEOPARD = EmoticonBuilder.create().title("leopard").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cat2</b></code>.
     */
    public static final Emoticon NA_CAT2 = EmoticonBuilder.create().title("cat2").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>poodle</b></code>.
     */
    public static final Emoticon NA_POODLE = EmoticonBuilder.create().title("poodle").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>paw_prints</b></code>.
     */
    public static final Emoticon NA_PAW_PRINTS = EmoticonBuilder.create().title("paw_prints").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>bouquet</b></code>.
     */
    public static final Emoticon NA_BOUQUET = EmoticonBuilder.create().title("bouquet").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cherry_blossom</b></code>.
     */
    public static final Emoticon NA_CHERRY_BLOSSOM = EmoticonBuilder.create().title("cherry_blossom").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>tulip</b></code>.
     */
    public static final Emoticon NA_TULIP = EmoticonBuilder.create().title("tulip").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>four_leaf_clover</b></code>.
     */
    public static final Emoticon NA_FOUR_LEAF_CLOVER = EmoticonBuilder.create().title("four_leaf_clover").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>rose</b></code>.
     */
    public static final Emoticon NA_ROSE = EmoticonBuilder.create().title("rose").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>sunflower</b></code>.
     */
    public static final Emoticon NA_SUNFLOWER = EmoticonBuilder.create().title("sunflower").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>hibiscus</b></code>.
     */
    public static final Emoticon NA_HIBISUS = EmoticonBuilder.create().title("hibiscus").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>maple_leaf</b></code>.
     */
    public static final Emoticon NA_MAPLE_LEAF = EmoticonBuilder.create().title("maple_leaf").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>leaves</b></code>.
     */
    public static final Emoticon NA_LEAVES = EmoticonBuilder.create().title("leaves").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>fallen_leaf</b></code>.
     */
    public static final Emoticon NA_FALLEN_LEAF = EmoticonBuilder.create().title("fallen_leaf").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>herb</b></code>.
     */
    public static final Emoticon NA_HERB = EmoticonBuilder.create().title("herb").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>mushroom</b></code>.
     */
    public static final Emoticon NA_MUSHROOM = EmoticonBuilder.create().title("mushroom").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>cactus</b></code>.
     */
    public static final Emoticon NA_CACTUS = EmoticonBuilder.create().title("cactus").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>palm_tree</b></code>.
     */
    public static final Emoticon NA_PALM_TREE = EmoticonBuilder.create().title("palm_tree").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>evergreen_tree</b></code>.
     */
    public static final Emoticon NA_EVERGREEN_TREE = EmoticonBuilder.create().title("evergreen_tree").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>deciduous_tree</b></code>.
     */
    public static final Emoticon NA_DECIDUOUS_TREE = EmoticonBuilder.create().title("deciduous_tree").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>chestnut</b></code>.
     */
    public static final Emoticon NA_CHESTNUT = EmoticonBuilder.create().title("chestnut").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>seedling</b></code>.
     */
    public static final Emoticon NA_SEEDLING = EmoticonBuilder.create().title("seedling").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>blossom</b></code>.
     */
    public static final Emoticon NA_BLOSSOM = EmoticonBuilder.create().title("blossom").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>ear_of_rice</b></code>.
     */
    public static final Emoticon NA_EAR_OF_RICE = EmoticonBuilder.create().title("ear_of_rice").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>shell</b></code>.
     */
    public static final Emoticon NA_SHELL = EmoticonBuilder.create().title("shell").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>globe_with_meridians</b></code>.
     */
    public static final Emoticon NA_GLOBE_WITH_MERIDIANS = EmoticonBuilder.create().title("globe_with_meridians").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>sun_with_face</b></code>.
     */
    public static final Emoticon NA_SUN_WITH_FACE = EmoticonBuilder.create().title("sun_with_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>full_moon_with_face</b></code>.
     */
    public static final Emoticon NA_FULL_MOON_WITH_FACE = EmoticonBuilder.create().title("full_moon_with_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>new_moon_with_face</b></code>.
     */
    public static final Emoticon NA_NEW_MOON_WITH_FACE = EmoticonBuilder.create().title("new_moon_with_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>new_moon</b></code>.
     */
    public static final Emoticon NA_NEW_MOON = EmoticonBuilder.create().title("new_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>waxing_crescent_moon</b></code>.
     */
    public static final Emoticon NA_WAXING_CRESENT_MOON = EmoticonBuilder.create().title("waxing_crescent_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>first_quarter_moon</b></code>.
     */
    public static final Emoticon NA_FIRST_QUARTER_MOON = EmoticonBuilder.create().title("first_quarter_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>waxing_gibbous_moon</b></code>.
     */
    public static final Emoticon NA_WAXING_GIBBOUS_MOON = EmoticonBuilder.create().title("waxing_gibbous_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>full_moon</b></code>.
     */
    public static final Emoticon NA_FULL_MOON = EmoticonBuilder.create().title("full_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>waning_gibbous_moon</b></code>.
     */
    public static final Emoticon NA_WANING_GIBBOUS_MOON = EmoticonBuilder.create().title("waning_gibbous_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>last_quarter_moon</b></code>.
     */
    public static final Emoticon NA_LAST_QUARTER_MOON = EmoticonBuilder.create().title("last_quarter_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>waning_crescent_moon</b></code>.
     */
    public static final Emoticon NA_WANING_CRESCENT_MOON = EmoticonBuilder.create().title("waning_crescent_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>last_quarter_moon_with_face</b></code>.
     */
    public static final Emoticon NA_LAST_QUARTER_MOON_WITH_FACE = EmoticonBuilder.create().title("last_quarter_moon_with_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>first_quarter_moon_with_face</b></code>.
     */
    public static final Emoticon NA_FIRST_QUARTER_MOON_WITH_FACE = EmoticonBuilder.create().title("first_quarter_moon_with_face").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>crescent_moon</b></code>.
     */
    public static final Emoticon NA_CRESCENT_MOON = EmoticonBuilder.create().title("crescent_moon").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>earth_africa</b></code>.
     */
    public static final Emoticon NA_EARTH_AFRICA = EmoticonBuilder.create().title("earth_africa").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>earth_americas</b></code>.
     */
    public static final Emoticon NA_EARTH_AMERICAS = EmoticonBuilder.create().title("earth_americas").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>earth_asia</b></code>.
     */
    public static final Emoticon NA_EARTH_ASIA = EmoticonBuilder.create().title("earth_asia").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>volcano</b></code>.
     */
    public static final Emoticon NA_VOCANO = EmoticonBuilder.create().title("volcano").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>milky_way</b></code>.
     */
    public static final Emoticon NA_MILKY_WAY = EmoticonBuilder.create().title("milky_way").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>partly_sunny</b></code>.
     */
    public static final Emoticon NA_PARTLY_SUNNY = EmoticonBuilder.create().title("partly_sunny").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>octocat</b></code>.
     */
    public static final Emoticon NA_OCTOCAT = EmoticonBuilder.create().title("octocat").category(NATURE).build(); // NOI18N

    /**
     * The <code>nature emoticon <b>squirrel</b></code>.
     */
    public static final Emoticon NA_SQUIRREL = EmoticonBuilder.create().title("squirrel").category(NATURE).build(); // NOI18N
    // END NATURE #########################################################

    // START OBJECTS ##########################################################
    /**
     * The <code>objects emoticon <b>bamboo</b></code>.
     */
    public static final Emoticon OB_BAMBOO = EmoticonBuilder.create().title("bamboo").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>gift_heart</b></code>.
     */
    public static final Emoticon OB_GIFT_HEART = EmoticonBuilder.create().title("gift_heart").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>dolls</b></code>.
     */
    public static final Emoticon OB_DOLLS = EmoticonBuilder.create().title("dolls").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>school_satchel</b></code>.
     */
    public static final Emoticon OB_SCHOOL_SATCHEL = EmoticonBuilder.create().title("school_satchel").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mortar_board</b></code>.
     */
    public static final Emoticon OB_MORTAR_BOARD = EmoticonBuilder.create().title("mortar_board").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>flags</b></code>.
     */
    public static final Emoticon OB_FLAGS = EmoticonBuilder.create().title("flags").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fireworks</b></code>.
     */
    public static final Emoticon OB_FIREWORKS = EmoticonBuilder.create().title("fireworks").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>sparkler</b></code>.
     */
    public static final Emoticon OB_SPARKLER = EmoticonBuilder.create().title("sparkler").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>wind_chime</b></code>.
     */
    public static final Emoticon OB_WIND_CHIME = EmoticonBuilder.create().title("wind_chime").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>rice_scene</b></code>.
     */
    public static final Emoticon OB_RICE_SCENE = EmoticonBuilder.create().title("rice_scene").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>jack_o_lantern</b></code>.
     */
    public static final Emoticon OB_JACK_O_LANTERN = EmoticonBuilder.create().title("jack_o_lantern").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ghost</b></code>.
     */
    public static final Emoticon OB_GHOST = EmoticonBuilder.create().title("ghost").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>santa</b></code>.
     */
    public static final Emoticon OB_SANTA = EmoticonBuilder.create().title("santa").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>christmas_tree</b></code>.
     */
    public static final Emoticon OB_CHRISTMAS_TREE = EmoticonBuilder.create().title("christmas_tree").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>gift</b></code>.
     */
    public static final Emoticon OB_GIFT = EmoticonBuilder.create().title("gift").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bell</b></code>.
     */
    public static final Emoticon OB_BELL = EmoticonBuilder.create().title("bell").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>no_bell</b></code>.
     */
    public static final Emoticon OB_NO_BELL = EmoticonBuilder.create().title("no_bell").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tanabata_tree</b></code>.
     */
    public static final Emoticon OB_TANABATA_TREE = EmoticonBuilder.create().title("tanabata_tree").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tada</b></code>.
     */
    public static final Emoticon OB_TADA = EmoticonBuilder.create().title("tada").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>confetti_ball</b></code>.
     */
    public static final Emoticon OB_CONFETTI_BALL = EmoticonBuilder.create().title("confetti_ball").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>balloon</b></code>.
     */
    public static final Emoticon OB_BALLOON = EmoticonBuilder.create().title("balloon").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>crystal_ball</b></code>.
     */
    public static final Emoticon OB_CRYSTAL_BALL = EmoticonBuilder.create().title("crystal_ball").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>cd</b></code>.
     */
    public static final Emoticon OB_CD = EmoticonBuilder.create().title("cd").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>dvd</b></code>.
     */
    public static final Emoticon OB_DVD = EmoticonBuilder.create().title("dvd").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>floppy_disk</b></code>.
     */
    public static final Emoticon OB_FLOPPY_DISK = EmoticonBuilder.create().title("floppy_disk").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>camera</b></code>.
     */
    public static final Emoticon OB_CAMERA = EmoticonBuilder.create().title("camera").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>video_camera</b></code>.
     */
    public static final Emoticon OB_VIDEO_CAMERA = EmoticonBuilder.create().title("video_camera").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>movie_camera</b></code>.
     */
    public static final Emoticon OB_MOVIE_CAMERA = EmoticonBuilder.create().title("movie_camera").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>computer</b></code>.
     */
    public static final Emoticon OB_COMPUTER = EmoticonBuilder.create().title("computer").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tv</b></code>.
     */
    public static final Emoticon OB_TV = EmoticonBuilder.create().title("tv").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>iphone</b></code>.
     */
    public static final Emoticon OB_IPHONE = EmoticonBuilder.create().title("iphone").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>phone</b></code>.
     */
    public static final Emoticon OB_PHONE = EmoticonBuilder.create().title("phone").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>telephone</b></code>.
     */
    public static final Emoticon OB_TELEPHONE = EmoticonBuilder.create().title("telephone").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>telephone_receiver</b></code>.
     */
    public static final Emoticon OB_TELEPHONE_RECEIVER = EmoticonBuilder.create().title("telephone_receiver").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pager</b></code>.
     */
    public static final Emoticon OB_PAGER = EmoticonBuilder.create().title("pager").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fax</b></code>.
     */
    public static final Emoticon OB_FAX = EmoticonBuilder.create().title("fax").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>minidisc</b></code>.
     */
    public static final Emoticon OB_MINIDISC = EmoticonBuilder.create().title("minidisc").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>vhs</b></code>.
     */
    public static final Emoticon OB_VHS = EmoticonBuilder.create().title("vhs").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>sound</b></code>.
     */
    public static final Emoticon OB_SOUND = EmoticonBuilder.create().title("sound").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>speaker</b></code>.
     */
    public static final Emoticon OB_SPEAKER = EmoticonBuilder.create().title("speaker").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mute</b></code>.
     */
    public static final Emoticon OB_MUTE = EmoticonBuilder.create().title("mute").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>loudspeaker</b></code>.
     */
    public static final Emoticon OB_LOUDSPEAKER = EmoticonBuilder.create().title("loudspeaker").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mega</b></code>.
     */
    public static final Emoticon OB_MEGA = EmoticonBuilder.create().title("mega").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>hourglass</b></code>.
     */
    public static final Emoticon OB_HOURGLASS = EmoticonBuilder.create().title("hourglass").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>hourglass_flowing_sand</b></code>.
     */
    public static final Emoticon OB_HOURGLASS_FLOWING_SAND = EmoticonBuilder.create().title("hourglass_flowing_sand").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>alarm_clock</b></code>.
     */
    public static final Emoticon OB_ALARM_CLOCK = EmoticonBuilder.create().title("alarm_clock").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>watch</b></code>.
     */
    public static final Emoticon OB_WATCH = EmoticonBuilder.create().title("watch").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>radio</b></code>.
     */
    public static final Emoticon OB_RADIO = EmoticonBuilder.create().title("radio").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>satellite</b></code>.
     */
    public static final Emoticon OB_SATELLITE = EmoticonBuilder.create().title("satellite").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>loop</b></code>.
     */
    public static final Emoticon OB_LOOP = EmoticonBuilder.create().title("loop").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mag</b></code>.
     */
    public static final Emoticon OB_MAG = EmoticonBuilder.create().title("mag").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mag_right</b></code>.
     */
    public static final Emoticon OB_MAG_RIGHT = EmoticonBuilder.create().title("mag_right").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>unlock</b></code>.
     */
    public static final Emoticon OB_UNLOCK = EmoticonBuilder.create().title("unlock").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>lock</b></code>.
     */
    public static final Emoticon OB_LOCK = EmoticonBuilder.create().title("lock").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>lock_with_ink_pen</b></code>.
     */
    public static final Emoticon OB_LOCK_WITH_INK_PEN = EmoticonBuilder.create().title("lock_with_ink_pen").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>closed_lock_with_key</b></code>.
     */
    public static final Emoticon OB_CLOSED_LOCK_WITH_KEY = EmoticonBuilder.create().title("closed_lock_with_key").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>key</b></code>.
     */
    public static final Emoticon OB_KEY = EmoticonBuilder.create().title("key").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bulb</b></code>.
     */
    public static final Emoticon OB_BULB = EmoticonBuilder.create().title("bulb").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>flashlight</b></code>.
     */
    public static final Emoticon OB_FLASHLIGHT = EmoticonBuilder.create().title("flashlight").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>high_brightness</b></code>.
     */
    public static final Emoticon OB_HIGH_BRIGHTNESS = EmoticonBuilder.create().title("high_brightness").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>low_brightness</b></code>.
     */
    public static final Emoticon OB_LOW_BRIGHTNESS = EmoticonBuilder.create().title("low_brightness").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>electric_plug</b></code>.
     */
    public static final Emoticon OB_ELECTRIC_PLUG = EmoticonBuilder.create().title("electric_plug").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>battery</b></code>.
     */
    public static final Emoticon OB_BATTERY = EmoticonBuilder.create().title("battery").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>calling</b></code>.
     */
    public static final Emoticon OB_CALLING = EmoticonBuilder.create().title("calling").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>email</b></code>.
     */
    public static final Emoticon OB_EMAIL = EmoticonBuilder.create().title("email").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mailbox</b></code>.
     */
    public static final Emoticon OB_MAILBOX = EmoticonBuilder.create().title("mailbox").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>postbox</b></code>.
     */
    public static final Emoticon OB_POSTBOX = EmoticonBuilder.create().title("postbox").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bath</b></code>.
     */
    public static final Emoticon OB_BATH = EmoticonBuilder.create().title("bath").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bathtub</b></code>.
     */
    public static final Emoticon OB_BATHTUB = EmoticonBuilder.create().title("bathtub").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>shower</b></code>.
     */
    public static final Emoticon OB_SHOWER = EmoticonBuilder.create().title("shower").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>toilet</b></code>.
     */
    public static final Emoticon OB_TOILET = EmoticonBuilder.create().title("toilet").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>wrench</b></code>.
     */
    public static final Emoticon OB_WRENCH = EmoticonBuilder.create().title("wrench").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>nut_and_bolt</b></code>.
     */
    public static final Emoticon OB_NUT_AND_BOLT = EmoticonBuilder.create().title("nut_and_bolt").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>hammer</b></code>.
     */
    public static final Emoticon OB_HAMMER = EmoticonBuilder.create().title("hammer").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>seat</b></code>.
     */
    public static final Emoticon OB_SEAT = EmoticonBuilder.create().title("seat").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>moneybag</b></code>.
     */
    public static final Emoticon OB_MONEYBAG = EmoticonBuilder.create().title("moneybag").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>yen</b></code>.
     */
    public static final Emoticon OB_YEN = EmoticonBuilder.create().title("yen").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>dollar</b></code>.
     */
    public static final Emoticon OB_DOLLAR = EmoticonBuilder.create().title("dollar").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pound</b></code>.
     */
    public static final Emoticon OB_POUND = EmoticonBuilder.create().title("pound").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>euro</b></code>.
     */
    public static final Emoticon OB_EURO = EmoticonBuilder.create().title("euro").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>credit_card</b></code>.
     */
    public static final Emoticon OB_CREDIT_CARD = EmoticonBuilder.create().title("credit_card").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>money_with_wings</b></code>.
     */
    public static final Emoticon OB_MONEY_WITH_WINGS = EmoticonBuilder.create().title("money_with_wings").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>e-mail</b></code>.
     */
    public static final Emoticon OB_E_MAIL = EmoticonBuilder.create().title("e-mail").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>inbox_tray</b></code>.
     */
    public static final Emoticon OB_INBOX_TRAY = EmoticonBuilder.create().title("inbox_tray").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>outbox_tray</b></code>.
     */
    public static final Emoticon OB_OUTBOX_TRAY = EmoticonBuilder.create().title("outbox_tray").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>envelope</b></code>.
     */
    public static final Emoticon OB_ENVELOPE = EmoticonBuilder.create().title("envelope").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>incoming_envelope</b></code>.
     */
    public static final Emoticon OB_INCOMING_ENVELOPE = EmoticonBuilder.create().title("incoming_envelope").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>postal_horn</b></code>.
     */
    public static final Emoticon OB_POSTAL_HORN = EmoticonBuilder.create().title("postal_horn").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mailbox_closed</b></code>.
     */
    public static final Emoticon OB_MAILBOX_CLOSED = EmoticonBuilder.create().title("mailbox_closed").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mailbox_with_mail</b></code>.
     */
    public static final Emoticon OB_MAILBOX_WITH_MAIL = EmoticonBuilder.create().title("mailbox_with_mail").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mailbox_with_no_mail</b></code>.
     */
    public static final Emoticon OB_MAILBOX_WITH_NO_MAIL = EmoticonBuilder.create().title("mailbox_with_no_mail").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>package</b></code>.
     */
    public static final Emoticon OB_PACKAGE = EmoticonBuilder.create().title("package").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>door</b></code>.
     */
    public static final Emoticon OB_DOOR = EmoticonBuilder.create().title("door").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>smoking</b></code>.
     */
    public static final Emoticon OB_SMOKING = EmoticonBuilder.create().title("smoking").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bomb</b></code>.
     */
    public static final Emoticon OB_BOMB = EmoticonBuilder.create().title("bomb").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>gun</b></code>.
     */
    public static final Emoticon OB_GUN = EmoticonBuilder.create().title("gun").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>hocho</b></code>.
     */
    public static final Emoticon OB_HOCHO = EmoticonBuilder.create().title("hocho").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pill</b></code>.
     */
    public static final Emoticon OB_PILL = EmoticonBuilder.create().title("pill").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>syringe</b></code>.
     */
    public static final Emoticon OB_SYRINGE = EmoticonBuilder.create().title("syringe").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>page_facing_up</b></code>.
     */
    public static final Emoticon OB_PAGE_FACING_UP = EmoticonBuilder.create().title("page_facing_up").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>page_with_curl</b></code>.
     */
    public static final Emoticon OB_PAGE_WITH_CURL = EmoticonBuilder.create().title("page_with_curl").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bookmark_tabs</b></code>.
     */
    public static final Emoticon OB_BOOKMARK_TABS = EmoticonBuilder.create().title("bookmark_tabs").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bar_chart</b></code>.
     */
    public static final Emoticon OB_BAR_CHART = EmoticonBuilder.create().title("bar_chart").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>chart_with_upwards_trend</b></code>.
     */
    public static final Emoticon OB_CHART_WITH_UPWARDS_TREND = EmoticonBuilder.create().title("chart_with_upwards_trend").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>chart_with_downwards_trend</b></code>.
     */
    public static final Emoticon OB_CHART_WITH_DOWNWARDS_TREND = EmoticonBuilder.create().title("chart_with_downwards_trend").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>scroll</b></code>.
     */
    public static final Emoticon OB_SCROLL = EmoticonBuilder.create().title("scroll").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>clipboard</b></code>.
     */
    public static final Emoticon OB_CLIPBOARD = EmoticonBuilder.create().title("clipboard").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>calendar</b></code>.
     */
    public static final Emoticon OB_CALENDAR = EmoticonBuilder.create().title("calendar").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>date</b></code>.
     */
    public static final Emoticon OB_DATE = EmoticonBuilder.create().title("date").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>card_index</b></code>.
     */
    public static final Emoticon OB_CARD_INDEX = EmoticonBuilder.create().title("card_index").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>file_folder</b></code>.
     */
    public static final Emoticon OB_FILE_FOLDER = EmoticonBuilder.create().title("file_folder").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>open_file_folder</b></code>.
     */
    public static final Emoticon OB_OPEN_FILE_FOLDER = EmoticonBuilder.create().title("open_file_folder").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>scissors</b></code>.
     */
    public static final Emoticon OB_SCISSORS = EmoticonBuilder.create().title("scissors").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pushpin</b></code>.
     */
    public static final Emoticon OB_PUSHPIN = EmoticonBuilder.create().title("pushpin").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>paperclip</b></code>.
     */
    public static final Emoticon OB_PAPERCLIP = EmoticonBuilder.create().title("paperclip").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>black_nib</b></code>.
     */
    public static final Emoticon OB_BLACK_NIB = EmoticonBuilder.create().title("black_nib").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pencil2</b></code>.
     */
    public static final Emoticon OB_PENCIL2 = EmoticonBuilder.create().title("pencil2").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>straight_ruler</b></code>.
     */
    public static final Emoticon OB_STRAIGHT_RULER = EmoticonBuilder.create().title("straight_ruler").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>triangular_ruler</b></code>.
     */
    public static final Emoticon OB_TRIANGULAR_RULER = EmoticonBuilder.create().title("triangular_ruler").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>closed_book</b></code>.
     */
    public static final Emoticon OB_CLOSED_BOOK = EmoticonBuilder.create().title("closed_book").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>green_book</b></code>.
     */
    public static final Emoticon OB_GREEN_BOOK = EmoticonBuilder.create().title("green_book").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>blue_book</b></code>.
     */
    public static final Emoticon OB_BLUE_BOOK = EmoticonBuilder.create().title("blue_book").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>orange_book</b></code>.
     */
    public static final Emoticon OB_ORANGE_BOOK = EmoticonBuilder.create().title("orange_book").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>notebook</b></code>.
     */
    public static final Emoticon OB_NOTEBOOK = EmoticonBuilder.create().title("notebook").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>notebook_with_decorative_cover</b></code>.
     */
    public static final Emoticon OB_NOTEBOOK_WITH_DECORATIVE_COVER = EmoticonBuilder.create().title("notebook_with_decorative_cover").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ledger</b></code>.
     */
    public static final Emoticon OB_LEDGER = EmoticonBuilder.create().title("ledger").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>books</b></code>.
     */
    public static final Emoticon OB_BOOKS = EmoticonBuilder.create().title("books").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bookmark</b></code>.
     */
    public static final Emoticon OB_BOOKMARK = EmoticonBuilder.create().title("bookmark").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>name_badge</b></code>.
     */
    public static final Emoticon OB_NAME_BADGE = EmoticonBuilder.create().title("name_badge").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>microscope</b></code>.
     */
    public static final Emoticon OB_MICROSCOPE = EmoticonBuilder.create().title("microscope").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>telescope</b></code>.
     */
    public static final Emoticon OB_TELESCOPE = EmoticonBuilder.create().title("telescope").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>newspaper</b></code>.
     */
    public static final Emoticon OB_NEWSPAPER = EmoticonBuilder.create().title("newspaper").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>football</b></code>.
     */
    public static final Emoticon OB_FOOTBALL = EmoticonBuilder.create().title("football").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>basketball</b></code>.
     */
    public static final Emoticon OB_BASKETBALL = EmoticonBuilder.create().title("basketball").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>soccer</b></code>.
     */
    public static final Emoticon OB_SOCCER = EmoticonBuilder.create().title("soccer").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>baseball</b></code>.
     */
    public static final Emoticon OB_BASEBALL = EmoticonBuilder.create().title("baseball").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tennis</b></code>.
     */
    public static final Emoticon OB_TENNIS = EmoticonBuilder.create().title("tennis").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>8ball</b></code>.
     */
    public static final Emoticon OB_8BALL = EmoticonBuilder.create().title("8ball").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>rugby_football</b></code>.
     */
    public static final Emoticon OB_RUGBY_FOOTBALL = EmoticonBuilder.create().title("rugby_football").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bowling</b></code>.
     */
    public static final Emoticon OB_BOWLING = EmoticonBuilder.create().title("bowling").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>golf</b></code>.
     */
    public static final Emoticon OB_GOLF = EmoticonBuilder.create().title("golf").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mountain_bicyclist</b></code>.
     */
    public static final Emoticon OB_MOUNTAIN_BICYCLIST = EmoticonBuilder.create().title("mountain_bicyclist").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bicyclist</b></code>.
     */
    public static final Emoticon OB_BICYCLIST = EmoticonBuilder.create().title("bicyclist").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>horse_racing</b></code>.
     */
    public static final Emoticon OB_HORSE_RACING = EmoticonBuilder.create().title("horse_racing").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>snowboarder</b></code>.
     */
    public static final Emoticon OB_SNOWBOARDER = EmoticonBuilder.create().title("snowboarder").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>swimmer</b></code>.
     */
    public static final Emoticon OB_SWIMMER = EmoticonBuilder.create().title("swimmer").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>surfer</b></code>.
     */
    public static final Emoticon OB_SURFER = EmoticonBuilder.create().title("surfer").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ski</b></code>.
     */
    public static final Emoticon OB_SKI = EmoticonBuilder.create().title("ski").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>spades</b></code>.
     */
    public static final Emoticon OB_SPADES = EmoticonBuilder.create().title("spades").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>hearts</b></code>.
     */
    public static final Emoticon OB_HEARTS = EmoticonBuilder.create().title("hearts").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>clubs</b></code>.
     */
    public static final Emoticon OB_CLUBS = EmoticonBuilder.create().title("clubs").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>diamonds</b></code>.
     */
    public static final Emoticon OB_DIAMONDS = EmoticonBuilder.create().title("diamonds").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>gem</b></code>.
     */
    public static final Emoticon OB_GEM = EmoticonBuilder.create().title("gem").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ring</b></code>.
     */
    public static final Emoticon OB_RING = EmoticonBuilder.create().title("ring").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>trophy</b></code>.
     */
    public static final Emoticon OB_TROPHY = EmoticonBuilder.create().title("trophy").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>musical_score</b></code>.
     */
    public static final Emoticon OB_MUSICAL_SCORE = EmoticonBuilder.create().title("musical_score").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>musical_keyboard</b></code>.
     */
    public static final Emoticon OB_MUSICAL_KEYBOARD = EmoticonBuilder.create().title("musical_keyboard").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>violin</b></code>.
     */
    public static final Emoticon OB_VIOLIN = EmoticonBuilder.create().title("violin").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>space_invader</b></code>.
     */
    public static final Emoticon OB_SPACE_INVADER = EmoticonBuilder.create().title("space_invader").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>video_game</b></code>.
     */
    public static final Emoticon OB_VIDEO_GAME = EmoticonBuilder.create().title("video_game").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>black_joker</b></code>.
     */
    public static final Emoticon OB_BLACK_JOKER = EmoticonBuilder.create().title("black_joker").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>flower_playing_cards</b></code>.
     */
    public static final Emoticon OB_FLOWER_PLAYING_CARDS = EmoticonBuilder.create().title("flower_playing_cards").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>game_die</b></code>.
     */
    public static final Emoticon OB_GAME_DIE = EmoticonBuilder.create().title("game_die").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>dart</b></code>.
     */
    public static final Emoticon OB_DART = EmoticonBuilder.create().title("dart").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mahjong</b></code>.
     */
    public static final Emoticon OB_MAHJONG = EmoticonBuilder.create().title("mahjong").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>clapper</b></code>.
     */
    public static final Emoticon OB_CLAPPER = EmoticonBuilder.create().title("clapper").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>memo</b></code>.
     */
    public static final Emoticon OB_MEMO = EmoticonBuilder.create().title("memo").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pencil</b></code>.
     */
    public static final Emoticon OB_PENCIL = EmoticonBuilder.create().title("pencil").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>book</b></code>.
     */
    public static final Emoticon OB_BOOK = EmoticonBuilder.create().title("book").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>art</b></code>.
     */
    public static final Emoticon OB_ART = EmoticonBuilder.create().title("art").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>microphone</b></code>.
     */
    public static final Emoticon OB_MICROPHONE = EmoticonBuilder.create().title("microphone").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>headphones</b></code>.
     */
    public static final Emoticon OB_HEADPHONES = EmoticonBuilder.create().title("headphones").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>trumpet</b></code>.
     */
    public static final Emoticon OB_TRUMPET = EmoticonBuilder.create().title("trumpet").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>saxophone</b></code>.
     */
    public static final Emoticon OB_SAXOPHONE = EmoticonBuilder.create().title("saxophone").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>guitar</b></code>.
     */
    public static final Emoticon OB_GUITAR = EmoticonBuilder.create().title("guitar").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>shoe</b></code>.
     */
    public static final Emoticon OB_SHOE = EmoticonBuilder.create().title("shoe").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>sandal</b></code>.
     */
    public static final Emoticon OB_SANDAL = EmoticonBuilder.create().title("sandal").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>high_heel</b></code>.
     */
    public static final Emoticon OB_HIGH_HEEL = EmoticonBuilder.create().title("high_heel").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>lipstick</b></code>.
     */
    public static final Emoticon OB_LIPSTICK = EmoticonBuilder.create().title("lipstick").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>boot</b></code>.
     */
    public static final Emoticon OB_BOOT = EmoticonBuilder.create().title("boot").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>shirt</b></code>.
     */
    public static final Emoticon OB_SHIRT = EmoticonBuilder.create().title("shirt").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tshirt</b></code>.
     */
    public static final Emoticon OB_TSHIRT = EmoticonBuilder.create().title("tshirt").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>necktie</b></code>.
     */
    public static final Emoticon OB_NECKTIE = EmoticonBuilder.create().title("necktie").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>womans_clothes</b></code>.
     */
    public static final Emoticon OB_WOMANS_CLOTHES = EmoticonBuilder.create().title("womans_clothes").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>dress</b></code>.
     */
    public static final Emoticon OB_DRESS = EmoticonBuilder.create().title("dress").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>running_shirt_with_sash</b></code>.
     */
    public static final Emoticon OB_RUNNING_SHIRT_WITH_SASH = EmoticonBuilder.create().title("running_shirt_with_sash").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>jeans</b></code>.
     */
    public static final Emoticon OB_JEANS = EmoticonBuilder.create().title("jeans").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>kimono</b></code>.
     */
    public static final Emoticon OB_KIMONO = EmoticonBuilder.create().title("kimono").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bikini</b></code>.
     */
    public static final Emoticon OB_BIKINI = EmoticonBuilder.create().title("bikini").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ribbon</b></code>.
     */
    public static final Emoticon OB_RIBBON = EmoticonBuilder.create().title("ribbon").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tophat</b></code>.
     */
    public static final Emoticon OB_TOPHAT = EmoticonBuilder.create().title("tophat").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>crown</b></code>.
     */
    public static final Emoticon OB_CROWN = EmoticonBuilder.create().title("crown").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>womans_hat</b></code>.
     */
    public static final Emoticon OB_WOMANS_HAT = EmoticonBuilder.create().title("womans_hat").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>mans_shoe</b></code>.
     */
    public static final Emoticon OB_MANS_SHOE = EmoticonBuilder.create().title("mans_shoe").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>closed_umbrella</b></code>.
     */
    public static final Emoticon OB_CLOSED_UMBRELLA = EmoticonBuilder.create().title("closed_umbrella").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>briefcase</b></code>.
     */
    public static final Emoticon OB_BRIEFCASE = EmoticonBuilder.create().title("briefcase").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>handbag</b></code>.
     */
    public static final Emoticon OB_HANDBAG = EmoticonBuilder.create().title("handbag").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pouch</b></code>.
     */
    public static final Emoticon OB_POUCH = EmoticonBuilder.create().title("pouch").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>purse</b></code>.
     */
    public static final Emoticon OB_PURSE = EmoticonBuilder.create().title("purse").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>eyeglasses</b></code>.
     */
    public static final Emoticon OB_EYEGLASSES = EmoticonBuilder.create().title("eyeglasses").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fishing_pole_and_fish</b></code>.
     */
    public static final Emoticon OB_FISHING_POLE_AND_FISH = EmoticonBuilder.create().title("fishing_pole_and_fish").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>coffee</b></code>.
     */
    public static final Emoticon OB_COFFEE = EmoticonBuilder.create().title("coffee").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tea</b></code>.
     */
    public static final Emoticon OB_TEA = EmoticonBuilder.create().title("tea").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>sake</b></code>.
     */
    public static final Emoticon OB_SAKE = EmoticonBuilder.create().title("sake").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>baby_bottle</b></code>.
     */
    public static final Emoticon OB_BABY_BOTTLE = EmoticonBuilder.create().title("baby_bottle").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>beer</b></code>.
     */
    public static final Emoticon OB_BEER = EmoticonBuilder.create().title("beer").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>beers</b></code>.
     */
    public static final Emoticon OB_BEERS = EmoticonBuilder.create().title("beers").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>cocktail</b></code>.
     */
    public static final Emoticon OB_COCKTAIL = EmoticonBuilder.create().title("cocktail").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tropical_drink</b></code>.
     */
    public static final Emoticon OB_TROPICAL_DRINK = EmoticonBuilder.create().title("tropical_drink").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>wine_glass</b></code>.
     */
    public static final Emoticon OB_WINE_GLASS = EmoticonBuilder.create().title("wine_glass").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fork_and_knife</b></code>.
     */
    public static final Emoticon OB_FORK_AND_KNIFE = EmoticonBuilder.create().title("fork_and_knife").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pizza</b></code>.
     */
    public static final Emoticon OB_PIZZA = EmoticonBuilder.create().title("pizza").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>hamburger</b></code>.
     */
    public static final Emoticon OB_HAMBURGER = EmoticonBuilder.create().title("hamburger").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fries</b></code>.
     */
    public static final Emoticon OB_FRIES = EmoticonBuilder.create().title("fries").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>poultry_leg</b></code>.
     */
    public static final Emoticon OB_POULTRY_LEG = EmoticonBuilder.create().title("poultry_leg").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>meat_on_bone</b></code>.
     */
    public static final Emoticon OB_MEAT_ON_BONE = EmoticonBuilder.create().title("meat_on_bone").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>spaghetti</b></code>.
     */
    public static final Emoticon OB_SPAGHETTI = EmoticonBuilder.create().title("spaghetti").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>curry</b></code>.
     */
    public static final Emoticon OB_CURRY = EmoticonBuilder.create().title("curry").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fried_shrimp</b></code>.
     */
    public static final Emoticon OB_FRIED_SHRIMP = EmoticonBuilder.create().title("fried_shrimp").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bento</b></code>.
     */
    public static final Emoticon OB_BENTO = EmoticonBuilder.create().title("bento").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>sushi</b></code>.
     */
    public static final Emoticon OB_SUSHI = EmoticonBuilder.create().title("sushi").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>fish_cake</b></code>.
     */
    public static final Emoticon OB_FISH_CAKE = EmoticonBuilder.create().title("fish_cake").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>rice_ball</b></code>.
     */
    public static final Emoticon OB_RICE_BALL = EmoticonBuilder.create().title("rice_ball").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>rice_cracker</b></code>.
     */
    public static final Emoticon OB_RICE_CRACKER = EmoticonBuilder.create().title("rice_cracker").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>rice</b></code>.
     */
    public static final Emoticon OB_RICE = EmoticonBuilder.create().title("rice").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ramen</b></code>.
     */
    public static final Emoticon OB_RAMEN = EmoticonBuilder.create().title("ramen").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>stew</b></code>.
     */
    public static final Emoticon OB_STEW = EmoticonBuilder.create().title("stew").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>oden</b></code>.
     */
    public static final Emoticon OB_ODEN = EmoticonBuilder.create().title("oden").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>dango</b></code>.
     */
    public static final Emoticon OB_DANGO = EmoticonBuilder.create().title("dango").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>egg</b></code>.
     */
    public static final Emoticon OB_EGG = EmoticonBuilder.create().title("egg").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>bread</b></code>.
     */
    public static final Emoticon OB_BREAD = EmoticonBuilder.create().title("bread").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>doughnut</b></code>.
     */
    public static final Emoticon OB_DOUGHNUT = EmoticonBuilder.create().title("doughnut").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>custard</b></code>.
     */
    public static final Emoticon OB_CUSTARD = EmoticonBuilder.create().title("custard").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>icecream</b></code>.
     */
    public static final Emoticon OB_ICECREAM = EmoticonBuilder.create().title("icecream").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>ice_cream</b></code>.
     */
    public static final Emoticon OB_ICE_CREAM = EmoticonBuilder.create().title("ice_cream").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>shaved_ice</b></code>.
     */
    public static final Emoticon OB_SHAVED_ICE = EmoticonBuilder.create().title("shaved_ice").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>birthday</b></code>.
     */
    public static final Emoticon OB_BIRTHDAY = EmoticonBuilder.create().title("birthday").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>cake</b></code>.
     */
    public static final Emoticon OB_CAKE = EmoticonBuilder.create().title("cake").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>cookie</b></code>.
     */
    public static final Emoticon OB_COOKIE = EmoticonBuilder.create().title("cookie").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>chocolate_bar</b></code>.
     */
    public static final Emoticon OB_CHOCOLATE_BAR = EmoticonBuilder.create().title("chocolate_bar").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>candy</b></code>.
     */
    public static final Emoticon OB_CANDY = EmoticonBuilder.create().title("candy").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>lollipop</b></code>.
     */
    public static final Emoticon OB_LOLLIPOP = EmoticonBuilder.create().title("lollipop").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>honey_pot</b></code>.
     */
    public static final Emoticon OB_HONEY_POT = EmoticonBuilder.create().title("honey_pot").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>apple</b></code>.
     */
    public static final Emoticon OB_APPLE = EmoticonBuilder.create().title("apple").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>green_apple</b></code>.
     */
    public static final Emoticon OB_GREEN_APPLE = EmoticonBuilder.create().title("green_apple").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tangerine</b></code>.
     */
    public static final Emoticon OB_TANGERINE = EmoticonBuilder.create().title("tangerine").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>lemon</b></code>.
     */
    public static final Emoticon OB_LEMON = EmoticonBuilder.create().title("lemon").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>cherries</b></code>.
     */
    public static final Emoticon OB_CHERRIES = EmoticonBuilder.create().title("cherries").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>grapes</b></code>.
     */
    public static final Emoticon OB_GRAPES = EmoticonBuilder.create().title("grapes").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>watermelon</b></code>.
     */
    public static final Emoticon OB_WATERMELON = EmoticonBuilder.create().title("watermelon").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>strawberry</b></code>.
     */
    public static final Emoticon OB_STRAWBERRY = EmoticonBuilder.create().title("strawberry").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>peach</b></code>.
     */
    public static final Emoticon OB_PEACH = EmoticonBuilder.create().title("peach").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>melon</b></code>.
     */
    public static final Emoticon OB_MELON = EmoticonBuilder.create().title("melon").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>banana</b></code>.
     */
    public static final Emoticon OB_BANANA = EmoticonBuilder.create().title("banana").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pear</b></code>.
     */
    public static final Emoticon OB_PEAR = EmoticonBuilder.create().title("pear").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>pineapple</b></code>.
     */
    public static final Emoticon OB_PINEAPPLE = EmoticonBuilder.create().title("pineapple").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>sweet_potato</b></code>.
     */
    public static final Emoticon OB_SWEET_POTATO = EmoticonBuilder.create().title("sweet_potato").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>eggplant</b></code>.
     */
    public static final Emoticon OB_EGGPLANT = EmoticonBuilder.create().title("eggplant").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>tomato</b></code>.
     */
    public static final Emoticon OB_TOMATO = EmoticonBuilder.create().title("tomato").category(OBJECTS).build(); // NOI18N

    /**
     * The <code>objects emoticon <b>corn</b></code>.
     */
    public static final Emoticon OB_CORN = EmoticonBuilder.create().title("corn").category(OBJECTS).build(); // NOI18N
    // END OBJECTS ############################################################

    // START PEOPLE ###########################################################
    /**
     * The <code>people emoticon <b>bowtie</b></code>.
     */
    public static final Emoticon PE_BOWTIE = EmoticonBuilder.create().title("bowtie").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smile</b></code>.
     */
    public static final Emoticon PE_SMILE = EmoticonBuilder.create().title("smile").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>simple_smile</b></code>.
     */
    public static final Emoticon PE_SIMPLE_SMILE = EmoticonBuilder.create().title("simple_smile").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>laughing</b></code>.
     */
    public static final Emoticon PE_LAUGHING = EmoticonBuilder.create().title("laughing").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>blush</b></code>.
     */
    public static final Emoticon PE_BLUSH = EmoticonBuilder.create().title("blush").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smiley</b></code>.
     */
    public static final Emoticon PE_SMILEY = EmoticonBuilder.create().title("smiley").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>relaxed</b></code>.
     */
    public static final Emoticon PE_RELAXED = EmoticonBuilder.create().title("relaxed").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smirk</b></code>.
     */
    public static final Emoticon PE_SMIRK = EmoticonBuilder.create().title("smirk").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>heart_eyes</b></code>.
     */
    public static final Emoticon PE_HEART_EYES = EmoticonBuilder.create().title("heart_eyes").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>kissing_heart</b></code>.
     */
    public static final Emoticon PE_KISSING_HEART = EmoticonBuilder.create().title("kissing_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>kissing_closed_eyes</b></code>.
     */
    public static final Emoticon PE_KISSING_CLOSED_EYES = EmoticonBuilder.create().title("kissing_closed_eyes").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>flushed</b></code>.
     */
    public static final Emoticon PE_FLUSHED = EmoticonBuilder.create().title("flushed").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>relieved</b></code>.
     */
    public static final Emoticon PE_RELIEVED = EmoticonBuilder.create().title("relieved").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>satisfied</b></code>.
     */
    public static final Emoticon PE_SATISFIED = EmoticonBuilder.create().title("satisfied").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>grin</b></code>.
     */
    public static final Emoticon PE_GRIN = EmoticonBuilder.create().title("grin").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>wink</b></code>.
     */
    public static final Emoticon PE_WINK = EmoticonBuilder.create().title("wink").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>stuck_out_tongue_winking_eye</b></code>.
     */
    public static final Emoticon PE_STUCK_OUT_TONGUE_WINING_EYE = EmoticonBuilder.create().title("stuck_out_tongue_winking_eye").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>stuck_out_tongue_closed_eyes</b></code>.
     */
    public static final Emoticon PE_STUCK_OUT_TONGUE_CLOSED_EYES = EmoticonBuilder.create().title("stuck_out_tongue_closed_eyes").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>grinning</b></code>.
     */
    public static final Emoticon PE_GRINNING = EmoticonBuilder.create().title("grinning").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>kissing</b></code>.
     */
    public static final Emoticon PE_KISSING = EmoticonBuilder.create().title("kissing").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>kissing_smiling_eyes</b></code>.
     */
    public static final Emoticon PE_KISSING_SMILING_EYES = EmoticonBuilder.create().title("kissing_smiling_eyes").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>stuck_out_tongue</b></code>.
     */
    public static final Emoticon PE_STUCK_OUT_TONGUE = EmoticonBuilder.create().title("stuck_out_tongue").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sleeping</b></code>.
     */
    public static final Emoticon PE_SLEEPING = EmoticonBuilder.create().title("sleeping").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>worried</b></code>.
     */
    public static final Emoticon PE_WORRIED = EmoticonBuilder.create().title("worried").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>frowning</b></code>.
     */
    public static final Emoticon PE_FROWING = EmoticonBuilder.create().title("frowning").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>anguished</b></code>.
     */
    public static final Emoticon PE_ANGUISHED = EmoticonBuilder.create().title("anguished").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>open_mouth</b></code>.
     */
    public static final Emoticon PE_OPEN_MOUTH = EmoticonBuilder.create().title("open_mouth").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>grimacing</b></code>.
     */
    public static final Emoticon PE_GRIMACING = EmoticonBuilder.create().title("grimacing").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>confused</b></code>.
     */
    public static final Emoticon PE_CONFUSED = EmoticonBuilder.create().title("confused").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>hushed</b></code>.
     */
    public static final Emoticon PE_HUSHED = EmoticonBuilder.create().title("hushed").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>expressionless</b></code>.
     */
    public static final Emoticon PE_EXPRESSIONLESS = EmoticonBuilder.create().title("expressionless").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>unamused</b></code>.
     */
    public static final Emoticon PE_UNAMUSED = EmoticonBuilder.create().title("unamused").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sweat_smile</b></code>.
     */
    public static final Emoticon PE_SWEAT_SMILE = EmoticonBuilder.create().title("sweat_smile").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sweat</b></code>.
     */
    public static final Emoticon PE_SWEAT = EmoticonBuilder.create().title("sweat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>disappointed_relieved</b></code>.
     */
    public static final Emoticon PE_DISAPPOINTED_RELIEVED = EmoticonBuilder.create().title("disappointed_relieved").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>weary</b></code>.
     */
    public static final Emoticon PE_WEARY = EmoticonBuilder.create().title("weary").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>pensive</b></code>.
     */
    public static final Emoticon PE_PENSIVE = EmoticonBuilder.create().title("pensive").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>disappointed</b></code>.
     */
    public static final Emoticon PE_DISAPPOINTED = EmoticonBuilder.create().title("disappointed").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>confounded</b></code>.
     */
    public static final Emoticon PE_CONFOUNDED = EmoticonBuilder.create().title("confounded").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>fearful</b></code>.
     */
    public static final Emoticon PE_FEARFUL = EmoticonBuilder.create().title("fearful").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>cold_sweat</b></code>.
     */
    public static final Emoticon PE_COLD_SWEAT = EmoticonBuilder.create().title("cold_sweat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>persevere</b></code>.
     */
    public static final Emoticon PE_PERSEVERE = EmoticonBuilder.create().title("persevere").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>cry</b></code>.
     */
    public static final Emoticon PE_CRY = EmoticonBuilder.create().title("cry").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sob</b></code>.
     */
    public static final Emoticon PE_SOB = EmoticonBuilder.create().title("sob").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>joy</b></code>.
     */
    public static final Emoticon PE_JOY = EmoticonBuilder.create().title("joy").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>astonished</b></code>.
     */
    public static final Emoticon PE_ASTONISHED = EmoticonBuilder.create().title("astonished").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>scream</b></code>.
     */
    public static final Emoticon PE_SCREAM = EmoticonBuilder.create().title("scream").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>neckbeard</b></code>.
     */
    public static final Emoticon PE_NECKBEARD = EmoticonBuilder.create().title("neckbeard").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>tired_face</b></code>.
     */
    public static final Emoticon PE_TIRED_FACE = EmoticonBuilder.create().title("tired_face").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>angry</b></code>.
     */
    public static final Emoticon PE_ANGRY = EmoticonBuilder.create().title("angry").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>rage</b></code>.
     */
    public static final Emoticon PE_RAGE = EmoticonBuilder.create().title("rage").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>triumph</b></code>.
     */
    public static final Emoticon PE_TRIUMPH = EmoticonBuilder.create().title("triumph").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sleepy</b></code>.
     */
    public static final Emoticon PE_SLEEPY = EmoticonBuilder.create().title("sleepy").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>yum</b></code>.
     */
    public static final Emoticon PE_YUM = EmoticonBuilder.create().title("yum").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>mask</b></code>.
     */
    public static final Emoticon PE_MASK = EmoticonBuilder.create().title("mask").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sunglasses</b></code>.
     */
    public static final Emoticon PE_SUNGLASSES = EmoticonBuilder.create().title("sunglasses").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>dizzy_face</b></code>.
     */
    public static final Emoticon PE_DIZZY_FACE = EmoticonBuilder.create().title("dizzy_face").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>imp</b></code>.
     */
    public static final Emoticon PE_IMP = EmoticonBuilder.create().title("imp").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smiling_imp</b></code>.
     */
    public static final Emoticon PE_SMILING_IMP = EmoticonBuilder.create().title("smiling_imp").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>neutral_face</b></code>.
     */
    public static final Emoticon PE_NEUTRAL_FACE = EmoticonBuilder.create().title("neutral_face").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>no_mouth</b></code>.
     */
    public static final Emoticon PE_NO_MOUTH = EmoticonBuilder.create().title("no_mouth").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>innocent</b></code>.
     */
    public static final Emoticon PE_INNOCENT = EmoticonBuilder.create().title("innocent").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>alien</b></code>.
     */
    public static final Emoticon PE_ALIEN = EmoticonBuilder.create().title("alien").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>yellow_heart</b></code>.
     */
    public static final Emoticon PE_YELLOW_HEART = EmoticonBuilder.create().title("yellow_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>blue_heart</b></code>.
     */
    public static final Emoticon PE_BLUE_HEART = EmoticonBuilder.create().title("blue_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>purple_heart</b></code>.
     */
    public static final Emoticon PE_PURPLE_HEART = EmoticonBuilder.create().title("purple_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>heart</b></code>.
     */
    public static final Emoticon PE_HEART = EmoticonBuilder.create().title("heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>green_heart</b></code>.
     */
    public static final Emoticon PE_GREEN_HEART = EmoticonBuilder.create().title("green_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>broken_heart</b></code>.
     */
    public static final Emoticon PE_BROKEN_HEART = EmoticonBuilder.create().title("broken_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>heartbeat</b></code>.
     */
    public static final Emoticon PE_HEARTBEAT = EmoticonBuilder.create().title("heartbeat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>heartpulse</b></code>.
     */
    public static final Emoticon PE_HEARTPULSE = EmoticonBuilder.create().title("heartpulse").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>two_hearts</b></code>.
     */
    public static final Emoticon PE_TWO_HEARTS = EmoticonBuilder.create().title("two_hearts").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>revolving_hearts</b></code>.
     */
    public static final Emoticon PE_REVOLVING_HEARTS = EmoticonBuilder.create().title("revolving_hearts").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>cupid</b></code>.
     */
    public static final Emoticon PE_CUPID = EmoticonBuilder.create().title("cupid").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sparkling_heart</b></code>.
     */
    public static final Emoticon PE_SPARKLING_HEART = EmoticonBuilder.create().title("sparkling_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sparkles</b></code>.
     */
    public static final Emoticon PE_SPARKLES = EmoticonBuilder.create().title("sparkles").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>star</b></code>.
     */
    public static final Emoticon PE_STAR = EmoticonBuilder.create().title("star").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>star2</b></code>.
     */
    public static final Emoticon PE_STAR2 = EmoticonBuilder.create().title("star2").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>dizzy</b></code>.
     */
    public static final Emoticon PE_DIZZY = EmoticonBuilder.create().title("dizzy").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>boom</b></code>.
     */
    public static final Emoticon PE_BOOM = EmoticonBuilder.create().title("boom").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>collision</b></code>.
     */
    public static final Emoticon PE_COLLISION = EmoticonBuilder.create().title("collision").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>anger</b></code>.
     */
    public static final Emoticon PE_ANGER = EmoticonBuilder.create().title("anger").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>exclamation</b></code>.
     */
    public static final Emoticon PE_EXCLAMATION = EmoticonBuilder.create().title("exclamation").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>question</b></code>.
     */
    public static final Emoticon PE_QUESTION = EmoticonBuilder.create().title("question").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>grey_exclamation</b></code>.
     */
    public static final Emoticon PE_GREY_EXCLAMATION = EmoticonBuilder.create().title("grey_exclamation").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>grey_question</b></code>.
     */
    public static final Emoticon PE_GREY_QUESTION = EmoticonBuilder.create().title("grey_question").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>zzz</b></code>.
     */
    public static final Emoticon PE_ZZZ = EmoticonBuilder.create().title("zzz").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>dash</b></code>.
     */
    public static final Emoticon PE_DASH = EmoticonBuilder.create().title("dash").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>sweat_drops</b></code>.
     */
    public static final Emoticon PE_SWEAT_DROPS = EmoticonBuilder.create().title("sweat_drops").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>notes</b></code>.
     */
    public static final Emoticon PE_NOTES = EmoticonBuilder.create().title("notes").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>musical_note</b></code>.
     */
    public static final Emoticon PE_MUSICAL_NOTE = EmoticonBuilder.create().title("musical_note").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>fire</b></code>.
     */
    public static final Emoticon PE_FIRE = EmoticonBuilder.create().title("fire").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>hankey</b></code>.
     */
    public static final Emoticon PE_HANKEY = EmoticonBuilder.create().title("hankey").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>poop</b></code>.
     */
    public static final Emoticon PE_POOP = EmoticonBuilder.create().title("poop").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>shit</b></code>.
     */
    public static final Emoticon PE_SHIT = EmoticonBuilder.create().title("shit").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>+1</b></code>.
     */
    public static final Emoticon PE_PLUS_1 = EmoticonBuilder.create().title("+1").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>thumbsup</b></code>.
     */
    public static final Emoticon PE_THUMBSUP = EmoticonBuilder.create().title("thumbsup").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>-1</b></code>.
     */
    public static final Emoticon PE_MINUS_1 = EmoticonBuilder.create().title("-1").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>thumbsdown</b></code>.
     */
    public static final Emoticon PE_THUMBSDOWN = EmoticonBuilder.create().title("thumbsdown").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>ok_hand</b></code>.
     */
    public static final Emoticon PE_OK_HAND = EmoticonBuilder.create().title("ok_hand").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>punch</b></code>.
     */
    public static final Emoticon PE_PUNCH = EmoticonBuilder.create().title("punch").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>facepunch</b></code>.
     */
    public static final Emoticon PE_FACEPUNCH = EmoticonBuilder.create().title("facepunch").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>fist</b></code>.
     */
    public static final Emoticon PE_FIST = EmoticonBuilder.create().title("fist").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>v</b></code>.
     */
    public static final Emoticon PE_V = EmoticonBuilder.create().title("v").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>wave</b></code>.
     */
    public static final Emoticon PE_WAVE = EmoticonBuilder.create().title("wave").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>hand</b></code>.
     */
    public static final Emoticon PE_HAND = EmoticonBuilder.create().title("hand").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>raised_hand</b></code>.
     */
    public static final Emoticon PE_RAISED_HAND = EmoticonBuilder.create().title("raised_hand").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>open_hands</b></code>.
     */
    public static final Emoticon PE_OPEN_HANDS = EmoticonBuilder.create().title("open_hands").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>point_up</b></code>.
     */
    public static final Emoticon PE_POINT_UP = EmoticonBuilder.create().title("point_up").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>point_down</b></code>.
     */
    public static final Emoticon PE_POINT_DOWN = EmoticonBuilder.create().title("point_down").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>point_left</b></code>.
     */
    public static final Emoticon PE_POINT_LEFT = EmoticonBuilder.create().title("point_left").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>point_right</b></code>.
     */
    public static final Emoticon PE_POINT_RIGHT = EmoticonBuilder.create().title("point_right").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>raised_hands</b></code>.
     */
    public static final Emoticon PE_RAISED_HANDS = EmoticonBuilder.create().title("raised_hands").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>pray</b></code>.
     */
    public static final Emoticon PE_PRAY = EmoticonBuilder.create().title("pray").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>point_up_2</b></code>.
     */
    public static final Emoticon PE_POINT_UP_2 = EmoticonBuilder.create().title("point_up_2").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>clap</b></code>.
     */
    public static final Emoticon PE_CLAP = EmoticonBuilder.create().title("clap").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>muscle</b></code>.
     */
    public static final Emoticon PE_MUSCLE = EmoticonBuilder.create().title("muscle").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>metal</b></code>.
     */
    public static final Emoticon PE_METAL = EmoticonBuilder.create().title("metal").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>fu</b></code>.
     */
    public static final Emoticon PE_FU = EmoticonBuilder.create().title("fu").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>runner</b></code>.
     */
    public static final Emoticon PE_RUNNER = EmoticonBuilder.create().title("runner").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>running</b></code>.
     */
    public static final Emoticon PE_RUNNING = EmoticonBuilder.create().title("running").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>couple</b></code>.
     */
    public static final Emoticon PE_COUPLE = EmoticonBuilder.create().title("couple").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>family</b></code>.
     */
    public static final Emoticon PE_FAMILY = EmoticonBuilder.create().title("family").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>two_men_holding_hands</b></code>.
     */
    public static final Emoticon PE_TWO_MEN_HOLDING_HANDS = EmoticonBuilder.create().title("two_men_holding_hands").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>two_women_holding_hands</b></code>.
     */
    public static final Emoticon PE_TWO_WOMEN_HOLDING_HANDS = EmoticonBuilder.create().title("two_women_holding_hands").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>dancer</b></code>.
     */
    public static final Emoticon PE_DANCER = EmoticonBuilder.create().title("dancer").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>dancers</b></code>.
     */
    public static final Emoticon PE_DANCERS = EmoticonBuilder.create().title("dancers").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>ok_woman</b></code>.
     */
    public static final Emoticon PE_OK_WOMAN = EmoticonBuilder.create().title("ok_woman").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>no_good</b></code>.
     */
    public static final Emoticon PE_NO_GOOD = EmoticonBuilder.create().title("no_good").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>information_desk_person</b></code>.
     */
    public static final Emoticon PE_INFORMATION_DESK_PERSON = EmoticonBuilder.create().title("information_desk_person").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>raising_hand</b></code>.
     */
    public static final Emoticon PE_RAISING_HAND = EmoticonBuilder.create().title("raising_hand").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>bride_with_veil</b></code>.
     */
    public static final Emoticon PE_BRIDE_WITH_VEIL = EmoticonBuilder.create().title("bride_with_veil").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>person_with_pouting_face</b></code>.
     */
    public static final Emoticon PE_PERSON_WITH_POUTING_FACE = EmoticonBuilder.create().title("person_with_pouting_face").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>person_frowning</b></code>.
     */
    public static final Emoticon PE_PERSON_FROWNING = EmoticonBuilder.create().title("person_frowning").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>bow</b></code>.
     */
    public static final Emoticon PE_BOW = EmoticonBuilder.create().title("bow").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>couplekiss</b></code>.
     */
    public static final Emoticon PE_COUPLEKISS = EmoticonBuilder.create().title("couplekiss").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>couple_with_heart</b></code>.
     */
    public static final Emoticon PE_COUPLE_WITH_HEART = EmoticonBuilder.create().title("couple_with_heart").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>massage</b></code>.
     */
    public static final Emoticon PE_MASSAGE = EmoticonBuilder.create().title("massage").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>haircut</b></code>.
     */
    public static final Emoticon PE_HAIRCUT = EmoticonBuilder.create().title("haircut").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>nail_care</b></code>.
     */
    public static final Emoticon PE_NAIL_CARE = EmoticonBuilder.create().title("nail_care").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>boy</b></code>.
     */
    public static final Emoticon PE_BOY = EmoticonBuilder.create().title("boy").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>girl</b></code>.
     */
    public static final Emoticon PE_GIRL = EmoticonBuilder.create().title("girl").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>woman</b></code>.
     */
    public static final Emoticon PE_WOMAN = EmoticonBuilder.create().title("woman").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>man</b></code>.
     */
    public static final Emoticon PE_MAN = EmoticonBuilder.create().title("man").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>baby</b></code>.
     */
    public static final Emoticon PE_BABY = EmoticonBuilder.create().title("baby").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>older_woman</b></code>.
     */
    public static final Emoticon PE_OLDER_WOMAN = EmoticonBuilder.create().title("older_woman").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>older_man</b></code>.
     */
    public static final Emoticon PE_OLDER_MAN = EmoticonBuilder.create().title("older_man").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>person_with_blond_hair</b></code>.
     */
    public static final Emoticon PE_PERSON_WITH_BLOND_HAIR = EmoticonBuilder.create().title("person_with_blond_hair").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>man_with_gua_pi_mao</b></code>.
     */
    public static final Emoticon PE_MAN_WITH_GUA_PI_MAO = EmoticonBuilder.create().title("man_with_gua_pi_mao").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>man_with_turban</b></code>.
     */
    public static final Emoticon PE_MAN_WITH_TURBAN = EmoticonBuilder.create().title("man_with_turban").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>construction_worker</b></code>.
     */
    public static final Emoticon PE_CONSTRUCTION_WORKER = EmoticonBuilder.create().title("construction_worker").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>cop</b></code>.
     */
    public static final Emoticon PE_COP = EmoticonBuilder.create().title("cop").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>angel</b></code>.
     */
    public static final Emoticon PE_ANGEL = EmoticonBuilder.create().title("angel").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>princess</b></code>.
     */
    public static final Emoticon PE_PRINCESS = EmoticonBuilder.create().title("princess").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smiley_cat</b></code>.
     */
    public static final Emoticon PE_SMILEY_CAT = EmoticonBuilder.create().title("smiley_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smile_cat</b></code>.
     */
    public static final Emoticon PE_SMILE_CAT = EmoticonBuilder.create().title("smile_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>heart_eyes_cat</b></code>.
     */
    public static final Emoticon PE_HEART_EYES_CAT = EmoticonBuilder.create().title("heart_eyes_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>kissing_cat</b></code>.
     */
    public static final Emoticon PE_KISSING_CAT = EmoticonBuilder.create().title("kissing_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>smirk_cat</b></code>.
     */
    public static final Emoticon PE_SMIRK_CAT = EmoticonBuilder.create().title("smirk_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>scream_cat</b></code>.
     */
    public static final Emoticon PE_SCREAM_CAT = EmoticonBuilder.create().title("scream_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>crying_cat_face</b></code>.
     */
    public static final Emoticon PE_CRYING_CAT_FACE = EmoticonBuilder.create().title("crying_cat_face").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>joy_cat</b></code>.
     */
    public static final Emoticon PE_JOY_CAT = EmoticonBuilder.create().title("joy_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>pouting_cat</b></code>.
     */
    public static final Emoticon PE_POUTING_CAT = EmoticonBuilder.create().title("pouting_cat").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>japanese_ogre</b></code>.
     */
    public static final Emoticon PE_JAPANESE_OGRE = EmoticonBuilder.create().title("japanese_ogre").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>japanese_goblin</b></code>.
     */
    public static final Emoticon PE_JAPANESE_GOBLIN = EmoticonBuilder.create().title("japanese_goblin").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>see_no_evil</b></code>.
     */
    public static final Emoticon PE_SEE_NO_EVIL = EmoticonBuilder.create().title("see_no_evil").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>hear_no_evil</b></code>.
     */
    public static final Emoticon PE_HEAR_NO_EVIL = EmoticonBuilder.create().title("hear_no_evil").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>speak_no_evil</b></code>.
     */
    public static final Emoticon PE_SPEAK_NO_EVIL = EmoticonBuilder.create().title("speak_no_evil").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>guardsman</b></code>.
     */
    public static final Emoticon PE_GUARDSMAN = EmoticonBuilder.create().title("guardsman").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>skull</b></code>.
     */
    public static final Emoticon PE_SKULL = EmoticonBuilder.create().title("skull").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>feet</b></code>.
     */
    public static final Emoticon PE_FEET = EmoticonBuilder.create().title("feet").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>lips</b></code>.
     */
    public static final Emoticon PE_LIPS = EmoticonBuilder.create().title("lips").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>kiss</b></code>.
     */
    public static final Emoticon PE_KISS = EmoticonBuilder.create().title("kiss").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>droplet</b></code>.
     */
    public static final Emoticon PE_DROPLET = EmoticonBuilder.create().title("droplet").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>ear</b></code>.
     */
    public static final Emoticon PE_EAR = EmoticonBuilder.create().title("ear").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>eyes</b></code>.
     */
    public static final Emoticon PE_EYES = EmoticonBuilder.create().title("eyes").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>nose</b></code>.
     */
    public static final Emoticon PE_NOSE = EmoticonBuilder.create().title("nose").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>tongue</b></code>.
     */
    public static final Emoticon PE_TONGUE = EmoticonBuilder.create().title("tongue").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>love_letter</b></code>.
     */
    public static final Emoticon PE_LOVE_LETTER = EmoticonBuilder.create().title("love_letter").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>bust_in_silhouette</b></code>.
     */
    public static final Emoticon PE_BUST_IN_SILHOUETTE = EmoticonBuilder.create().title("bust_in_silhouette").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>busts_in_silhouette</b></code>.
     */
    public static final Emoticon PE_BUSTS_IN_SILHOUETTE = EmoticonBuilder.create().title("busts_in_silhouette").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>speech_balloon</b></code>.
     */
    public static final Emoticon PE_SPEECH_BALLOON = EmoticonBuilder.create().title("speech_balloon").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>thought_balloon</b></code>.
     */
    public static final Emoticon PE_THOUGHT_BALLOON = EmoticonBuilder.create().title("thought_balloon").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>feelsgood</b></code>.
     */
    public static final Emoticon PE_FEELSGOOD = EmoticonBuilder.create().title("feelsgood").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>finnadie</b></code>.
     */
    public static final Emoticon PE_FINNADIE = EmoticonBuilder.create().title("finnadie").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>goberserk</b></code>.
     */
    public static final Emoticon PE_GOBERSERK = EmoticonBuilder.create().title("goberserk").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>godmode</b></code>.
     */
    public static final Emoticon PE_GODMODE = EmoticonBuilder.create().title("godmode").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>hurtrealbad</b></code>.
     */
    public static final Emoticon PE_HURTREALBAD = EmoticonBuilder.create().title("hurtrealbad").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>rage1</b></code>.
     */
    public static final Emoticon PE_RAGE1 = EmoticonBuilder.create().title("rage1").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>rage2</b></code>.
     */
    public static final Emoticon PE_RAGE2 = EmoticonBuilder.create().title("rage2").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>rage3</b></code>.
     */
    public static final Emoticon PE_RAGE3 = EmoticonBuilder.create().title("rage3").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>rage4</b></code>.
     */
    public static final Emoticon PE_RAGE4 = EmoticonBuilder.create().title("rage4").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>suspect</b></code>.
     */
    public static final Emoticon PE_SUSPECT = EmoticonBuilder.create().title("suspect").category(PEOPLE).build(); // NOI18N

    /**
     * The <code>people emoticon <b>trollface</b></code>.
     */
    public static final Emoticon PE_TROLLFACE = EmoticonBuilder.create().title("trollface").category(PEOPLE).build(); // NOI18N
    // END PEOPLE #############################################################

    // START PLACES ###########################################################
    /**
     * The <code>places emoticon <b>house</b></code>.
     */
    public static final Emoticon PL_HOUSE = EmoticonBuilder.create().title("house").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>house_with_garden</b></code>.
     */
    public static final Emoticon PL_HOUSE_WITH_GARDEN = EmoticonBuilder.create().title("house_with_garden").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>school</b></code>.
     */
    public static final Emoticon PL_SCHOOL = EmoticonBuilder.create().title("school").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>office</b></code>.
     */
    public static final Emoticon PL_OFFICE = EmoticonBuilder.create().title("office").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>post_office</b></code>.
     */
    public static final Emoticon PL_POST_OFFICE = EmoticonBuilder.create().title("post_office").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>hospital</b></code>.
     */
    public static final Emoticon PL_HOSPITAL = EmoticonBuilder.create().title("hospital").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>bank</b></code>.
     */
    public static final Emoticon PL_BANK = EmoticonBuilder.create().title("bank").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>convenience_store</b></code>.
     */
    public static final Emoticon PL_CONVENIENCE_STORE = EmoticonBuilder.create().title("convenience_store").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>love_hotel</b></code>.
     */
    public static final Emoticon PL_LOVE_HOTEL = EmoticonBuilder.create().title("love_hotel").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>hotel</b></code>.
     */
    public static final Emoticon PL_HOTEL = EmoticonBuilder.create().title("hotel").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>wedding</b></code>.
     */
    public static final Emoticon PL_WEDDING = EmoticonBuilder.create().title("wedding").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>church</b></code>.
     */
    public static final Emoticon PL_CHURCH = EmoticonBuilder.create().title("church").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>department_store</b></code>.
     */
    public static final Emoticon PL_DEPARTMENT_STORE = EmoticonBuilder.create().title("department_store").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>european_post_office</b></code>.
     */
    public static final Emoticon PL_EUROPEAN_POST_OFFICE = EmoticonBuilder.create().title("european_post_office").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>city_sunrise</b></code>.
     */
    public static final Emoticon PL_CITY_SUNRISE = EmoticonBuilder.create().title("city_sunrise").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>city_sunset</b></code>.
     */
    public static final Emoticon PL_CITY_SUNSET = EmoticonBuilder.create().title("city_sunset").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>japanese_castle</b></code>.
     */
    public static final Emoticon PL_JAPANESE_CASTLE = EmoticonBuilder.create().title("japanese_castle").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>european_castle</b></code>.
     */
    public static final Emoticon PL_EUROPEAN_CASTLE = EmoticonBuilder.create().title("european_castle").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>tent</b></code>.
     */
    public static final Emoticon PL_TENT = EmoticonBuilder.create().title("tent").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>factory</b></code>.
     */
    public static final Emoticon PL_FACTORY = EmoticonBuilder.create().title("factory").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>tokyo_tower</b></code>.
     */
    public static final Emoticon PL_TOKYO_TOWER = EmoticonBuilder.create().title("tokyo_tower").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>japan</b></code>.
     */
    public static final Emoticon PL_JAPAN = EmoticonBuilder.create().title("japan").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>mount_fuji</b></code>.
     */
    public static final Emoticon PL_MOUNT_FUJI = EmoticonBuilder.create().title("mount_fuji").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>sunrise_over_mountains</b></code>.
     */
    public static final Emoticon PL_SUNRISE_OVER_MOUNTAINS = EmoticonBuilder.create().title("sunrise_over_mountains").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>sunrise</b></code>.
     */
    public static final Emoticon PL_SUNRISE = EmoticonBuilder.create().title("sunrise").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>stars</b></code>.
     */
    public static final Emoticon PL_STARS = EmoticonBuilder.create().title("stars").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>statue_of_liberty</b></code>.
     */
    public static final Emoticon PL_STATUE_OF_LIBERTY = EmoticonBuilder.create().title("statue_of_liberty").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>bridge_at_night</b></code>.
     */
    public static final Emoticon PL_BRIDGE_AT_NIGHT = EmoticonBuilder.create().title("bridge_at_night").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>carousel_horse</b></code>.
     */
    public static final Emoticon PL_CAROUSEL_HORSE = EmoticonBuilder.create().title("carousel_horse").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>rainbow</b></code>.
     */
    public static final Emoticon PL_RAINBOW = EmoticonBuilder.create().title("rainbow").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>ferris_wheel</b></code>.
     */
    public static final Emoticon PL_FERRIS_WHEEL = EmoticonBuilder.create().title("ferris_wheel").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>fountain</b></code>.
     */
    public static final Emoticon PL_FOUNTAIN = EmoticonBuilder.create().title("fountain").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>roller_coaster</b></code>.
     */
    public static final Emoticon PL_ROLLER_COASTER = EmoticonBuilder.create().title("roller_coaster").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>ship</b></code>.
     */
    public static final Emoticon PL_SHIP = EmoticonBuilder.create().title("ship").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>speedboat</b></code>.
     */
    public static final Emoticon PL_SPEEDBOAT = EmoticonBuilder.create().title("speedboat").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>boat</b></code>.
     */
    public static final Emoticon PL_BOAT = EmoticonBuilder.create().title("boat").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>sailboat</b></code>.
     */
    public static final Emoticon PL_SAILBOAT = EmoticonBuilder.create().title("sailboat").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>rowboat</b></code>.
     */
    public static final Emoticon PL_ROWBOAT = EmoticonBuilder.create().title("rowboat").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>anchor</b></code>.
     */
    public static final Emoticon PL_ANCHOR = EmoticonBuilder.create().title("anchor").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>rocket</b></code>.
     */
    public static final Emoticon PL_ROCKET = EmoticonBuilder.create().title("rocket").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>airplane</b></code>.
     */
    public static final Emoticon PL_AIRPLANE = EmoticonBuilder.create().title("airplane").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>helicopter</b></code>.
     */
    public static final Emoticon PL_HELICOPTER = EmoticonBuilder.create().title("helicopter").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>steam_locomotive</b></code>.
     */
    public static final Emoticon PL_STEAM_LOCOMOTIVE = EmoticonBuilder.create().title("steam_locomotive").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>tram</b></code>.
     */
    public static final Emoticon PL_TRAM = EmoticonBuilder.create().title("tram").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>mountain_railway</b></code>.
     */
    public static final Emoticon PL_MOUNTAIN_RAILWAY = EmoticonBuilder.create().title("mountain_railway").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>bike</b></code>.
     */
    public static final Emoticon PL_BIKE = EmoticonBuilder.create().title("bike").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>aerial_tramway</b></code>.
     */
    public static final Emoticon PL_AERIAL_TRAMWAY = EmoticonBuilder.create().title("aerial_tramway").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>suspension_railway</b></code>.
     */
    public static final Emoticon PL_SUSPENSION_RAILWAY = EmoticonBuilder.create().title("suspension_railway").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>mountain_cableway</b></code>.
     */
    public static final Emoticon PL_MOUNTAIN_CABLEWAY = EmoticonBuilder.create().title("mountain_cableway").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>tractor</b></code>.
     */
    public static final Emoticon PL_TRACTOR = EmoticonBuilder.create().title("tractor").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>blue_car</b></code>.
     */
    public static final Emoticon PL_BLUE_CAR = EmoticonBuilder.create().title("blue_car").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>oncoming_automobile</b></code>.
     */
    public static final Emoticon PL_ONCOMING_AUTOMOBILE = EmoticonBuilder.create().title("oncoming_automobile").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>car</b></code>.
     */
    public static final Emoticon PL_CAR = EmoticonBuilder.create().title("car").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>red_car</b></code>.
     */
    public static final Emoticon PL_RED_CAR = EmoticonBuilder.create().title("red_car").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>taxi</b></code>.
     */
    public static final Emoticon PL_TAXI = EmoticonBuilder.create().title("taxi").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>oncoming_taxi</b></code>.
     */
    public static final Emoticon PL_ONCOMING_TAXI = EmoticonBuilder.create().title("oncoming_taxi").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>articulated_lorry</b></code>.
     */
    public static final Emoticon PL_ARTICULATED_LORRY = EmoticonBuilder.create().title("articulated_lorry").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>bus</b></code>.
     */
    public static final Emoticon PL_BUS = EmoticonBuilder.create().title("bus").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>oncoming_bus</b></code>.
     */
    public static final Emoticon PL_ONCOMING_BUS = EmoticonBuilder.create().title("oncoming_bus").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>rotating_light</b></code>.
     */
    public static final Emoticon PL_ROTATING_LIGHT = EmoticonBuilder.create().title("rotating_light").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>police_car</b></code>.
     */
    public static final Emoticon PL_POLICE_CAR = EmoticonBuilder.create().title("police_car").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>oncoming_police_car</b></code>.
     */
    public static final Emoticon PL_ONCOMING_POLICE_CAR = EmoticonBuilder.create().title("oncoming_police_car").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>fire_engine</b></code>.
     */
    public static final Emoticon PL_FIRE_ENGINE = EmoticonBuilder.create().title("fire_engine").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>ambulance</b></code>.
     */
    public static final Emoticon PL_AMBULANCE = EmoticonBuilder.create().title("ambulance").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>minibus</b></code>.
     */
    public static final Emoticon PL_MINIBUS = EmoticonBuilder.create().title("minibus").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>truck</b></code>.
     */
    public static final Emoticon PL_TRUCK = EmoticonBuilder.create().title("truck").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>train</b></code>.
     */
    public static final Emoticon PL_TRAIN = EmoticonBuilder.create().title("train").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>station</b></code>.
     */
    public static final Emoticon PL_STATION = EmoticonBuilder.create().title("station").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>train2</b></code>.
     */
    public static final Emoticon PL_TRAIN2 = EmoticonBuilder.create().title("train2").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>bullettrain_front</b></code>.
     */
    public static final Emoticon PL_BULLETTRAIN_FRONT = EmoticonBuilder.create().title("bullettrain_front").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>bullettrain_side</b></code>.
     */
    public static final Emoticon PL_BULLETTRAIN_SIDE = EmoticonBuilder.create().title("bullettrain_side").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>light_rail</b></code>.
     */
    public static final Emoticon PL_LIGHT_RAIL = EmoticonBuilder.create().title("light_rail").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>monorail</b></code>.
     */
    public static final Emoticon PL_MONORAIL = EmoticonBuilder.create().title("monorail").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>railway_car</b></code>.
     */
    public static final Emoticon PL_RAILWAY_CAR = EmoticonBuilder.create().title("railway_car").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>trolleybus</b></code>.
     */
    public static final Emoticon PL_TROLLEYBUS = EmoticonBuilder.create().title("trolleybus").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>ticket</b></code>.
     */
    public static final Emoticon PL_TICKET = EmoticonBuilder.create().title("ticket").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>fuelpump</b></code>.
     */
    public static final Emoticon PL_FUELPUMP = EmoticonBuilder.create().title("fuelpump").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>vertical_traffic_light</b></code>.
     */
    public static final Emoticon PL_VERTICAL_TRAFFIC_LIGHT = EmoticonBuilder.create().title("vertical_traffic_light").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>traffic_light</b></code>.
     */
    public static final Emoticon PL_TRAFFIC_LIGHT = EmoticonBuilder.create().title("traffic_light").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>warning</b></code>.
     */
    public static final Emoticon PL_WARNING = EmoticonBuilder.create().title("warning").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>construction</b></code>.
     */
    public static final Emoticon PL_CONSTRUCTION = EmoticonBuilder.create().title("construction").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>beginner</b></code>.
     */
    public static final Emoticon PL_BEGINNER = EmoticonBuilder.create().title("beginner").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>atm</b></code>.
     */
    public static final Emoticon PL_ATM = EmoticonBuilder.create().title("atm").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>slot_machine</b></code>.
     */
    public static final Emoticon PL_SLOT_MACHINE = EmoticonBuilder.create().title("slot_machine").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>busstop</b></code>.
     */
    public static final Emoticon PL_BUSSTOP = EmoticonBuilder.create().title("busstop").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>barber</b></code>.
     */
    public static final Emoticon PL_BARBER = EmoticonBuilder.create().title("barber").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>hotsprings</b></code>.
     */
    public static final Emoticon PL_HOTSPRINGS = EmoticonBuilder.create().title("hotsprings").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>checkered_flag</b></code>.
     */
    public static final Emoticon PL_CHECKERED_FLAG = EmoticonBuilder.create().title("checkered_flag").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>crossed_flags</b></code>.
     */
    public static final Emoticon PL_CROSSED_FLAGS = EmoticonBuilder.create().title("crossed_flags").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>izakaya_lantern</b></code>.
     */
    public static final Emoticon PL_IZAKAYA_LANTERN = EmoticonBuilder.create().title("izakaya_lantern").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>moyai</b></code>.
     */
    public static final Emoticon PL_MOYAI = EmoticonBuilder.create().title("moyai").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>circus_tent</b></code>.
     */
    public static final Emoticon PL_CIRCUS_TENT = EmoticonBuilder.create().title("circus_tent").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>performing_arts</b></code>.
     */
    public static final Emoticon PL_PERFORMING_ARTS = EmoticonBuilder.create().title("performing_arts").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>round_pushpin</b></code>.
     */
    public static final Emoticon PL_ROUND_PUSHPING = EmoticonBuilder.create().title("round_pushpin").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>triangular_flag_on_post</b></code>.
     */
    public static final Emoticon PL_TRIANGULAR_FLAG_ON_POST = EmoticonBuilder.create().title("triangular_flag_on_post").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>jp</b></code>.
     */
    public static final Emoticon PL_JP = EmoticonBuilder.create().title("jp").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>kr</b></code>.
     */
    public static final Emoticon PL_KR = EmoticonBuilder.create().title("kr").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>cn</b></code>.
     */
    public static final Emoticon PL_CN = EmoticonBuilder.create().title("cn").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>us</b></code>.
     */
    public static final Emoticon PL_US = EmoticonBuilder.create().title("us").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>fr</b></code>.
     */
    public static final Emoticon PL_FR = EmoticonBuilder.create().title("fr").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>es</b></code>.
     */
    public static final Emoticon PL_ES = EmoticonBuilder.create().title("es").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>it</b></code>.
     */
    public static final Emoticon PL_IT = EmoticonBuilder.create().title("it").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>ru</b></code>.
     */
    public static final Emoticon PL_RU = EmoticonBuilder.create().title("ru").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>gb</b></code>.
     */
    public static final Emoticon PL_GB = EmoticonBuilder.create().title("gb").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>uk</b></code>.
     */
    public static final Emoticon PL_UK = EmoticonBuilder.create().title("uk").category(PLACES).build(); // NOI18N

    /**
     * The <code>places emoticon <b>de</b></code>.
     */
    public static final Emoticon PL_DE = EmoticonBuilder.create().title("de").category(PLACES).build(); // NOI18N
    // END PLACES #############################################################

    // START SYMBOLS ##########################################################
    /**
     * The <code>symbols emoticon <b>one</b></code>.
     */
    public static final Emoticon SY_ONE = EmoticonBuilder.create().title("one").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>two</b></code>.
     */
    public static final Emoticon SY_TWO = EmoticonBuilder.create().title("two").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>three</b></code>.
     */
    public static final Emoticon SY_THREE = EmoticonBuilder.create().title("three").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>four</b></code>.
     */
    public static final Emoticon SY_FOUR = EmoticonBuilder.create().title("four").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>five</b></code>.
     */
    public static final Emoticon SY_FIVE = EmoticonBuilder.create().title("five").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>six</b></code>.
     */
    public static final Emoticon SY_SIX = EmoticonBuilder.create().title("six").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>seven</b></code>.
     */
    public static final Emoticon SY_SEVEN = EmoticonBuilder.create().title("seven").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>eight</b></code>.
     */
    public static final Emoticon SY_EIGHT = EmoticonBuilder.create().title("eight").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>nine</b></code>.
     */
    public static final Emoticon SY_NINE = EmoticonBuilder.create().title("nine").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>keycap_ten</b></code>.
     */
    public static final Emoticon SY_KEYCAP_TEN = EmoticonBuilder.create().title("keycap_ten").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>1234</b></code>.
     */
    public static final Emoticon SY_1234 = EmoticonBuilder.create().title("1234").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>zero</b></code>.
     */
    public static final Emoticon SY_ZERO = EmoticonBuilder.create().title("zero").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>hash</b></code>.
     */
    public static final Emoticon SY_HASH = EmoticonBuilder.create().title("hash").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>symbols</b></code>.
     */
    public static final Emoticon SY_SYMBOLS = EmoticonBuilder.create().title("symbols").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_backward</b></code>.
     */
    public static final Emoticon SY_ARROW_BACKWARD = EmoticonBuilder.create().title("arrow_backward").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_down</b></code>.
     */
    public static final Emoticon SY_ARROW_DOWN = EmoticonBuilder.create().title("arrow_down").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_forward</b></code>.
     */
    public static final Emoticon SY_ARROW_FORWARD = EmoticonBuilder.create().title("arrow_forward").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_left</b></code>.
     */
    public static final Emoticon SY_ARROW_LEFT = EmoticonBuilder.create().title("arrow_left").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>capital_abcd</b></code>.
     */
    public static final Emoticon SY_CAPITAL_ABCD = EmoticonBuilder.create().title("capital_abcd").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>abcd</b></code>.
     */
    public static final Emoticon SY_ABCD = EmoticonBuilder.create().title("abcd").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>abc</b></code>.
     */
    public static final Emoticon SY_ABC = EmoticonBuilder.create().title("abc").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_lower_left</b></code>.
     */
    public static final Emoticon SY_ARROW_LOWER_LEFT = EmoticonBuilder.create().title("arrow_lower_left").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_lower_right</b></code>.
     */
    public static final Emoticon SY_ARROW_LOWER_RIGHT = EmoticonBuilder.create().title("arrow_lower_right").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_right</b></code>.
     */
    public static final Emoticon SY_ARROW_RIGHT = EmoticonBuilder.create().title("arrow_right").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_up</b></code>.
     */
    public static final Emoticon SY_ARROW_UP = EmoticonBuilder.create().title("arrow_up").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_upper_left</b></code>.
     */
    public static final Emoticon SY_ARROW_UPPER_LEFT = EmoticonBuilder.create().title("arrow_upper_left").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_upper_right</b></code>.
     */
    public static final Emoticon SY_ARROW_UPPER_RIGHT = EmoticonBuilder.create().title("arrow_upper_right").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_double_down</b></code>.
     */
    public static final Emoticon SY_ARROW_DOUBLE_DOWN = EmoticonBuilder.create().title("arrow_double_down").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_double_up</b></code>.
     */
    public static final Emoticon SY_ARROW_DOUBLE_UP = EmoticonBuilder.create().title("arrow_double_up").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_down_small</b></code>.
     */
    public static final Emoticon SY_ARROW_DOWN_SMALL = EmoticonBuilder.create().title("arrow_down_small").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_heading_down</b></code>.
     */
    public static final Emoticon SY_ARROW_HEADING_DOWN = EmoticonBuilder.create().title("arrow_heading_down").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_heading_up</b></code>.
     */
    public static final Emoticon SY_ARROW_HEADING_UP = EmoticonBuilder.create().title("arrow_heading_up").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>leftwards_arrow_with_hook</b></code>.
     */
    public static final Emoticon SY_LEFTWARDS_ARROW_WITH_HOOK = EmoticonBuilder.create().title("leftwards_arrow_with_hook").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_right_hook</b></code>.
     */
    public static final Emoticon SY_ARROW_RIGHT_HOOK = EmoticonBuilder.create().title("arrow_right_hook").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>left_right_arrow</b></code>.
     */
    public static final Emoticon SY_LEFT_RIGHT_ARROW = EmoticonBuilder.create().title("left_right_arrow").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_up_down</b></code>.
     */
    public static final Emoticon SY_ARROW_UP_DOWN = EmoticonBuilder.create().title("arrow_up_down").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrow_up_small</b></code>.
     */
    public static final Emoticon SY_ARROW_UP_SMALL = EmoticonBuilder.create().title("arrow_up_small").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrows_clockwise</b></code>.
     */
    public static final Emoticon SY_ARROWS_CLOCKWISE = EmoticonBuilder.create().title("arrows_clockwise").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>arrows_counterclockwise</b></code>.
     */
    public static final Emoticon SY_ARROWS_COUNTERCLOCKWISE = EmoticonBuilder.create().title("arrows_counterclockwise").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>rewind</b></code>.
     */
    public static final Emoticon SY_REWIND = EmoticonBuilder.create().title("rewind").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>fast_forward</b></code>.
     */
    public static final Emoticon SY_FAST_FORWARD = EmoticonBuilder.create().title("fast_forward").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>information_source</b></code>.
     */
    public static final Emoticon SY_INFORMATION_SOURCE = EmoticonBuilder.create().title("information_source").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>ok</b></code>.
     */
    public static final Emoticon SY_OK = EmoticonBuilder.create().title("ok").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>twisted_rightwards_arrows</b></code>.
     */
    public static final Emoticon SY_TWISTED_RIGHTWARDS_ARROWS = EmoticonBuilder.create().title("twisted_rightwards_arrows").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>repeat</b></code>.
     */
    public static final Emoticon SY_REPEAT = EmoticonBuilder.create().title("repeat").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>repeat_one</b></code>.
     */
    public static final Emoticon SY_REPEAT_ONE = EmoticonBuilder.create().title("repeat_one").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>new</b></code>.
     */
    public static final Emoticon SY_NEW = EmoticonBuilder.create().title("new").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>top</b></code>.
     */
    public static final Emoticon SY_TOP = EmoticonBuilder.create().title("top").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>up</b></code>.
     */
    public static final Emoticon SY_UP = EmoticonBuilder.create().title("up").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>cool</b></code>.
     */
    public static final Emoticon SY_COOL = EmoticonBuilder.create().title("cool").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>free</b></code>.
     */
    public static final Emoticon SY_FREE = EmoticonBuilder.create().title("free").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>ng</b></code>.
     */
    public static final Emoticon SY_NG = EmoticonBuilder.create().title("ng").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>cinema</b></code>.
     */
    public static final Emoticon SY_CINEMA = EmoticonBuilder.create().title("cinema").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>koko</b></code>.
     */
    public static final Emoticon SY_KOKO = EmoticonBuilder.create().title("koko").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>signal_strength</b></code>.
     */
    public static final Emoticon SY_SIGNAL_STRENGTH = EmoticonBuilder.create().title("signal_strength").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u5272</b></code>.
     */
    public static final Emoticon SY_U5272 = EmoticonBuilder.create().title("u5272").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u5408</b></code>.
     */
    public static final Emoticon SY_U5408 = EmoticonBuilder.create().title("u5408").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u55b6</b></code>.
     */
    public static final Emoticon SY_U55B6 = EmoticonBuilder.create().title("u55b6").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u6307</b></code>.
     */
    public static final Emoticon SY_U6307 = EmoticonBuilder.create().title("u6307").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u6708</b></code>.
     */
    public static final Emoticon SY_U6708 = EmoticonBuilder.create().title("u6708").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u6709</b></code>.
     */
    public static final Emoticon SY_U6709 = EmoticonBuilder.create().title("u6709").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u6e80</b></code>.
     */
    public static final Emoticon SY_U6E80 = EmoticonBuilder.create().title("u6e80").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u7121</b></code>.
     */
    public static final Emoticon SY_U7121 = EmoticonBuilder.create().title("u7121").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u7533</b></code>.
     */
    public static final Emoticon SY_U7533 = EmoticonBuilder.create().title("u7533").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u7a7a</b></code>.
     */
    public static final Emoticon SY_U7A7A = EmoticonBuilder.create().title("u7a7a").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>u7981</b></code>.
     */
    public static final Emoticon SY_U7981 = EmoticonBuilder.create().title("u7981").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>sa</b></code>.
     */
    public static final Emoticon SY_SA = EmoticonBuilder.create().title("sa").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>restroom</b></code>.
     */
    public static final Emoticon SY_RESTROOM = EmoticonBuilder.create().title("restroom").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>mens</b></code>.
     */
    public static final Emoticon SY_MENS = EmoticonBuilder.create().title("mens").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>womens</b></code>.
     */
    public static final Emoticon SY_WOMENS = EmoticonBuilder.create().title("womens").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>baby_symbol</b></code>.
     */
    public static final Emoticon SY_BABY_SYMBOL = EmoticonBuilder.create().title("baby_symbol").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>no_smoking</b></code>.
     */
    public static final Emoticon SY_NO_SMOKING = EmoticonBuilder.create().title("no_smoking").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>parking</b></code>.
     */
    public static final Emoticon SY_PARKING = EmoticonBuilder.create().title("parking").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>wheelchair</b></code>.
     */
    public static final Emoticon SY_WHEELCHAIR = EmoticonBuilder.create().title("wheelchair").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>metro</b></code>.
     */
    public static final Emoticon SY_METRO = EmoticonBuilder.create().title("metro").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>baggage_claim</b></code>.
     */
    public static final Emoticon SY_BAGGAGE_CLAIM = EmoticonBuilder.create().title("baggage_claim").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>accept</b></code>.
     */
    public static final Emoticon SY_ACCEPT = EmoticonBuilder.create().title("accept").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>wc</b></code>.
     */
    public static final Emoticon SY_WC = EmoticonBuilder.create().title("wc").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>potable_water</b></code>.
     */
    public static final Emoticon SY_POTABLE_WATER = EmoticonBuilder.create().title("potable_water").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>put_litter_in_its_place</b></code>.
     */
    public static final Emoticon SY_PUT_LITTER_IN_ITS_PLACE = EmoticonBuilder.create().title("put_litter_in_its_place").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>secret</b></code>.
     */
    public static final Emoticon SY_SECRET = EmoticonBuilder.create().title("secret").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>congratulations</b></code>.
     */
    public static final Emoticon SY_CONGRATULATIONS = EmoticonBuilder.create().title("congratulations").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>m</b></code>.
     */
    public static final Emoticon SY_M = EmoticonBuilder.create().title("m").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>passport_control</b></code>.
     */
    public static final Emoticon SY_PASSPORT_CONTROL = EmoticonBuilder.create().title("passport_control").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>left_luggage</b></code>.
     */
    public static final Emoticon SY_LEFT_LUGGAGE = EmoticonBuilder.create().title("left_luggage").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>customs</b></code>.
     */
    public static final Emoticon SY_CUSTOMS = EmoticonBuilder.create().title("customs").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>ideograph_advantage</b></code>.
     */
    public static final Emoticon SY_IDEOGRAPH_ADVANTAGE = EmoticonBuilder.create().title("ideograph_advantage").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>cl</b></code>.
     */
    public static final Emoticon SY_CL = EmoticonBuilder.create().title("cl").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>sos</b></code>.
     */
    public static final Emoticon SY_SOS = EmoticonBuilder.create().title("sos").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>id</b></code>.
     */
    public static final Emoticon SY_ID = EmoticonBuilder.create().title("id").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>no_entry_sign</b></code>.
     */
    public static final Emoticon SY_NO_ENTRY_SIGN = EmoticonBuilder.create().title("no_entry_sign").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>underage</b></code>.
     */
    public static final Emoticon SY_UNDERAGE = EmoticonBuilder.create().title("underage").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>no_mobile_phones</b></code>.
     */
    public static final Emoticon SY_NO_MOBILE_PHONES = EmoticonBuilder.create().title("no_mobile_phones").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>do_not_litter</b></code>.
     */
    public static final Emoticon SY_DO_NOT_LITTER = EmoticonBuilder.create().title("do_not_litter").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>non-potable_water</b></code>.
     */
    public static final Emoticon SY_NON_POTABLE_WATER = EmoticonBuilder.create().title("non-potable_water").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>no_bicycles</b></code>.
     */
    public static final Emoticon SY_NO_BICYCLES = EmoticonBuilder.create().title("no_bicycles").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>no_pedestrians</b></code>.
     */
    public static final Emoticon SY_NO_PEDESTRIANS = EmoticonBuilder.create().title("no_pedestrians").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>children_crossing</b></code>.
     */
    public static final Emoticon SY_CHILDREN_CROSSING = EmoticonBuilder.create().title("children_crossing").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>no_entry</b></code>.
     */
    public static final Emoticon SY_NO_ENTRY = EmoticonBuilder.create().title("no_entry").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>eight_spoked_asterisk</b></code>.
     */
    public static final Emoticon SY_EIGHT_SPOKED_ASTERISK = EmoticonBuilder.create().title("eight_spoked_asterisk").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>sparkle</b></code>.
     */
    public static final Emoticon SY_SPARKLE = EmoticonBuilder.create().title("sparkle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>eight_pointed_black_star</b></code>.
     */
    public static final Emoticon SY_EIGHT_POINTED_BLACK_STAR = EmoticonBuilder.create().title("eight_pointed_black_star").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heart_decoration</b></code>.
     */
    public static final Emoticon SY_HEART_DECORATION = EmoticonBuilder.create().title("heart_decoration").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>vs</b></code>.
     */
    public static final Emoticon SY_VS = EmoticonBuilder.create().title("vs").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>vibration_mode</b></code>.
     */
    public static final Emoticon SY_VIBRATION_MODE = EmoticonBuilder.create().title("vibration_mode").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>mobile_phone_off</b></code>.
     */
    public static final Emoticon SY_MOBILE_PHONE_OFF = EmoticonBuilder.create().title("mobile_phone_off").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>chart</b></code>.
     */
    public static final Emoticon SY_CHART = EmoticonBuilder.create().title("chart").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>currency_exchange</b></code>.
     */
    public static final Emoticon SY_CURRENCY_EXCHANGE = EmoticonBuilder.create().title("currency_exchange").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>aries</b></code>.
     */
    public static final Emoticon SY_ARIES = EmoticonBuilder.create().title("aries").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>taurus</b></code>.
     */
    public static final Emoticon SY_TAURUS = EmoticonBuilder.create().title("taurus").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>gemini</b></code>.
     */
    public static final Emoticon SY_GEMINI = EmoticonBuilder.create().title("gemini").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>cancer</b></code>.
     */
    public static final Emoticon SY_CANCER = EmoticonBuilder.create().title("cancer").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>leo</b></code>.
     */
    public static final Emoticon SY_LEO = EmoticonBuilder.create().title("leo").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>virgo</b></code>.
     */
    public static final Emoticon SY_VIRGO = EmoticonBuilder.create().title("virgo").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>libra</b></code>.
     */
    public static final Emoticon SY_LIBRA = EmoticonBuilder.create().title("libra").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>scorpius</b></code>.
     */
    public static final Emoticon SY_SCORPIUS = EmoticonBuilder.create().title("scorpius").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>sagittarius</b></code>.
     */
    public static final Emoticon SY_SAGITTARIUS = EmoticonBuilder.create().title("sagittarius").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>capricorn</b></code>.
     */
    public static final Emoticon SY_CAPRICORN = EmoticonBuilder.create().title("capricorn").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>aquarius</b></code>.
     */
    public static final Emoticon SY_AQUARIUS = EmoticonBuilder.create().title("aquarius").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>pisces</b></code>.
     */
    public static final Emoticon SY_PISCES = EmoticonBuilder.create().title("pisces").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>ophiuchus</b></code>.
     */
    public static final Emoticon SY_OPHIUCHUS = EmoticonBuilder.create().title("ophiuchus").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>six_pointed_star</b></code>.
     */
    public static final Emoticon SY_SIX_POINTED_STAR = EmoticonBuilder.create().title("six_pointed_star").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>negative_squared_cross_mark</b></code>.
     */
    public static final Emoticon SY_NEGATIVE_SQUARED_CROSS_MARK = EmoticonBuilder.create().title("negative_squared_cross_mark").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>a</b></code>.
     */
    public static final Emoticon SY_A = EmoticonBuilder.create().title("a").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>b</b></code>.
     */
    public static final Emoticon SY_B = EmoticonBuilder.create().title("b").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>ab</b></code>.
     */
    public static final Emoticon SY_AB = EmoticonBuilder.create().title("ab").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>o2</b></code>.
     */
    public static final Emoticon SY_O2 = EmoticonBuilder.create().title("o2").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>diamond_shape_with_a_dot_inside</b></code>.
     */
    public static final Emoticon SY_DIAMOND_SHAPE_WITH_A_DOT_INSIDE = EmoticonBuilder.create().title("diamond_shape_with_a_dot_inside").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>recycle</b></code>.
     */
    public static final Emoticon SY_RECYCLE = EmoticonBuilder.create().title("recycle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>end</b></code>.
     */
    public static final Emoticon SY_END = EmoticonBuilder.create().title("end").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>back</b></code>.
     */
    public static final Emoticon SY_BACK = EmoticonBuilder.create().title("back").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>on</b></code>.
     */
    public static final Emoticon SY_ON = EmoticonBuilder.create().title("on").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>soon</b></code>.
     */
    public static final Emoticon SY_SOON = EmoticonBuilder.create().title("soon").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock1</b></code>.
     */
    public static final Emoticon SY_CLOCK1 = EmoticonBuilder.create().title("clock1").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock130</b></code>.
     */
    public static final Emoticon SY_CLOCK130 = EmoticonBuilder.create().title("clock130").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock10</b></code>.
     */
    public static final Emoticon SY_CLOCK10 = EmoticonBuilder.create().title("clock10").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock1030</b></code>.
     */
    public static final Emoticon SY_CLOCK1030 = EmoticonBuilder.create().title("clock1030").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock11</b></code>.
     */
    public static final Emoticon SY_CLOCK11 = EmoticonBuilder.create().title("clock11").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock1130</b></code>.
     */
    public static final Emoticon SY_CLOCK1130 = EmoticonBuilder.create().title("clock1130").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock12</b></code>.
     */
    public static final Emoticon SY_CLOCK12 = EmoticonBuilder.create().title("clock12").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock1230</b></code>.
     */
    public static final Emoticon SY_CLOCK1230 = EmoticonBuilder.create().title("clock1230").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock2</b></code>.
     */
    public static final Emoticon SY_CLOCK2 = EmoticonBuilder.create().title("clock2").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock230</b></code>.
     */
    public static final Emoticon SY_CLOCK230 = EmoticonBuilder.create().title("clock230").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock3</b></code>.
     */
    public static final Emoticon SY_CLOCK3 = EmoticonBuilder.create().title("clock3").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock330</b></code>.
     */
    public static final Emoticon SY_CLOCK330 = EmoticonBuilder.create().title("clock330").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock4</b></code>.
     */
    public static final Emoticon SY_CLOCK4 = EmoticonBuilder.create().title("clock4").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock430</b></code>.
     */
    public static final Emoticon SY_CLOCK430 = EmoticonBuilder.create().title("clock430").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock5</b></code>.
     */
    public static final Emoticon SY_CLOCK5 = EmoticonBuilder.create().title("clock5").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock530</b></code>.
     */
    public static final Emoticon SY_CLOCK530 = EmoticonBuilder.create().title("clock530").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock6</b></code>.
     */
    public static final Emoticon SY_CLOCK6 = EmoticonBuilder.create().title("clock6").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock630</b></code>.
     */
    public static final Emoticon SY_CLOCK630 = EmoticonBuilder.create().title("clock630").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock7</b></code>.
     */
    public static final Emoticon SY_CLOCK7 = EmoticonBuilder.create().title("clock7").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock730</b></code>.
     */
    public static final Emoticon SY_CLOCK730 = EmoticonBuilder.create().title("clock730").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock8</b></code>.
     */
    public static final Emoticon SY_CLOCK8 = EmoticonBuilder.create().title("clock8").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock830</b></code>.
     */
    public static final Emoticon SY_CLOCK830 = EmoticonBuilder.create().title("clock830").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock9</b></code>.
     */
    public static final Emoticon SY_CLOCK9 = EmoticonBuilder.create().title("clock9").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>clock930</b></code>.
     */
    public static final Emoticon SY_CLOCK930 = EmoticonBuilder.create().title("clock930").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_dollar_sign</b></code>.
     */
    public static final Emoticon SY_HEAVY_DOLLAR_SIGN = EmoticonBuilder.create().title("heavy_dollar_sign").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>copyright</b></code>.
     */
    public static final Emoticon SY_COPYRIGHT = EmoticonBuilder.create().title("copyright").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>registered</b></code>.
     */
    public static final Emoticon SY_REGISTERED = EmoticonBuilder.create().title("registered").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>tm</b></code>.
     */
    public static final Emoticon SY_TM = EmoticonBuilder.create().title("tm").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>x</b></code>.
     */
    public static final Emoticon SY_X = EmoticonBuilder.create().title("x").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_exclamation_mark</b></code>.
     */
    public static final Emoticon SY_HEAVY_EXCLAMATION_MARK = EmoticonBuilder.create().title("heavy_exclamation_mark").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>bangbang</b></code>.
     */
    public static final Emoticon SY_BANGBANG = EmoticonBuilder.create().title("bangbang").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>interrobang</b></code>.
     */
    public static final Emoticon SY_INTERROBANG = EmoticonBuilder.create().title("interrobang").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>o</b></code>.
     */
    public static final Emoticon SY_O = EmoticonBuilder.create().title("o").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_multiplication_x</b></code>.
     */
    public static final Emoticon SY_HEAVY_MULTIPLICATION_X = EmoticonBuilder.create().title("heavy_multiplication_x").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_plus_sign</b></code>.
     */
    public static final Emoticon SY_HEAVY_PLUS_SIGN = EmoticonBuilder.create().title("heavy_plus_sign").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_minus_sign</b></code>.
     */
    public static final Emoticon SY_HEAVY_MINUS_SIGN = EmoticonBuilder.create().title("heavy_minus_sign").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_division_sign</b></code>.
     */
    public static final Emoticon SY_HEAVY_DIVISION_SIGN = EmoticonBuilder.create().title("heavy_division_sign").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_flower</b></code>.
     */
    public static final Emoticon SY_WHITE_FLOWER = EmoticonBuilder.create().title("white_flower").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>100</b></code>.
     */
    public static final Emoticon SY_100 = EmoticonBuilder.create().title("100").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>heavy_check_mark</b></code>.
     */
    public static final Emoticon SY_HEAVY_CHECK_MARK = EmoticonBuilder.create().title("heavy_check_mark").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>ballot_box_with_check</b></code>.
     */
    public static final Emoticon SY_BALLOT_BOX_WITH_CHECK = EmoticonBuilder.create().title("ballot_box_with_check").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>radio_button</b></code>.
     */
    public static final Emoticon SY_RADIO_BUTTON = EmoticonBuilder.create().title("radio_button").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>link</b></code>.
     */
    public static final Emoticon SY_LINK = EmoticonBuilder.create().title("link").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>curly_loop</b></code>.
     */
    public static final Emoticon SY_CURLY_LOOP = EmoticonBuilder.create().title("curly_loop").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>wavy_dash</b></code>.
     */
    public static final Emoticon SY_WAVY_DASH = EmoticonBuilder.create().title("wavy_dash").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>part_alternation_mark</b></code>.
     */
    public static final Emoticon SY_PART_ALTERNATION_MARK = EmoticonBuilder.create().title("part_alternation_mark").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>trident</b></code>.
     */
    public static final Emoticon SY_TRIDENT = EmoticonBuilder.create().title("trident").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>black_small_square</b></code>.
     */
    public static final Emoticon SY_BLACK_SMALL_SQUARE = EmoticonBuilder.create().title("black_small_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_small_square</b></code>.
     */
    public static final Emoticon SY_WHITE_SMALL_SQUARE = EmoticonBuilder.create().title("white_small_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>black_medium_small_square</b></code>.
     */
    public static final Emoticon SY_BLACK_MEDIUM_SMALL_SQUARE = EmoticonBuilder.create().title("black_medium_small_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_medium_small_square</b></code>.
     */
    public static final Emoticon SY_WHITE_MEDIUM_SMALL_SQUARE = EmoticonBuilder.create().title("white_medium_small_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>black_medium_square</b></code>.
     */
    public static final Emoticon SY_BLACK_MEDIUM_SQUARE = EmoticonBuilder.create().title("black_medium_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_medium_square</b></code>.
     */
    public static final Emoticon SY_WHITE_MEDIUM_SQUARE = EmoticonBuilder.create().title("white_medium_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>black_large_square</b></code>.
     */
    public static final Emoticon SY_BLACK_LARGE_SQUARE = EmoticonBuilder.create().title("black_large_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_large_square</b></code>.
     */
    public static final Emoticon SY_WHITE_LARGE_SQUARE = EmoticonBuilder.create().title("white_large_square").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_check_mark</b></code>.
     */
    public static final Emoticon SY_WHITE_CHECK_MARK = EmoticonBuilder.create().title("white_check_mark").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>black_square_button</b></code>.
     */
    public static final Emoticon SY_BLACK_SQUARE_BUTTON = EmoticonBuilder.create().title("black_square_button").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_square_button</b></code>.
     */
    public static final Emoticon SY_WHITE_SQUARE_BUTTON = EmoticonBuilder.create().title("white_square_button").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>black_circle</b></code>.
     */
    public static final Emoticon SY_BLACK_CIRCLE = EmoticonBuilder.create().title("black_circle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>white_circle</b></code>.
     */
    public static final Emoticon SY_WHITE_CIRCLE = EmoticonBuilder.create().title("white_circle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>red_circle</b></code>.
     */
    public static final Emoticon SY_RED_CIRCLE = EmoticonBuilder.create().title("red_circle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>large_blue_circle</b></code>.
     */
    public static final Emoticon SY_LARGE_BLUE_CIRCLE = EmoticonBuilder.create().title("large_blue_circle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>large_blue_diamond</b></code>.
     */
    public static final Emoticon SY_LARGE_BLUE_DIAMOND = EmoticonBuilder.create().title("large_blue_diamond").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>large_orange_diamond</b></code>.
     */
    public static final Emoticon SY_LARGE_ORANGE_DIAMOND = EmoticonBuilder.create().title("large_orange_diamond").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>small_blue_diamond</b></code>.
     */
    public static final Emoticon SY_SMALL_BLUE_DIAMOND = EmoticonBuilder.create().title("small_blue_diamond").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>small_orange_diamond</b></code>.
     */
    public static final Emoticon SY_SMALL_ORANGE_DIAMOND = EmoticonBuilder.create().title("small_orange_diamond").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>small_red_triangle</b></code>.
     */
    public static final Emoticon SY_SMALL_RED_TRIANGLE = EmoticonBuilder.create().title("small_red_triangle").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>small_red_triangle_down</b></code>.
     */
    public static final Emoticon SY_SMALL_RED_TRIANGLE_DOWN = EmoticonBuilder.create().title("small_red_triangle_down").category(SYMBOLS).build(); // NOI18N

    /**
     * The <code>symbols emoticon <b>shipit</b></code>.
     */
    public static final Emoticon SY_SHIPIT = EmoticonBuilder.create().title("shipit").category(SYMBOLS).build(); // NOI18N
    // END SYMBOLS ############################################################

    private static final Optional<EmojiEmoticonSet> instance = Optional.of(new EmojiEmoticonSet());

    /**
     * Returns a singleton instance from the class
     * <code>EmojiEmoticonSet</code>.
     *
     * @return a singleton instance from the class
     * <code>EmojiEmoticonSet</code>.
     */
    public static final EmojiEmoticonSet getDefault() {
        return instance.get();
    }

    private EmojiEmoticonSet() {
        super();
    }

    @Override
    protected void configureEmoticonLoaders() {
        super.addEmoticonLoader(new EmojiEmoticonLoader());
    }

    @Override
    protected void configureEmoticons() {
        // START NATURE #######################################################
        super.addEmoticon(NA_SUNNY);
        super.addEmoticon(NA_UMBRELLA);
        super.addEmoticon(NA_CLOUD);
        super.addEmoticon(NA_SNOWFLAKE);
        super.addEmoticon(NA_SNOWMAN);
        super.addEmoticon(NA_ZAP);
        super.addEmoticon(NA_CYCLONE);
        super.addEmoticon(NA_FOGGY);
        super.addEmoticon(NA_OCEAN);
        super.addEmoticon(NA_CAT);
        super.addEmoticon(NA_DOG);
        super.addEmoticon(NA_MOUSE);
        super.addEmoticon(NA_HAMSTER);
        super.addEmoticon(NA_RABBIT);
        super.addEmoticon(NA_WOLF);
        super.addEmoticon(NA_FROG);
        super.addEmoticon(NA_TIGER);
        super.addEmoticon(NA_KOALA);
        super.addEmoticon(NA_BEAR);
        super.addEmoticon(NA_PIG);
        super.addEmoticon(NA_PIG_NOSE);
        super.addEmoticon(NA_COW);
        super.addEmoticon(NA_BOAR);
        super.addEmoticon(NA_MONKEY_FACE);
        super.addEmoticon(NA_MONKEY);
        super.addEmoticon(NA_HORSE);
        super.addEmoticon(NA_RACEHORSE);
        super.addEmoticon(NA_CAMEL);
        super.addEmoticon(NA_SHEEP);
        super.addEmoticon(NA_ELEPHANT);
        super.addEmoticon(NA_PANDA_FACE);
        super.addEmoticon(NA_SNAKE);
        super.addEmoticon(NA_BIRD);
        super.addEmoticon(NA_BABY_CHICK);
        super.addEmoticon(NA_HATCHED_CHICK);
        super.addEmoticon(NA_HATCHING_CHICK);
        super.addEmoticon(NA_CHICKEN);
        super.addEmoticon(NA_PENGUIN);
        super.addEmoticon(NA_TURTLE);
        super.addEmoticon(NA_BUG);
        super.addEmoticon(NA_HONEYBEE);
        super.addEmoticon(NA_ANT);
        super.addEmoticon(NA_BEETLE);
        super.addEmoticon(NA_SNAIL);
        super.addEmoticon(NA_OCTOPUS);
        super.addEmoticon(NA_TROPICAL_FISH);
        super.addEmoticon(NA_FISH);
        super.addEmoticon(NA_WHALE);
        super.addEmoticon(NA_WHALE2);
        super.addEmoticon(NA_DOLPHIN);
        super.addEmoticon(NA_COW2);
        super.addEmoticon(NA_RAM);
        super.addEmoticon(NA_RAT);
        super.addEmoticon(NA_WATER_BUFFALO);
        super.addEmoticon(NA_TIGER2);
        super.addEmoticon(NA_RABBIT2);
        super.addEmoticon(NA_DRAGON);
        super.addEmoticon(NA_GOAT);
        super.addEmoticon(NA_ROOSTER);
        super.addEmoticon(NA_DOG2);
        super.addEmoticon(NA_PIG2);
        super.addEmoticon(NA_MOUSE2);
        super.addEmoticon(NA_OX);
        super.addEmoticon(NA_DRAGON_FACE);
        super.addEmoticon(NA_BLOWFISH);
        super.addEmoticon(NA_CROCODILE);
        super.addEmoticon(NA_DROMEDARY_CAMEL);
        super.addEmoticon(NA_LEOPARD);
        super.addEmoticon(NA_CAT2);
        super.addEmoticon(NA_POODLE);
        super.addEmoticon(NA_PAW_PRINTS);
        super.addEmoticon(NA_BOUQUET);
        super.addEmoticon(NA_CHERRY_BLOSSOM);
        super.addEmoticon(NA_TULIP);
        super.addEmoticon(NA_FOUR_LEAF_CLOVER);
        super.addEmoticon(NA_ROSE);
        super.addEmoticon(NA_SUNFLOWER);
        super.addEmoticon(NA_HIBISUS);
        super.addEmoticon(NA_MAPLE_LEAF);
        super.addEmoticon(NA_LEAVES);
        super.addEmoticon(NA_FALLEN_LEAF);
        super.addEmoticon(NA_HERB);
        super.addEmoticon(NA_MUSHROOM);
        super.addEmoticon(NA_CACTUS);
        super.addEmoticon(NA_PALM_TREE);
        super.addEmoticon(NA_EVERGREEN_TREE);
        super.addEmoticon(NA_DECIDUOUS_TREE);
        super.addEmoticon(NA_CHESTNUT);
        super.addEmoticon(NA_SEEDLING);
        super.addEmoticon(NA_BLOSSOM);
        super.addEmoticon(NA_EAR_OF_RICE);
        super.addEmoticon(NA_SHELL);
        super.addEmoticon(NA_GLOBE_WITH_MERIDIANS);
        super.addEmoticon(NA_SUN_WITH_FACE);
        super.addEmoticon(NA_FULL_MOON_WITH_FACE);
        super.addEmoticon(NA_NEW_MOON_WITH_FACE);
        super.addEmoticon(NA_NEW_MOON);
        super.addEmoticon(NA_WAXING_CRESENT_MOON);
        super.addEmoticon(NA_FIRST_QUARTER_MOON);
        super.addEmoticon(NA_WAXING_GIBBOUS_MOON);
        super.addEmoticon(NA_FULL_MOON);
        super.addEmoticon(NA_WANING_GIBBOUS_MOON);
        super.addEmoticon(NA_LAST_QUARTER_MOON);
        super.addEmoticon(NA_WANING_CRESCENT_MOON);
        super.addEmoticon(NA_LAST_QUARTER_MOON_WITH_FACE);
        super.addEmoticon(NA_FIRST_QUARTER_MOON_WITH_FACE);
        super.addEmoticon(NA_CRESCENT_MOON);
        super.addEmoticon(NA_EARTH_AFRICA);
        super.addEmoticon(NA_EARTH_AMERICAS);
        super.addEmoticon(NA_EARTH_ASIA);
        super.addEmoticon(NA_VOCANO);
        super.addEmoticon(NA_MILKY_WAY);
        super.addEmoticon(NA_PARTLY_SUNNY);
        super.addEmoticon(NA_OCTOCAT);
        super.addEmoticon(NA_SQUIRREL);
        // END NATURE #########################################################

        // START OBJECTS ######################################################
        super.addEmoticon(OB_BAMBOO);
        super.addEmoticon(OB_GIFT_HEART);
        super.addEmoticon(OB_DOLLS);
        super.addEmoticon(OB_SCHOOL_SATCHEL);
        super.addEmoticon(OB_MORTAR_BOARD);
        super.addEmoticon(OB_FLAGS);
        super.addEmoticon(OB_FIREWORKS);
        super.addEmoticon(OB_SPARKLER);
        super.addEmoticon(OB_WIND_CHIME);
        super.addEmoticon(OB_RICE_SCENE);
        super.addEmoticon(OB_JACK_O_LANTERN);
        super.addEmoticon(OB_GHOST);
        super.addEmoticon(OB_SANTA);
        super.addEmoticon(OB_CHRISTMAS_TREE);
        super.addEmoticon(OB_GIFT);
        super.addEmoticon(OB_BELL);
        super.addEmoticon(OB_NO_BELL);
        super.addEmoticon(OB_TANABATA_TREE);
        super.addEmoticon(OB_TADA);
        super.addEmoticon(OB_CONFETTI_BALL);
        super.addEmoticon(OB_BALLOON);
        super.addEmoticon(OB_CRYSTAL_BALL);
        super.addEmoticon(OB_CD);
        super.addEmoticon(OB_DVD);
        super.addEmoticon(OB_FLOPPY_DISK);
        super.addEmoticon(OB_CAMERA);
        super.addEmoticon(OB_VIDEO_CAMERA);
        super.addEmoticon(OB_MOVIE_CAMERA);
        super.addEmoticon(OB_COMPUTER);
        super.addEmoticon(OB_TV);
        super.addEmoticon(OB_IPHONE);
        super.addEmoticon(OB_PHONE);
        super.addEmoticon(OB_TELEPHONE);
        super.addEmoticon(OB_TELEPHONE_RECEIVER);
        super.addEmoticon(OB_PAGER);
        super.addEmoticon(OB_FAX);
        super.addEmoticon(OB_MINIDISC);
        super.addEmoticon(OB_VHS);
        super.addEmoticon(OB_SOUND);
        super.addEmoticon(OB_SPEAKER);
        super.addEmoticon(OB_MUTE);
        super.addEmoticon(OB_LOUDSPEAKER);
        super.addEmoticon(OB_MEGA);
        super.addEmoticon(OB_HOURGLASS);
        super.addEmoticon(OB_HOURGLASS_FLOWING_SAND);
        super.addEmoticon(OB_ALARM_CLOCK);
        super.addEmoticon(OB_WATCH);
        super.addEmoticon(OB_RADIO);
        super.addEmoticon(OB_SATELLITE);
        super.addEmoticon(OB_LOOP);
        super.addEmoticon(OB_MAG);
        super.addEmoticon(OB_MAG_RIGHT);
        super.addEmoticon(OB_UNLOCK);
        super.addEmoticon(OB_LOCK);
        super.addEmoticon(OB_LOCK_WITH_INK_PEN);
        super.addEmoticon(OB_CLOSED_LOCK_WITH_KEY);
        super.addEmoticon(OB_KEY);
        super.addEmoticon(OB_BULB);
        super.addEmoticon(OB_FLASHLIGHT);
        super.addEmoticon(OB_HIGH_BRIGHTNESS);
        super.addEmoticon(OB_LOW_BRIGHTNESS);
        super.addEmoticon(OB_ELECTRIC_PLUG);
        super.addEmoticon(OB_BATTERY);
        super.addEmoticon(OB_CALLING);
        super.addEmoticon(OB_EMAIL);
        super.addEmoticon(OB_MAILBOX);
        super.addEmoticon(OB_POSTBOX);
        super.addEmoticon(OB_BATH);
        super.addEmoticon(OB_BATHTUB);
        super.addEmoticon(OB_SHOWER);
        super.addEmoticon(OB_TOILET);
        super.addEmoticon(OB_WRENCH);
        super.addEmoticon(OB_NUT_AND_BOLT);
        super.addEmoticon(OB_HAMMER);
        super.addEmoticon(OB_SEAT);
        super.addEmoticon(OB_MONEYBAG);
        super.addEmoticon(OB_YEN);
        super.addEmoticon(OB_DOLLAR);
        super.addEmoticon(OB_POUND);
        super.addEmoticon(OB_EURO);
        super.addEmoticon(OB_CREDIT_CARD);
        super.addEmoticon(OB_MONEY_WITH_WINGS);
        super.addEmoticon(OB_E_MAIL);
        super.addEmoticon(OB_INBOX_TRAY);
        super.addEmoticon(OB_OUTBOX_TRAY);
        super.addEmoticon(OB_ENVELOPE);
        super.addEmoticon(OB_INCOMING_ENVELOPE);
        super.addEmoticon(OB_POSTAL_HORN);
        super.addEmoticon(OB_MAILBOX_CLOSED);
        super.addEmoticon(OB_MAILBOX_WITH_MAIL);
        super.addEmoticon(OB_MAILBOX_WITH_NO_MAIL);
        super.addEmoticon(OB_PACKAGE);
        super.addEmoticon(OB_DOOR);
        super.addEmoticon(OB_SMOKING);
        super.addEmoticon(OB_BOMB);
        super.addEmoticon(OB_GUN);
        super.addEmoticon(OB_HOCHO);
        super.addEmoticon(OB_PILL);
        super.addEmoticon(OB_SYRINGE);
        super.addEmoticon(OB_PAGE_FACING_UP);
        super.addEmoticon(OB_PAGE_WITH_CURL);
        super.addEmoticon(OB_BOOKMARK_TABS);
        super.addEmoticon(OB_BAR_CHART);
        super.addEmoticon(OB_CHART_WITH_UPWARDS_TREND);
        super.addEmoticon(OB_CHART_WITH_DOWNWARDS_TREND);
        super.addEmoticon(OB_SCROLL);
        super.addEmoticon(OB_CLIPBOARD);
        super.addEmoticon(OB_CALENDAR);
        super.addEmoticon(OB_DATE);
        super.addEmoticon(OB_CARD_INDEX);
        super.addEmoticon(OB_FILE_FOLDER);
        super.addEmoticon(OB_OPEN_FILE_FOLDER);
        super.addEmoticon(OB_SCISSORS);
        super.addEmoticon(OB_PUSHPIN);
        super.addEmoticon(OB_PAPERCLIP);
        super.addEmoticon(OB_BLACK_NIB);
        super.addEmoticon(OB_PENCIL2);
        super.addEmoticon(OB_STRAIGHT_RULER);
        super.addEmoticon(OB_TRIANGULAR_RULER);
        super.addEmoticon(OB_CLOSED_BOOK);
        super.addEmoticon(OB_GREEN_BOOK);
        super.addEmoticon(OB_BLUE_BOOK);
        super.addEmoticon(OB_ORANGE_BOOK);
        super.addEmoticon(OB_NOTEBOOK);
        super.addEmoticon(OB_NOTEBOOK_WITH_DECORATIVE_COVER);
        super.addEmoticon(OB_LEDGER);
        super.addEmoticon(OB_BOOKS);
        super.addEmoticon(OB_BOOKMARK);
        super.addEmoticon(OB_NAME_BADGE);
        super.addEmoticon(OB_MICROSCOPE);
        super.addEmoticon(OB_TELESCOPE);
        super.addEmoticon(OB_NEWSPAPER);
        super.addEmoticon(OB_FOOTBALL);
        super.addEmoticon(OB_BASKETBALL);
        super.addEmoticon(OB_SOCCER);
        super.addEmoticon(OB_BASEBALL);
        super.addEmoticon(OB_TENNIS);
        super.addEmoticon(OB_8BALL);
        super.addEmoticon(OB_RUGBY_FOOTBALL);
        super.addEmoticon(OB_BOWLING);
        super.addEmoticon(OB_GOLF);
        super.addEmoticon(OB_MOUNTAIN_BICYCLIST);
        super.addEmoticon(OB_BICYCLIST);
        super.addEmoticon(OB_HORSE_RACING);
        super.addEmoticon(OB_SNOWBOARDER);
        super.addEmoticon(OB_SWIMMER);
        super.addEmoticon(OB_SURFER);
        super.addEmoticon(OB_SKI);
        super.addEmoticon(OB_SPADES);
        super.addEmoticon(OB_HEARTS);
        super.addEmoticon(OB_CLUBS);
        super.addEmoticon(OB_DIAMONDS);
        super.addEmoticon(OB_GEM);
        super.addEmoticon(OB_RING);
        super.addEmoticon(OB_TROPHY);
        super.addEmoticon(OB_MUSICAL_SCORE);
        super.addEmoticon(OB_MUSICAL_KEYBOARD);
        super.addEmoticon(OB_VIOLIN);
        super.addEmoticon(OB_SPACE_INVADER);
        super.addEmoticon(OB_VIDEO_GAME);
        super.addEmoticon(OB_BLACK_JOKER);
        super.addEmoticon(OB_FLOWER_PLAYING_CARDS);
        super.addEmoticon(OB_GAME_DIE);
        super.addEmoticon(OB_DART);
        super.addEmoticon(OB_MAHJONG);
        super.addEmoticon(OB_CLAPPER);
        super.addEmoticon(OB_MEMO);
        super.addEmoticon(OB_PENCIL);
        super.addEmoticon(OB_BOOK);
        super.addEmoticon(OB_ART);
        super.addEmoticon(OB_MICROPHONE);
        super.addEmoticon(OB_HEADPHONES);
        super.addEmoticon(OB_TRUMPET);
        super.addEmoticon(OB_SAXOPHONE);
        super.addEmoticon(OB_GUITAR);
        super.addEmoticon(OB_SHOE);
        super.addEmoticon(OB_SANDAL);
        super.addEmoticon(OB_HIGH_HEEL);
        super.addEmoticon(OB_LIPSTICK);
        super.addEmoticon(OB_BOOT);
        super.addEmoticon(OB_SHIRT);
        super.addEmoticon(OB_TSHIRT);
        super.addEmoticon(OB_NECKTIE);
        super.addEmoticon(OB_WOMANS_CLOTHES);
        super.addEmoticon(OB_DRESS);
        super.addEmoticon(OB_RUNNING_SHIRT_WITH_SASH);
        super.addEmoticon(OB_JEANS);
        super.addEmoticon(OB_KIMONO);
        super.addEmoticon(OB_BIKINI);
        super.addEmoticon(OB_RIBBON);
        super.addEmoticon(OB_TOPHAT);
        super.addEmoticon(OB_CROWN);
        super.addEmoticon(OB_WOMANS_HAT);
        super.addEmoticon(OB_MANS_SHOE);
        super.addEmoticon(OB_CLOSED_UMBRELLA);
        super.addEmoticon(OB_BRIEFCASE);
        super.addEmoticon(OB_HANDBAG);
        super.addEmoticon(OB_POUCH);
        super.addEmoticon(OB_PURSE);
        super.addEmoticon(OB_EYEGLASSES);
        super.addEmoticon(OB_FISHING_POLE_AND_FISH);
        super.addEmoticon(OB_COFFEE);
        super.addEmoticon(OB_TEA);
        super.addEmoticon(OB_SAKE);
        super.addEmoticon(OB_BABY_BOTTLE);
        super.addEmoticon(OB_BEER);
        super.addEmoticon(OB_BEERS);
        super.addEmoticon(OB_COCKTAIL);
        super.addEmoticon(OB_TROPICAL_DRINK);
        super.addEmoticon(OB_WINE_GLASS);
        super.addEmoticon(OB_FORK_AND_KNIFE);
        super.addEmoticon(OB_PIZZA);
        super.addEmoticon(OB_HAMBURGER);
        super.addEmoticon(OB_FRIES);
        super.addEmoticon(OB_POULTRY_LEG);
        super.addEmoticon(OB_MEAT_ON_BONE);
        super.addEmoticon(OB_SPAGHETTI);
        super.addEmoticon(OB_CURRY);
        super.addEmoticon(OB_FRIED_SHRIMP);
        super.addEmoticon(OB_BENTO);
        super.addEmoticon(OB_SUSHI);
        super.addEmoticon(OB_FISH_CAKE);
        super.addEmoticon(OB_RICE_BALL);
        super.addEmoticon(OB_RICE_CRACKER);
        super.addEmoticon(OB_RICE);
        super.addEmoticon(OB_RAMEN);
        super.addEmoticon(OB_STEW);
        super.addEmoticon(OB_ODEN);
        super.addEmoticon(OB_DANGO);
        super.addEmoticon(OB_EGG);
        super.addEmoticon(OB_BREAD);
        super.addEmoticon(OB_DOUGHNUT);
        super.addEmoticon(OB_CUSTARD);
        super.addEmoticon(OB_ICECREAM);
        super.addEmoticon(OB_ICE_CREAM);
        super.addEmoticon(OB_SHAVED_ICE);
        super.addEmoticon(OB_BIRTHDAY);
        super.addEmoticon(OB_CAKE);
        super.addEmoticon(OB_COOKIE);
        super.addEmoticon(OB_CHOCOLATE_BAR);
        super.addEmoticon(OB_CANDY);
        super.addEmoticon(OB_LOLLIPOP);
        super.addEmoticon(OB_HONEY_POT);
        super.addEmoticon(OB_APPLE);
        super.addEmoticon(OB_GREEN_APPLE);
        super.addEmoticon(OB_TANGERINE);
        super.addEmoticon(OB_LEMON);
        super.addEmoticon(OB_CHERRIES);
        super.addEmoticon(OB_GRAPES);
        super.addEmoticon(OB_WATERMELON);
        super.addEmoticon(OB_STRAWBERRY);
        super.addEmoticon(OB_PEACH);
        super.addEmoticon(OB_MELON);
        super.addEmoticon(OB_BANANA);
        super.addEmoticon(OB_PEAR);
        super.addEmoticon(OB_PINEAPPLE);
        super.addEmoticon(OB_SWEET_POTATO);
        super.addEmoticon(OB_EGGPLANT);
        super.addEmoticon(OB_TOMATO);
        super.addEmoticon(OB_CORN);
        // END OBJECTS ########################################################

        // START PEOPLE #######################################################
        super.addEmoticon(PE_BOWTIE);
        super.addEmoticon(PE_SMILE);
        super.addEmoticon(PE_SIMPLE_SMILE);
        super.addEmoticon(PE_LAUGHING);
        super.addEmoticon(PE_BLUSH);
        super.addEmoticon(PE_SMILEY);
        super.addEmoticon(PE_RELAXED);
        super.addEmoticon(PE_SMIRK);
        super.addEmoticon(PE_HEART_EYES);
        super.addEmoticon(PE_KISSING_HEART);
        super.addEmoticon(PE_KISSING_CLOSED_EYES);
        super.addEmoticon(PE_FLUSHED);
        super.addEmoticon(PE_RELIEVED);
        super.addEmoticon(PE_SATISFIED);
        super.addEmoticon(PE_GRIN);
        super.addEmoticon(PE_WINK);
        super.addEmoticon(PE_STUCK_OUT_TONGUE_WINING_EYE);
        super.addEmoticon(PE_STUCK_OUT_TONGUE_CLOSED_EYES);
        super.addEmoticon(PE_GRINNING);
        super.addEmoticon(PE_KISSING);
        super.addEmoticon(PE_KISSING_SMILING_EYES);
        super.addEmoticon(PE_STUCK_OUT_TONGUE);
        super.addEmoticon(PE_SLEEPING);
        super.addEmoticon(PE_WORRIED);
        super.addEmoticon(PE_FROWING);
        super.addEmoticon(PE_ANGUISHED);
        super.addEmoticon(PE_OPEN_MOUTH);
        super.addEmoticon(PE_GRIMACING);
        super.addEmoticon(PE_CONFUSED);
        super.addEmoticon(PE_HUSHED);
        super.addEmoticon(PE_EXPRESSIONLESS);
        super.addEmoticon(PE_UNAMUSED);
        super.addEmoticon(PE_SWEAT_SMILE);
        super.addEmoticon(PE_SWEAT);
        super.addEmoticon(PE_DISAPPOINTED_RELIEVED);
        super.addEmoticon(PE_WEARY);
        super.addEmoticon(PE_PENSIVE);
        super.addEmoticon(PE_DISAPPOINTED);
        super.addEmoticon(PE_CONFOUNDED);
        super.addEmoticon(PE_FEARFUL);
        super.addEmoticon(PE_COLD_SWEAT);
        super.addEmoticon(PE_PERSEVERE);
        super.addEmoticon(PE_CRY);
        super.addEmoticon(PE_SOB);
        super.addEmoticon(PE_JOY);
        super.addEmoticon(PE_ASTONISHED);
        super.addEmoticon(PE_SCREAM);
        super.addEmoticon(PE_NECKBEARD);
        super.addEmoticon(PE_TIRED_FACE);
        super.addEmoticon(PE_ANGRY);
        super.addEmoticon(PE_RAGE);
        super.addEmoticon(PE_TRIUMPH);
        super.addEmoticon(PE_SLEEPY);
        super.addEmoticon(PE_YUM);
        super.addEmoticon(PE_MASK);
        super.addEmoticon(PE_SUNGLASSES);
        super.addEmoticon(PE_DIZZY_FACE);
        super.addEmoticon(PE_IMP);
        super.addEmoticon(PE_SMILING_IMP);
        super.addEmoticon(PE_NEUTRAL_FACE);
        super.addEmoticon(PE_NO_MOUTH);
        super.addEmoticon(PE_INNOCENT);
        super.addEmoticon(PE_ALIEN);
        super.addEmoticon(PE_YELLOW_HEART);
        super.addEmoticon(PE_BLUE_HEART);
        super.addEmoticon(PE_PURPLE_HEART);
        super.addEmoticon(PE_HEART);
        super.addEmoticon(PE_GREEN_HEART);
        super.addEmoticon(PE_BROKEN_HEART);
        super.addEmoticon(PE_HEARTBEAT);
        super.addEmoticon(PE_HEARTPULSE);
        super.addEmoticon(PE_TWO_HEARTS);
        super.addEmoticon(PE_REVOLVING_HEARTS);
        super.addEmoticon(PE_CUPID);
        super.addEmoticon(PE_SPARKLING_HEART);
        super.addEmoticon(PE_SPARKLES);
        super.addEmoticon(PE_STAR);
        super.addEmoticon(PE_STAR2);
        super.addEmoticon(PE_DIZZY);
        super.addEmoticon(PE_BOOM);
        super.addEmoticon(PE_COLLISION);
        super.addEmoticon(PE_ANGER);
        super.addEmoticon(PE_EXCLAMATION);
        super.addEmoticon(PE_QUESTION);
        super.addEmoticon(PE_GREY_EXCLAMATION);
        super.addEmoticon(PE_GREY_QUESTION);
        super.addEmoticon(PE_ZZZ);
        super.addEmoticon(PE_DASH);
        super.addEmoticon(PE_SWEAT_DROPS);
        super.addEmoticon(PE_NOTES);
        super.addEmoticon(PE_MUSICAL_NOTE);
        super.addEmoticon(PE_FIRE);
        super.addEmoticon(PE_HANKEY);
        super.addEmoticon(PE_POOP);
        super.addEmoticon(PE_SHIT);
        super.addEmoticon(PE_PLUS_1);
        super.addEmoticon(PE_THUMBSUP);
        super.addEmoticon(PE_MINUS_1);
        super.addEmoticon(PE_THUMBSDOWN);
        super.addEmoticon(PE_OK_HAND);
        super.addEmoticon(PE_PUNCH);
        super.addEmoticon(PE_FACEPUNCH);
        super.addEmoticon(PE_FIST);
        super.addEmoticon(PE_V);
        super.addEmoticon(PE_WAVE);
        super.addEmoticon(PE_HAND);
        super.addEmoticon(PE_RAISED_HAND);
        super.addEmoticon(PE_OPEN_HANDS);
        super.addEmoticon(PE_POINT_UP);
        super.addEmoticon(PE_POINT_DOWN);
        super.addEmoticon(PE_POINT_LEFT);
        super.addEmoticon(PE_POINT_RIGHT);
        super.addEmoticon(PE_RAISED_HANDS);
        super.addEmoticon(PE_PRAY);
        super.addEmoticon(PE_POINT_UP_2);
        super.addEmoticon(PE_CLAP);
        super.addEmoticon(PE_MUSCLE);
        super.addEmoticon(PE_METAL);
        super.addEmoticon(PE_FU);
        super.addEmoticon(PE_RUNNER);
        super.addEmoticon(PE_RUNNING);
        super.addEmoticon(PE_COUPLE);
        super.addEmoticon(PE_FAMILY);
        super.addEmoticon(PE_TWO_MEN_HOLDING_HANDS);
        super.addEmoticon(PE_TWO_WOMEN_HOLDING_HANDS);
        super.addEmoticon(PE_DANCER);
        super.addEmoticon(PE_DANCERS);
        super.addEmoticon(PE_OK_WOMAN);
        super.addEmoticon(PE_NO_GOOD);
        super.addEmoticon(PE_INFORMATION_DESK_PERSON);
        super.addEmoticon(PE_RAISING_HAND);
        super.addEmoticon(PE_BRIDE_WITH_VEIL);
        super.addEmoticon(PE_PERSON_WITH_POUTING_FACE);
        super.addEmoticon(PE_PERSON_FROWNING);
        super.addEmoticon(PE_BOW);
        super.addEmoticon(PE_COUPLEKISS);
        super.addEmoticon(PE_COUPLE_WITH_HEART);
        super.addEmoticon(PE_MASSAGE);
        super.addEmoticon(PE_HAIRCUT);
        super.addEmoticon(PE_NAIL_CARE);
        super.addEmoticon(PE_BOY);
        super.addEmoticon(PE_GIRL);
        super.addEmoticon(PE_WOMAN);
        super.addEmoticon(PE_MAN);
        super.addEmoticon(PE_BABY);
        super.addEmoticon(PE_OLDER_WOMAN);
        super.addEmoticon(PE_OLDER_MAN);
        super.addEmoticon(PE_PERSON_WITH_BLOND_HAIR);
        super.addEmoticon(PE_MAN_WITH_GUA_PI_MAO);
        super.addEmoticon(PE_MAN_WITH_TURBAN);
        super.addEmoticon(PE_CONSTRUCTION_WORKER);
        super.addEmoticon(PE_COP);
        super.addEmoticon(PE_ANGEL);
        super.addEmoticon(PE_PRINCESS);
        super.addEmoticon(PE_SMILEY_CAT);
        super.addEmoticon(PE_SMILE_CAT);
        super.addEmoticon(PE_HEART_EYES_CAT);
        super.addEmoticon(PE_KISSING_CAT);
        super.addEmoticon(PE_SMIRK_CAT);
        super.addEmoticon(PE_SCREAM_CAT);
        super.addEmoticon(PE_CRYING_CAT_FACE);
        super.addEmoticon(PE_JOY_CAT);
        super.addEmoticon(PE_POUTING_CAT);
        super.addEmoticon(PE_JAPANESE_OGRE);
        super.addEmoticon(PE_JAPANESE_GOBLIN);
        super.addEmoticon(PE_SEE_NO_EVIL);
        super.addEmoticon(PE_HEAR_NO_EVIL);
        super.addEmoticon(PE_SPEAK_NO_EVIL);
        super.addEmoticon(PE_GUARDSMAN);
        super.addEmoticon(PE_SKULL);
        super.addEmoticon(PE_FEET);
        super.addEmoticon(PE_LIPS);
        super.addEmoticon(PE_KISS);
        super.addEmoticon(PE_DROPLET);
        super.addEmoticon(PE_EAR);
        super.addEmoticon(PE_EYES);
        super.addEmoticon(PE_NOSE);
        super.addEmoticon(PE_TONGUE);
        super.addEmoticon(PE_LOVE_LETTER);
        super.addEmoticon(PE_BUST_IN_SILHOUETTE);
        super.addEmoticon(PE_BUSTS_IN_SILHOUETTE);
        super.addEmoticon(PE_SPEECH_BALLOON);
        super.addEmoticon(PE_THOUGHT_BALLOON);
        super.addEmoticon(PE_FEELSGOOD);
        super.addEmoticon(PE_FINNADIE);
        super.addEmoticon(PE_GOBERSERK);
        super.addEmoticon(PE_GODMODE);
        super.addEmoticon(PE_HURTREALBAD);
        super.addEmoticon(PE_RAGE1);
        super.addEmoticon(PE_RAGE2);
        super.addEmoticon(PE_RAGE3);
        super.addEmoticon(PE_RAGE4);
        super.addEmoticon(PE_SUSPECT);
        super.addEmoticon(PE_TROLLFACE);
        // END PEOPLE #########################################################

        // START PLACES #######################################################
        super.addEmoticon(PL_HOUSE);
        super.addEmoticon(PL_HOUSE_WITH_GARDEN);
        super.addEmoticon(PL_SCHOOL);
        super.addEmoticon(PL_OFFICE);
        super.addEmoticon(PL_POST_OFFICE);
        super.addEmoticon(PL_HOSPITAL);
        super.addEmoticon(PL_BANK);
        super.addEmoticon(PL_CONVENIENCE_STORE);
        super.addEmoticon(PL_LOVE_HOTEL);
        super.addEmoticon(PL_HOTEL);
        super.addEmoticon(PL_WEDDING);
        super.addEmoticon(PL_CHURCH);
        super.addEmoticon(PL_DEPARTMENT_STORE);
        super.addEmoticon(PL_EUROPEAN_POST_OFFICE);
        super.addEmoticon(PL_CITY_SUNRISE);
        super.addEmoticon(PL_CITY_SUNSET);
        super.addEmoticon(PL_JAPANESE_CASTLE);
        super.addEmoticon(PL_EUROPEAN_CASTLE);
        super.addEmoticon(PL_TENT);
        super.addEmoticon(PL_FACTORY);
        super.addEmoticon(PL_TOKYO_TOWER);
        super.addEmoticon(PL_JAPAN);
        super.addEmoticon(PL_MOUNT_FUJI);
        super.addEmoticon(PL_SUNRISE_OVER_MOUNTAINS);
        super.addEmoticon(PL_SUNRISE);
        super.addEmoticon(PL_STARS);
        super.addEmoticon(PL_STATUE_OF_LIBERTY);
        super.addEmoticon(PL_BRIDGE_AT_NIGHT);
        super.addEmoticon(PL_CAROUSEL_HORSE);
        super.addEmoticon(PL_RAINBOW);
        super.addEmoticon(PL_FERRIS_WHEEL);
        super.addEmoticon(PL_FOUNTAIN);
        super.addEmoticon(PL_ROLLER_COASTER);
        super.addEmoticon(PL_SHIP);
        super.addEmoticon(PL_SPEEDBOAT);
        super.addEmoticon(PL_BOAT);
        super.addEmoticon(PL_SAILBOAT);
        super.addEmoticon(PL_ROWBOAT);
        super.addEmoticon(PL_ANCHOR);
        super.addEmoticon(PL_ROCKET);
        super.addEmoticon(PL_AIRPLANE);
        super.addEmoticon(PL_HELICOPTER);
        super.addEmoticon(PL_STEAM_LOCOMOTIVE);
        super.addEmoticon(PL_TRAM);
        super.addEmoticon(PL_MOUNTAIN_RAILWAY);
        super.addEmoticon(PL_BIKE);
        super.addEmoticon(PL_AERIAL_TRAMWAY);
        super.addEmoticon(PL_SUSPENSION_RAILWAY);
        super.addEmoticon(PL_MOUNTAIN_CABLEWAY);
        super.addEmoticon(PL_TRACTOR);
        super.addEmoticon(PL_BLUE_CAR);
        super.addEmoticon(PL_ONCOMING_AUTOMOBILE);
        super.addEmoticon(PL_CAR);
        super.addEmoticon(PL_RED_CAR);
        super.addEmoticon(PL_TAXI);
        super.addEmoticon(PL_ONCOMING_TAXI);
        super.addEmoticon(PL_ARTICULATED_LORRY);
        super.addEmoticon(PL_BUS);
        super.addEmoticon(PL_ONCOMING_BUS);
        super.addEmoticon(PL_ROTATING_LIGHT);
        super.addEmoticon(PL_POLICE_CAR);
        super.addEmoticon(PL_ONCOMING_POLICE_CAR);
        super.addEmoticon(PL_FIRE_ENGINE);
        super.addEmoticon(PL_AMBULANCE);
        super.addEmoticon(PL_MINIBUS);
        super.addEmoticon(PL_TRUCK);
        super.addEmoticon(PL_TRAIN);
        super.addEmoticon(PL_STATION);
        super.addEmoticon(PL_TRAIN2);
        super.addEmoticon(PL_BULLETTRAIN_FRONT);
        super.addEmoticon(PL_BULLETTRAIN_SIDE);
        super.addEmoticon(PL_LIGHT_RAIL);
        super.addEmoticon(PL_MONORAIL);
        super.addEmoticon(PL_RAILWAY_CAR);
        super.addEmoticon(PL_TROLLEYBUS);
        super.addEmoticon(PL_TICKET);
        super.addEmoticon(PL_FUELPUMP);
        super.addEmoticon(PL_VERTICAL_TRAFFIC_LIGHT);
        super.addEmoticon(PL_TRAFFIC_LIGHT);
        super.addEmoticon(PL_WARNING);
        super.addEmoticon(PL_CONSTRUCTION);
        super.addEmoticon(PL_BEGINNER);
        super.addEmoticon(PL_ATM);
        super.addEmoticon(PL_SLOT_MACHINE);
        super.addEmoticon(PL_BUSSTOP);
        super.addEmoticon(PL_BARBER);
        super.addEmoticon(PL_HOTSPRINGS);
        super.addEmoticon(PL_CHECKERED_FLAG);
        super.addEmoticon(PL_CROSSED_FLAGS);
        super.addEmoticon(PL_IZAKAYA_LANTERN);
        super.addEmoticon(PL_MOYAI);
        super.addEmoticon(PL_CIRCUS_TENT);
        super.addEmoticon(PL_PERFORMING_ARTS);
        super.addEmoticon(PL_ROUND_PUSHPING);
        super.addEmoticon(PL_TRIANGULAR_FLAG_ON_POST);
        super.addEmoticon(PL_JP);
        super.addEmoticon(PL_KR);
        super.addEmoticon(PL_CN);
        super.addEmoticon(PL_US);
        super.addEmoticon(PL_FR);
        super.addEmoticon(PL_ES);
        super.addEmoticon(PL_IT);
        super.addEmoticon(PL_RU);
        super.addEmoticon(PL_GB);
        super.addEmoticon(PL_UK);
        super.addEmoticon(PL_DE);
        // END PLACES #########################################################

        // START SYMBOLS ######################################################
        super.addEmoticon(SY_ONE);
        super.addEmoticon(SY_TWO);
        super.addEmoticon(SY_THREE);
        super.addEmoticon(SY_FOUR);
        super.addEmoticon(SY_FIVE);
        super.addEmoticon(SY_SIX);
        super.addEmoticon(SY_SEVEN);
        super.addEmoticon(SY_EIGHT);
        super.addEmoticon(SY_NINE);
        super.addEmoticon(SY_KEYCAP_TEN);
        super.addEmoticon(SY_1234);
        super.addEmoticon(SY_ZERO);
        super.addEmoticon(SY_HASH);
        super.addEmoticon(SY_SYMBOLS);
        super.addEmoticon(SY_ARROW_BACKWARD);
        super.addEmoticon(SY_ARROW_DOWN);
        super.addEmoticon(SY_ARROW_FORWARD);
        super.addEmoticon(SY_ARROW_LEFT);
        super.addEmoticon(SY_CAPITAL_ABCD);
        super.addEmoticon(SY_ABCD);
        super.addEmoticon(SY_ABC);
        super.addEmoticon(SY_ARROW_LOWER_LEFT);
        super.addEmoticon(SY_ARROW_LOWER_RIGHT);
        super.addEmoticon(SY_ARROW_RIGHT);
        super.addEmoticon(SY_ARROW_UP);
        super.addEmoticon(SY_ARROW_UPPER_LEFT);
        super.addEmoticon(SY_ARROW_UPPER_RIGHT);
        super.addEmoticon(SY_ARROW_DOUBLE_DOWN);
        super.addEmoticon(SY_ARROW_DOUBLE_UP);
        super.addEmoticon(SY_ARROW_DOWN_SMALL);
        super.addEmoticon(SY_ARROW_HEADING_DOWN);
        super.addEmoticon(SY_ARROW_HEADING_UP);
        super.addEmoticon(SY_LEFTWARDS_ARROW_WITH_HOOK);
        super.addEmoticon(SY_ARROW_RIGHT_HOOK);
        super.addEmoticon(SY_LEFT_RIGHT_ARROW);
        super.addEmoticon(SY_ARROW_UP_DOWN);
        super.addEmoticon(SY_ARROW_UP_SMALL);
        super.addEmoticon(SY_ARROWS_CLOCKWISE);
        super.addEmoticon(SY_ARROWS_COUNTERCLOCKWISE);
        super.addEmoticon(SY_REWIND);
        super.addEmoticon(SY_FAST_FORWARD);
        super.addEmoticon(SY_INFORMATION_SOURCE);
        super.addEmoticon(SY_OK);
        super.addEmoticon(SY_TWISTED_RIGHTWARDS_ARROWS);
        super.addEmoticon(SY_REPEAT);
        super.addEmoticon(SY_REPEAT_ONE);
        super.addEmoticon(SY_NEW);
        super.addEmoticon(SY_TOP);
        super.addEmoticon(SY_UP);
        super.addEmoticon(SY_COOL);
        super.addEmoticon(SY_FREE);
        super.addEmoticon(SY_NG);
        super.addEmoticon(SY_CINEMA);
        super.addEmoticon(SY_KOKO);
        super.addEmoticon(SY_SIGNAL_STRENGTH);
        super.addEmoticon(SY_U5272);
        super.addEmoticon(SY_U5408);
        super.addEmoticon(SY_U55B6);
        super.addEmoticon(SY_U6307);
        super.addEmoticon(SY_U6708);
        super.addEmoticon(SY_U6709);
        super.addEmoticon(SY_U6E80);
        super.addEmoticon(SY_U7121);
        super.addEmoticon(SY_U7533);
        super.addEmoticon(SY_U7A7A);
        super.addEmoticon(SY_U7981);
        super.addEmoticon(SY_SA);
        super.addEmoticon(SY_RESTROOM);
        super.addEmoticon(SY_MENS);
        super.addEmoticon(SY_WOMENS);
        super.addEmoticon(SY_BABY_SYMBOL);
        super.addEmoticon(SY_NO_SMOKING);
        super.addEmoticon(SY_PARKING);
        super.addEmoticon(SY_WHEELCHAIR);
        super.addEmoticon(SY_METRO);
        super.addEmoticon(SY_BAGGAGE_CLAIM);
        super.addEmoticon(SY_ACCEPT);
        super.addEmoticon(SY_WC);
        super.addEmoticon(SY_POTABLE_WATER);
        super.addEmoticon(SY_PUT_LITTER_IN_ITS_PLACE);
        super.addEmoticon(SY_SECRET);
        super.addEmoticon(SY_CONGRATULATIONS);
        super.addEmoticon(SY_M);
        super.addEmoticon(SY_PASSPORT_CONTROL);
        super.addEmoticon(SY_LEFT_LUGGAGE);
        super.addEmoticon(SY_CUSTOMS);
        super.addEmoticon(SY_IDEOGRAPH_ADVANTAGE);
        super.addEmoticon(SY_CL);
        super.addEmoticon(SY_SOS);
        super.addEmoticon(SY_ID);
        super.addEmoticon(SY_NO_ENTRY_SIGN);
        super.addEmoticon(SY_UNDERAGE);
        super.addEmoticon(SY_NO_MOBILE_PHONES);
        super.addEmoticon(SY_DO_NOT_LITTER);
        super.addEmoticon(SY_NON_POTABLE_WATER);
        super.addEmoticon(SY_NO_BICYCLES);
        super.addEmoticon(SY_NO_PEDESTRIANS);
        super.addEmoticon(SY_CHILDREN_CROSSING);
        super.addEmoticon(SY_NO_ENTRY);
        super.addEmoticon(SY_EIGHT_SPOKED_ASTERISK);
        super.addEmoticon(SY_SPARKLE);
        super.addEmoticon(SY_EIGHT_POINTED_BLACK_STAR);
        super.addEmoticon(SY_HEART_DECORATION);
        super.addEmoticon(SY_VS);
        super.addEmoticon(SY_VIBRATION_MODE);
        super.addEmoticon(SY_MOBILE_PHONE_OFF);
        super.addEmoticon(SY_CHART);
        super.addEmoticon(SY_CURRENCY_EXCHANGE);
        super.addEmoticon(SY_ARIES);
        super.addEmoticon(SY_TAURUS);
        super.addEmoticon(SY_GEMINI);
        super.addEmoticon(SY_CANCER);
        super.addEmoticon(SY_LEO);
        super.addEmoticon(SY_VIRGO);
        super.addEmoticon(SY_LIBRA);
        super.addEmoticon(SY_SCORPIUS);
        super.addEmoticon(SY_SAGITTARIUS);
        super.addEmoticon(SY_CAPRICORN);
        super.addEmoticon(SY_AQUARIUS);
        super.addEmoticon(SY_PISCES);
        super.addEmoticon(SY_OPHIUCHUS);
        super.addEmoticon(SY_SIX_POINTED_STAR);
        super.addEmoticon(SY_NEGATIVE_SQUARED_CROSS_MARK);
        super.addEmoticon(SY_A);
        super.addEmoticon(SY_B);
        super.addEmoticon(SY_AB);
        super.addEmoticon(SY_O2);
        super.addEmoticon(SY_DIAMOND_SHAPE_WITH_A_DOT_INSIDE);
        super.addEmoticon(SY_RECYCLE);
        super.addEmoticon(SY_END);
        super.addEmoticon(SY_BACK);
        super.addEmoticon(SY_ON);
        super.addEmoticon(SY_SOON);
        super.addEmoticon(SY_CLOCK1);
        super.addEmoticon(SY_CLOCK130);
        super.addEmoticon(SY_CLOCK10);
        super.addEmoticon(SY_CLOCK1030);
        super.addEmoticon(SY_CLOCK11);
        super.addEmoticon(SY_CLOCK1130);
        super.addEmoticon(SY_CLOCK12);
        super.addEmoticon(SY_CLOCK1230);
        super.addEmoticon(SY_CLOCK2);
        super.addEmoticon(SY_CLOCK230);
        super.addEmoticon(SY_CLOCK3);
        super.addEmoticon(SY_CLOCK330);
        super.addEmoticon(SY_CLOCK4);
        super.addEmoticon(SY_CLOCK430);
        super.addEmoticon(SY_CLOCK5);
        super.addEmoticon(SY_CLOCK530);
        super.addEmoticon(SY_CLOCK6);
        super.addEmoticon(SY_CLOCK630);
        super.addEmoticon(SY_CLOCK7);
        super.addEmoticon(SY_CLOCK730);
        super.addEmoticon(SY_CLOCK8);
        super.addEmoticon(SY_CLOCK830);
        super.addEmoticon(SY_CLOCK9);
        super.addEmoticon(SY_CLOCK930);
        super.addEmoticon(SY_HEAVY_DOLLAR_SIGN);
        super.addEmoticon(SY_COPYRIGHT);
        super.addEmoticon(SY_REGISTERED);
        super.addEmoticon(SY_TM);
        super.addEmoticon(SY_X);
        super.addEmoticon(SY_HEAVY_EXCLAMATION_MARK);
        super.addEmoticon(SY_BANGBANG);
        super.addEmoticon(SY_INTERROBANG);
        super.addEmoticon(SY_O);
        super.addEmoticon(SY_HEAVY_MULTIPLICATION_X);
        super.addEmoticon(SY_HEAVY_PLUS_SIGN);
        super.addEmoticon(SY_HEAVY_MINUS_SIGN);
        super.addEmoticon(SY_HEAVY_DIVISION_SIGN);
        super.addEmoticon(SY_WHITE_FLOWER);
        super.addEmoticon(SY_100);
        super.addEmoticon(SY_HEAVY_CHECK_MARK);
        super.addEmoticon(SY_BALLOT_BOX_WITH_CHECK);
        super.addEmoticon(SY_RADIO_BUTTON);
        super.addEmoticon(SY_LINK);
        super.addEmoticon(SY_CURLY_LOOP);
        super.addEmoticon(SY_WAVY_DASH);
        super.addEmoticon(SY_PART_ALTERNATION_MARK);
        super.addEmoticon(SY_TRIDENT);
        super.addEmoticon(SY_BLACK_SMALL_SQUARE);
        super.addEmoticon(SY_WHITE_SMALL_SQUARE);
        super.addEmoticon(SY_BLACK_MEDIUM_SMALL_SQUARE);
        super.addEmoticon(SY_WHITE_MEDIUM_SMALL_SQUARE);
        super.addEmoticon(SY_BLACK_MEDIUM_SQUARE);
        super.addEmoticon(SY_WHITE_MEDIUM_SQUARE);
        super.addEmoticon(SY_BLACK_LARGE_SQUARE);
        super.addEmoticon(SY_WHITE_LARGE_SQUARE);
        super.addEmoticon(SY_WHITE_CHECK_MARK);
        super.addEmoticon(SY_BLACK_SQUARE_BUTTON);
        super.addEmoticon(SY_WHITE_SQUARE_BUTTON);
        super.addEmoticon(SY_BLACK_CIRCLE);
        super.addEmoticon(SY_WHITE_CIRCLE);
        super.addEmoticon(SY_RED_CIRCLE);
        super.addEmoticon(SY_LARGE_BLUE_CIRCLE);
        super.addEmoticon(SY_LARGE_BLUE_DIAMOND);
        super.addEmoticon(SY_LARGE_ORANGE_DIAMOND);
        super.addEmoticon(SY_SMALL_BLUE_DIAMOND);
        super.addEmoticon(SY_SMALL_ORANGE_DIAMOND);
        super.addEmoticon(SY_SMALL_RED_TRIANGLE);
        super.addEmoticon(SY_SMALL_RED_TRIANGLE_DOWN);
        super.addEmoticon(SY_SHIPIT);
        // END SYMBOLS ########################################################
    }

}
