/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.ObjectColor;
import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.cards.FrameStyle;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author BetaSteward_at_googlemail.com
 */
public class Zendikar extends ExpansionSet {

    private static final Zendikar instance = new Zendikar();

    public static Zendikar getInstance() {
        return instance;
    }

    private Zendikar() {
        super("Zendikar", "ZEN", ExpansionSet.buildDate(2009, 10, 2), SetType.EXPANSION); // October 2nd, 2009
        this.blockName = "Zendikar";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Adventuring Gear", 195, Rarity.COMMON, mage.cards.a.AdventuringGear.class));
        cards.add(new SetCardInfo("Aether Figment", 40, Rarity.UNCOMMON, mage.cards.a.AetherFigment.class));
        cards.add(new SetCardInfo("Akoum Refuge", 210, Rarity.UNCOMMON, mage.cards.a.AkoumRefuge.class));
        cards.add(new SetCardInfo("Archive Trap", 41, Rarity.RARE, mage.cards.a.ArchiveTrap.class));
        cards.add(new SetCardInfo("Archmage Ascension", 42, Rarity.RARE, mage.cards.a.ArchmageAscension.class));
        cards.add(new SetCardInfo("Arid Mesa", 211, Rarity.RARE, mage.cards.a.AridMesa.class, new CardGraphicInfo(new ObjectColor("WR"), null, false)));
        cards.add(new SetCardInfo("Armament Master", 1, Rarity.RARE, mage.cards.a.ArmamentMaster.class));
        cards.add(new SetCardInfo("Arrow Volley Trap", 2, Rarity.UNCOMMON, mage.cards.a.ArrowVolleyTrap.class));
        cards.add(new SetCardInfo("Bala Ged Thief", 79, Rarity.RARE, mage.cards.b.BalaGedThief.class));
        cards.add(new SetCardInfo("Baloth Cage Trap", 156, Rarity.UNCOMMON, mage.cards.b.BalothCageTrap.class));
        cards.add(new SetCardInfo("Baloth Woodcrasher", 157, Rarity.UNCOMMON, mage.cards.b.BalothWoodcrasher.class));
        cards.add(new SetCardInfo("Beast Hunt", 158, Rarity.COMMON, mage.cards.b.BeastHunt.class));
        cards.add(new SetCardInfo("Beastmaster Ascension", 159, Rarity.RARE, mage.cards.b.BeastmasterAscension.class));
        cards.add(new SetCardInfo("Blade of the Bloodchief", 196, Rarity.RARE, mage.cards.b.BladeOfTheBloodchief.class));
        cards.add(new SetCardInfo("Bladetusk Boar", 118, Rarity.COMMON, mage.cards.b.BladetuskBoar.class));
        cards.add(new SetCardInfo("Blazing Torch", 197, Rarity.UNCOMMON, mage.cards.b.BlazingTorch.class));
        cards.add(new SetCardInfo("Bloodchief Ascension", 82, Rarity.RARE, mage.cards.b.BloodchiefAscension.class));
        cards.add(new SetCardInfo("Bloodghast", 83, Rarity.RARE, mage.cards.b.Bloodghast.class));
        cards.add(new SetCardInfo("Blood Seeker", 80, Rarity.COMMON, mage.cards.b.BloodSeeker.class));
        cards.add(new SetCardInfo("Blood Tribute", 81, Rarity.RARE, mage.cards.b.BloodTribute.class));
        cards.add(new SetCardInfo("Bog Tatters", 84, Rarity.COMMON, mage.cards.b.BogTatters.class));
        cards.add(new SetCardInfo("Bold Defense", 3, Rarity.COMMON, mage.cards.b.BoldDefense.class));
        cards.add(new SetCardInfo("Brave the Elements", 4, Rarity.UNCOMMON, mage.cards.b.BraveTheElements.class));
        cards.add(new SetCardInfo("Burst Lightning", 119, Rarity.COMMON, mage.cards.b.BurstLightning.class));
        cards.add(new SetCardInfo("Caller of Gales", 43, Rarity.COMMON, mage.cards.c.CallerOfGales.class));
        cards.add(new SetCardInfo("Cancel", 44, Rarity.COMMON, mage.cards.c.Cancel.class));
        cards.add(new SetCardInfo("Caravan Hurda", 5, Rarity.COMMON, mage.cards.c.CaravanHurda.class));
        cards.add(new SetCardInfo("Carnage Altar", 198, Rarity.UNCOMMON, mage.cards.c.CarnageAltar.class));
        cards.add(new SetCardInfo("Celestial Mantle", 6, Rarity.RARE, mage.cards.c.CelestialMantle.class));
        cards.add(new SetCardInfo("Chandra Ablaze", 120, Rarity.MYTHIC, mage.cards.c.ChandraAblaze.class));
        cards.add(new SetCardInfo("Cliff Threader", 7, Rarity.COMMON, mage.cards.c.CliffThreader.class));
        cards.add(new SetCardInfo("Cobra Trap", 160, Rarity.UNCOMMON, mage.cards.c.CobraTrap.class));
        cards.add(new SetCardInfo("Conqueror's Pledge", 8, Rarity.RARE, mage.cards.c.ConquerorsPledge.class));
        cards.add(new SetCardInfo("Cosi's Trickster", 45, Rarity.RARE, mage.cards.c.CosisTrickster.class));
        cards.add(new SetCardInfo("Crypt of Agadeem", 212, Rarity.RARE, mage.cards.c.CryptOfAgadeem.class));
        cards.add(new SetCardInfo("Crypt Ripper", 85, Rarity.COMMON, mage.cards.c.CryptRipper.class));
        cards.add(new SetCardInfo("Day of Judgment", 9, Rarity.RARE, mage.cards.d.DayOfJudgment.class));
        cards.add(new SetCardInfo("Demolish", 121, Rarity.COMMON, mage.cards.d.Demolish.class));
        cards.add(new SetCardInfo("Desecrated Earth", 86, Rarity.COMMON, mage.cards.d.DesecratedEarth.class));
        cards.add(new SetCardInfo("Devout Lightcaster", 10, Rarity.RARE, mage.cards.d.DevoutLightcaster.class));
        cards.add(new SetCardInfo("Disfigure", 87, Rarity.COMMON, mage.cards.d.Disfigure.class));
        cards.add(new SetCardInfo("Eldrazi Monument", 199, Rarity.MYTHIC, mage.cards.e.EldraziMonument.class));
        cards.add(new SetCardInfo("Electropotence", 122, Rarity.RARE, mage.cards.e.Electropotence.class));
        cards.add(new SetCardInfo("Elemental Appeal", 123, Rarity.RARE, mage.cards.e.ElementalAppeal.class));
        cards.add(new SetCardInfo("Emeria Angel", 11, Rarity.RARE, mage.cards.e.EmeriaAngel.class));
        cards.add(new SetCardInfo("Emeria, the Sky Ruin", 213, Rarity.RARE, mage.cards.e.EmeriaTheSkyRuin.class));
        cards.add(new SetCardInfo("Eternity Vessel", 200, Rarity.MYTHIC, mage.cards.e.EternityVessel.class));
        cards.add(new SetCardInfo("Expedition Map", 201, Rarity.COMMON, mage.cards.e.ExpeditionMap.class));
        cards.add(new SetCardInfo("Explorer's Scope", 202, Rarity.COMMON, mage.cards.e.ExplorersScope.class));
        cards.add(new SetCardInfo("Feast of Blood", 88, Rarity.UNCOMMON, mage.cards.f.FeastOfBlood.class));
        cards.add(new SetCardInfo("Felidar Sovereign", 12, Rarity.MYTHIC, mage.cards.f.FelidarSovereign.class));
        cards.add(new SetCardInfo("Forest", 246, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Forest", 247, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Forest", 248, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Forest", 249, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Forest", 266, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 267, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 268, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 269, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Frontier Guide", 161, Rarity.UNCOMMON, mage.cards.f.FrontierGuide.class));
        cards.add(new SetCardInfo("Gatekeeper of Malakir", 89, Rarity.UNCOMMON, mage.cards.g.GatekeeperOfMalakir.class));
        cards.add(new SetCardInfo("Geyser Glider", 124, Rarity.UNCOMMON, mage.cards.g.GeyserGlider.class));
        cards.add(new SetCardInfo("Giant Scorpion", 90, Rarity.COMMON, mage.cards.g.GiantScorpion.class));
        cards.add(new SetCardInfo("Gigantiform", 162, Rarity.RARE, mage.cards.g.Gigantiform.class));
        cards.add(new SetCardInfo("Goblin Bushwhacker", 125, Rarity.COMMON, mage.cards.g.GoblinBushwhacker.class));
        cards.add(new SetCardInfo("Goblin Guide", 126, Rarity.RARE, mage.cards.g.GoblinGuide.class));
        cards.add(new SetCardInfo("Goblin Ruinblaster", 127, Rarity.UNCOMMON, mage.cards.g.GoblinRuinblaster.class));
        cards.add(new SetCardInfo("Goblin Shortcutter", 128, Rarity.COMMON, mage.cards.g.GoblinShortcutter.class));
        cards.add(new SetCardInfo("Goblin War Paint", 129, Rarity.COMMON, mage.cards.g.GoblinWarPaint.class));
        cards.add(new SetCardInfo("Gomazoa", 46, Rarity.UNCOMMON, mage.cards.g.Gomazoa.class));
        cards.add(new SetCardInfo("Grappling Hook", 203, Rarity.RARE, mage.cards.g.GrapplingHook.class));
        cards.add(new SetCardInfo("Graypelt Refuge", 214, Rarity.UNCOMMON, mage.cards.g.GraypeltRefuge.class));
        cards.add(new SetCardInfo("Grazing Gladehart", 163, Rarity.COMMON, mage.cards.g.GrazingGladehart.class));
        cards.add(new SetCardInfo("Greenweaver Druid", 164, Rarity.UNCOMMON, mage.cards.g.GreenweaverDruid.class));
        cards.add(new SetCardInfo("Grim Discovery", 91, Rarity.COMMON, mage.cards.g.GrimDiscovery.class));
        cards.add(new SetCardInfo("Guul Draz Specter", 92, Rarity.RARE, mage.cards.g.GuulDrazSpecter.class));
        cards.add(new SetCardInfo("Guul Draz Vampire", 93, Rarity.COMMON, mage.cards.g.GuulDrazVampire.class));
        cards.add(new SetCardInfo("Hagra Crocodile", 94, Rarity.COMMON, mage.cards.h.HagraCrocodile.class));
        cards.add(new SetCardInfo("Hagra Diabolist", 95, Rarity.UNCOMMON, mage.cards.h.HagraDiabolist.class));
        cards.add(new SetCardInfo("Halo Hunter", 96, Rarity.RARE, mage.cards.h.HaloHunter.class));
        cards.add(new SetCardInfo("Harrow", 165, Rarity.COMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Heartstabber Mosquito", 97, Rarity.COMMON, mage.cards.h.HeartstabberMosquito.class));
        cards.add(new SetCardInfo("Hedron Crab", 47, Rarity.UNCOMMON, mage.cards.h.HedronCrab.class));
        cards.add(new SetCardInfo("Hedron Scrabbler", 204, Rarity.COMMON, mage.cards.h.HedronScrabbler.class));
        cards.add(new SetCardInfo("Hellfire Mongrel", 130, Rarity.UNCOMMON, mage.cards.h.HellfireMongrel.class));
        cards.add(new SetCardInfo("Hellkite Charger", 131, Rarity.RARE, mage.cards.h.HellkiteCharger.class));
        cards.add(new SetCardInfo("Hideous End", 98, Rarity.COMMON, mage.cards.h.HideousEnd.class));
        cards.add(new SetCardInfo("Highland Berserker", 132, Rarity.COMMON, mage.cards.h.HighlandBerserker.class));
        cards.add(new SetCardInfo("Inferno Trap", 133, Rarity.UNCOMMON, mage.cards.i.InfernoTrap.class));
        cards.add(new SetCardInfo("Into the Roil", 48, Rarity.COMMON, mage.cards.i.IntoTheRoil.class));
        cards.add(new SetCardInfo("Iona, Shield of Emeria", 13, Rarity.MYTHIC, mage.cards.i.IonaShieldOfEmeria.class));
        cards.add(new SetCardInfo("Ior Ruin Expedition", 49, Rarity.COMMON, mage.cards.i.IorRuinExpedition.class));
        cards.add(new SetCardInfo("Island", 234, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Island", 235, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Island", 236, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Island", 237, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Island", 254, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 256, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Joraga Bard", 166, Rarity.COMMON, mage.cards.j.JoragaBard.class));
        cards.add(new SetCardInfo("Journey to Nowhere", 14, Rarity.COMMON, mage.cards.j.JourneyToNowhere.class));
        cards.add(new SetCardInfo("Jwar Isle Refuge", 215, Rarity.UNCOMMON, mage.cards.j.JwarIsleRefuge.class));
        cards.add(new SetCardInfo("Kabira Crossroads", 216, Rarity.COMMON, mage.cards.k.KabiraCrossroads.class));
        cards.add(new SetCardInfo("Kabira Evangel", 15, Rarity.RARE, mage.cards.k.KabiraEvangel.class));
        cards.add(new SetCardInfo("Kalitas, Bloodchief of Ghet", 99, Rarity.MYTHIC, mage.cards.k.KalitasBloodchiefOfGhet.class));
        cards.add(new SetCardInfo("Kazandu Blademaster", 16, Rarity.UNCOMMON, mage.cards.k.KazanduBlademaster.class));
        cards.add(new SetCardInfo("Kazandu Refuge", 217, Rarity.UNCOMMON, mage.cards.k.KazanduRefuge.class));
        cards.add(new SetCardInfo("Kazuul Warlord", 134, Rarity.RARE, mage.cards.k.KazuulWarlord.class));
        cards.add(new SetCardInfo("Khalni Gem", 205, Rarity.UNCOMMON, mage.cards.k.KhalniGem.class));
        cards.add(new SetCardInfo("Khalni Heart Expedition", 167, Rarity.COMMON, mage.cards.k.KhalniHeartExpedition.class));
        cards.add(new SetCardInfo("Kor Aeronaut", 17, Rarity.UNCOMMON, mage.cards.k.KorAeronaut.class));
        cards.add(new SetCardInfo("Kor Cartographer", 18, Rarity.COMMON, mage.cards.k.KorCartographer.class));
        cards.add(new SetCardInfo("Kor Duelist", 19, Rarity.UNCOMMON, mage.cards.k.KorDuelist.class));
        cards.add(new SetCardInfo("Kor Hookmaster", 20, Rarity.COMMON, mage.cards.k.KorHookmaster.class));
        cards.add(new SetCardInfo("Kor Outfitter", 21, Rarity.COMMON, mage.cards.k.KorOutfitter.class));
        cards.add(new SetCardInfo("Kor Sanctifiers", 22, Rarity.COMMON, mage.cards.k.KorSanctifiers.class));
        cards.add(new SetCardInfo("Kor Skyfisher", 23, Rarity.COMMON, mage.cards.k.KorSkyfisher.class));
        cards.add(new SetCardInfo("Kraken Hatchling", 50, Rarity.COMMON, mage.cards.k.KrakenHatchling.class));
        cards.add(new SetCardInfo("Landbind Ritual", 24, Rarity.UNCOMMON, mage.cards.l.LandbindRitual.class));
        cards.add(new SetCardInfo("Lavaball Trap", 135, Rarity.RARE, mage.cards.l.LavaballTrap.class));
        cards.add(new SetCardInfo("Lethargy Trap", 51, Rarity.COMMON, mage.cards.l.LethargyTrap.class));
        cards.add(new SetCardInfo("Living Tsunami", 52, Rarity.UNCOMMON, mage.cards.l.LivingTsunami.class));
        cards.add(new SetCardInfo("Lorthos, the Tidemaker", 53, Rarity.MYTHIC, mage.cards.l.LorthosTheTidemaker.class));
        cards.add(new SetCardInfo("Lotus Cobra", 168, Rarity.MYTHIC, mage.cards.l.LotusCobra.class));
        cards.add(new SetCardInfo("Lullmage Mentor", 54, Rarity.RARE, mage.cards.l.LullmageMentor.class));
        cards.add(new SetCardInfo("Luminarch Ascension", 25, Rarity.RARE, mage.cards.l.LuminarchAscension.class));
        cards.add(new SetCardInfo("Magma Rift", 136, Rarity.COMMON, mage.cards.m.MagmaRift.class));
        cards.add(new SetCardInfo("Magosi, the Waterveil", 218, Rarity.RARE, mage.cards.m.MagosiTheWaterveil.class));
        cards.add(new SetCardInfo("Makindi Shieldmate", 26, Rarity.COMMON, mage.cards.m.MakindiShieldmate.class));
        cards.add(new SetCardInfo("Malakir Bloodwitch", 100, Rarity.RARE, mage.cards.m.MalakirBloodwitch.class));
        cards.add(new SetCardInfo("Mark of Mutiny", 137, Rarity.UNCOMMON, mage.cards.m.MarkOfMutiny.class));
        cards.add(new SetCardInfo("Marsh Casualties", 101, Rarity.UNCOMMON, mage.cards.m.MarshCasualties.class));
        cards.add(new SetCardInfo("Marsh Flats", 219, Rarity.RARE, mage.cards.m.MarshFlats.class, new CardGraphicInfo(new ObjectColor("WB"), null, false)));
        cards.add(new SetCardInfo("Merfolk Seastalkers", 55, Rarity.UNCOMMON, mage.cards.m.MerfolkSeastalkers.class));
        cards.add(new SetCardInfo("Merfolk Wayfinder", 56, Rarity.UNCOMMON, mage.cards.m.MerfolkWayfinder.class));
        cards.add(new SetCardInfo("Mindbreak Trap", 57, Rarity.MYTHIC, mage.cards.m.MindbreakTrap.class));
        cards.add(new SetCardInfo("Mindless Null", 103, Rarity.COMMON, mage.cards.m.MindlessNull.class));
        cards.add(new SetCardInfo("Mind Sludge", 102, Rarity.UNCOMMON, mage.cards.m.MindSludge.class));
        cards.add(new SetCardInfo("Mire Blight", 104, Rarity.COMMON, mage.cards.m.MireBlight.class));
        cards.add(new SetCardInfo("Misty Rainforest", 220, Rarity.RARE, mage.cards.m.MistyRainforest.class, new CardGraphicInfo(new ObjectColor("UG"), null,
                false)));
        cards.add(new SetCardInfo("Mold Shambler", 169, Rarity.COMMON, mage.cards.m.MoldShambler.class));
        cards.add(new SetCardInfo("Molten Ravager", 138, Rarity.COMMON, mage.cards.m.MoltenRavager.class));
        cards.add(new SetCardInfo("Mountain", 242, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Mountain", 243, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Mountain", 244, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Mountain", 245, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Mountain", 262, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 263, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 264, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Murasa Pyromancer", 139, Rarity.UNCOMMON, mage.cards.m.MurasaPyromancer.class));
        cards.add(new SetCardInfo("Narrow Escape", 27, Rarity.COMMON, mage.cards.n.NarrowEscape.class));
        cards.add(new SetCardInfo("Needlebite Trap", 105, Rarity.UNCOMMON, mage.cards.n.NeedlebiteTrap.class));
        cards.add(new SetCardInfo("Nimana Sell-Sword", 106, Rarity.COMMON, mage.cards.n.NimanaSellSword.class));
        cards.add(new SetCardInfo("Nimbus Wings", 28, Rarity.COMMON, mage.cards.n.NimbusWings.class));
        cards.add(new SetCardInfo("Nissa Revane", 170, Rarity.MYTHIC, mage.cards.n.NissaRevane.class));
        cards.add(new SetCardInfo("Nissa's Chosen", 171, Rarity.COMMON, mage.cards.n.NissasChosen.class));
        cards.add(new SetCardInfo("Noble Vestige", 29, Rarity.COMMON, mage.cards.n.NobleVestige.class));
        cards.add(new SetCardInfo("Ob Nixilis, the Fallen", 107, Rarity.MYTHIC, mage.cards.o.ObNixilisTheFallen.class));
        cards.add(new SetCardInfo("Obsidian Fireheart", 140, Rarity.MYTHIC, mage.cards.o.ObsidianFireheart.class));
        cards.add(new SetCardInfo("Ondu Cleric", 30, Rarity.COMMON, mage.cards.o.OnduCleric.class));
        cards.add(new SetCardInfo("Oracle of Mul Daya", 172, Rarity.RARE, mage.cards.o.OracleOfMulDaya.class));
        cards.add(new SetCardInfo("Oran-Rief Recluse", 173, Rarity.COMMON, mage.cards.o.OranRiefRecluse.class));
        cards.add(new SetCardInfo("Oran-Rief Survivalist", 174, Rarity.COMMON, mage.cards.o.OranRiefSurvivalist.class));
        cards.add(new SetCardInfo("Oran-Rief, the Vastwood", 221, Rarity.RARE, mage.cards.o.OranRiefTheVastwood.class));
        cards.add(new SetCardInfo("Paralyzing Grasp", 58, Rarity.COMMON, mage.cards.p.ParalyzingGrasp.class));
        cards.add(new SetCardInfo("Pillarfield Ox", 31, Rarity.COMMON, mage.cards.p.PillarfieldOx.class));
        cards.add(new SetCardInfo("Piranha Marsh", 222, Rarity.COMMON, mage.cards.p.PiranhaMarsh.class));
        cards.add(new SetCardInfo("Pitfall Trap", 32, Rarity.UNCOMMON, mage.cards.p.PitfallTrap.class));
        cards.add(new SetCardInfo("Plains", 230, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Plains", 231, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Plains", 232, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Plains", 233, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plated Geopede", 141, Rarity.COMMON, mage.cards.p.PlatedGeopede.class));
        cards.add(new SetCardInfo("Predatory Urge", 175, Rarity.RARE, mage.cards.p.PredatoryUrge.class));
        cards.add(new SetCardInfo("Primal Bellow", 176, Rarity.UNCOMMON, mage.cards.p.PrimalBellow.class));
        cards.add(new SetCardInfo("Punishing Fire", 142, Rarity.UNCOMMON, mage.cards.p.PunishingFire.class));
        cards.add(new SetCardInfo("Pyromancer Ascension", 143, Rarity.RARE, mage.cards.p.PyromancerAscension.class));
        cards.add(new SetCardInfo("Quest for Ancient Secrets", 59, Rarity.UNCOMMON, mage.cards.q.QuestForAncientSecrets.class));
        cards.add(new SetCardInfo("Quest for Pure Flame", 144, Rarity.UNCOMMON, mage.cards.q.QuestForPureFlame.class));
        cards.add(new SetCardInfo("Quest for the Gemblades", 177, Rarity.UNCOMMON, mage.cards.q.QuestForTheGemblades.class));
        cards.add(new SetCardInfo("Quest for the Gravelord", 108, Rarity.UNCOMMON, mage.cards.q.QuestForTheGravelord.class));
        cards.add(new SetCardInfo("Quest for the Holy Relic", 33, Rarity.UNCOMMON, mage.cards.q.QuestForTheHolyRelic.class));
        cards.add(new SetCardInfo("Rampaging Baloths", 178, Rarity.MYTHIC, mage.cards.r.RampagingBaloths.class));
        cards.add(new SetCardInfo("Ravenous Trap", 109, Rarity.UNCOMMON, mage.cards.r.RavenousTrap.class));
        cards.add(new SetCardInfo("Reckless Scholar", 60, Rarity.COMMON, mage.cards.r.RecklessScholar.class));
        cards.add(new SetCardInfo("Relic Crush", 179, Rarity.COMMON, mage.cards.r.RelicCrush.class));
        cards.add(new SetCardInfo("Rite of Replication", 61, Rarity.RARE, mage.cards.r.RiteOfReplication.class));
        cards.add(new SetCardInfo("River Boa", 180, Rarity.UNCOMMON, mage.cards.r.RiverBoa.class));
        cards.add(new SetCardInfo("Roil Elemental", 62, Rarity.RARE, mage.cards.r.RoilElemental.class));
        cards.add(new SetCardInfo("Ruinous Minotaur", 145, Rarity.COMMON, mage.cards.r.RuinousMinotaur.class));
        cards.add(new SetCardInfo("Runeflare Trap", 146, Rarity.UNCOMMON, mage.cards.r.RuneflareTrap.class));
        cards.add(new SetCardInfo("Sadistic Sacrament", 110, Rarity.RARE, mage.cards.s.SadisticSacrament.class));
        cards.add(new SetCardInfo("Savage Silhouette", 181, Rarity.COMMON, mage.cards.s.SavageSilhouette.class));
        cards.add(new SetCardInfo("Scalding Tarn", 223, Rarity.RARE, mage.cards.s.ScaldingTarn.class, new CardGraphicInfo(new ObjectColor("UR"), null, false)));
        cards.add(new SetCardInfo("Scute Mob", 182, Rarity.RARE, mage.cards.s.ScuteMob.class));
        cards.add(new SetCardInfo("Scythe Tiger", 183, Rarity.COMMON, mage.cards.s.ScytheTiger.class));
        cards.add(new SetCardInfo("Sea Gate Loremaster", 63, Rarity.RARE, mage.cards.s.SeaGateLoremaster.class));
        cards.add(new SetCardInfo("Seascape Aerialist", 64, Rarity.UNCOMMON, mage.cards.s.SeascapeAerialist.class));
        cards.add(new SetCardInfo("Seismic Shudder", 147, Rarity.COMMON, mage.cards.s.SeismicShudder.class));
        cards.add(new SetCardInfo("Sejiri Refuge", 224, Rarity.UNCOMMON, mage.cards.s.SejiriRefuge.class));
        cards.add(new SetCardInfo("Shatterskull Giant", 148, Rarity.COMMON, mage.cards.s.ShatterskullGiant.class));
        cards.add(new SetCardInfo("Shepherd of the Lost", 34, Rarity.UNCOMMON, mage.cards.s.ShepherdOfTheLost.class));
        cards.add(new SetCardInfo("Shieldmate's Blessing", 35, Rarity.COMMON, mage.cards.s.ShieldmatesBlessing.class));
        cards.add(new SetCardInfo("Shoal Serpent", 65, Rarity.COMMON, mage.cards.s.ShoalSerpent.class));
        cards.add(new SetCardInfo("Sky Ruin Drake", 66, Rarity.COMMON, mage.cards.s.SkyRuinDrake.class));
        cards.add(new SetCardInfo("Slaughter Cry", 149, Rarity.COMMON, mage.cards.s.SlaughterCry.class));
        cards.add(new SetCardInfo("Soaring Seacliff", 225, Rarity.COMMON, mage.cards.s.SoaringSeacliff.class));
        cards.add(new SetCardInfo("Sorin Markov", 111, Rarity.MYTHIC, mage.cards.s.SorinMarkov.class));
        cards.add(new SetCardInfo("Soul Stair Expedition", 112, Rarity.COMMON, mage.cards.s.SoulStairExpedition.class));
        cards.add(new SetCardInfo("Spell Pierce", 67, Rarity.COMMON, mage.cards.s.SpellPierce.class));
        cards.add(new SetCardInfo("Sphinx of Jwar Isle", 68, Rarity.RARE, mage.cards.s.SphinxOfJwarIsle.class));
        cards.add(new SetCardInfo("Sphinx of Lost Truths", 69, Rarity.RARE, mage.cards.s.SphinxOfLostTruths.class));
        cards.add(new SetCardInfo("Spidersilk Net", 206, Rarity.COMMON, mage.cards.s.SpidersilkNet.class));
        cards.add(new SetCardInfo("Spire Barrage", 150, Rarity.COMMON, mage.cards.s.SpireBarrage.class));
        cards.add(new SetCardInfo("Spreading Seas", 70, Rarity.COMMON, mage.cards.s.SpreadingSeas.class));
        cards.add(new SetCardInfo("Steppe Lynx", 36, Rarity.COMMON, mage.cards.s.SteppeLynx.class));
        cards.add(new SetCardInfo("Stonework Puma", 207, Rarity.COMMON, mage.cards.s.StoneworkPuma.class));
        cards.add(new SetCardInfo("Summoner's Bane", 71, Rarity.UNCOMMON, mage.cards.s.SummonersBane.class));
        cards.add(new SetCardInfo("Summoning Trap", 184, Rarity.RARE, mage.cards.s.SummoningTrap.class));
        cards.add(new SetCardInfo("Sunspring Expedition", 37, Rarity.COMMON, mage.cards.s.SunspringExpedition.class));
        cards.add(new SetCardInfo("Surrakar Marauder", 113, Rarity.COMMON, mage.cards.s.SurrakarMarauder.class));
        cards.add(new SetCardInfo("Swamp", 238, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Swamp", 239, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Swamp", 240, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Swamp", 241, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(FrameStyle.ZEN_FULL_ART_BASIC, true)));
        cards.add(new SetCardInfo("Swamp", 258, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 259, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tajuru Archer", 185, Rarity.UNCOMMON, mage.cards.t.TajuruArcher.class));
        cards.add(new SetCardInfo("Tanglesap", 186, Rarity.COMMON, mage.cards.t.Tanglesap.class));
        cards.add(new SetCardInfo("Teetering Peaks", 226, Rarity.COMMON, mage.cards.t.TeeteringPeaks.class));
        cards.add(new SetCardInfo("Tempest Owl", 72, Rarity.COMMON, mage.cards.t.TempestOwl.class));
        cards.add(new SetCardInfo("Terra Stomper", 187, Rarity.RARE, mage.cards.t.TerraStomper.class));
        cards.add(new SetCardInfo("Territorial Baloth", 188, Rarity.COMMON, mage.cards.t.TerritorialBaloth.class));
        cards.add(new SetCardInfo("Timbermaw Larva", 189, Rarity.COMMON, mage.cards.t.TimbermawLarva.class));
        cards.add(new SetCardInfo("Torch Slinger", 151, Rarity.COMMON, mage.cards.t.TorchSlinger.class));
        cards.add(new SetCardInfo("Trailblazer's Boots", 208, Rarity.UNCOMMON, mage.cards.t.TrailblazersBoots.class));
        cards.add(new SetCardInfo("Trapfinder's Trick", 73, Rarity.COMMON, mage.cards.t.TrapfindersTrick.class));
        cards.add(new SetCardInfo("Trapmaker's Snare", 74, Rarity.UNCOMMON, mage.cards.t.TrapmakersSnare.class));
        cards.add(new SetCardInfo("Trusty Machete", 209, Rarity.UNCOMMON, mage.cards.t.TrustyMachete.class));
        cards.add(new SetCardInfo("Tuktuk Grunts", 152, Rarity.COMMON, mage.cards.t.TuktukGrunts.class));
        cards.add(new SetCardInfo("Turntimber Basilisk", 190, Rarity.UNCOMMON, mage.cards.t.TurntimberBasilisk.class));
        cards.add(new SetCardInfo("Turntimber Grove", 227, Rarity.COMMON, mage.cards.t.TurntimberGrove.class));
        cards.add(new SetCardInfo("Turntimber Ranger", 191, Rarity.RARE, mage.cards.t.TurntimberRanger.class));
        cards.add(new SetCardInfo("Umara Raptor", 75, Rarity.COMMON, mage.cards.u.UmaraRaptor.class));
        cards.add(new SetCardInfo("Unstable Footing", 153, Rarity.UNCOMMON, mage.cards.u.UnstableFooting.class));
        cards.add(new SetCardInfo("Valakut, the Molten Pinnacle", 228, Rarity.RARE, mage.cards.v.ValakutTheMoltenPinnacle.class));
        cards.add(new SetCardInfo("Vampire Hexmage", 114, Rarity.UNCOMMON, mage.cards.v.VampireHexmage.class));
        cards.add(new SetCardInfo("Vampire Lacerator", 115, Rarity.COMMON, mage.cards.v.VampireLacerator.class));
        cards.add(new SetCardInfo("Vampire Nighthawk", 116, Rarity.UNCOMMON, mage.cards.v.VampireNighthawk.class));
        cards.add(new SetCardInfo("Vampire's Bite", 117, Rarity.COMMON, mage.cards.v.VampiresBite.class));
        cards.add(new SetCardInfo("Vastwood Gorger", 192, Rarity.COMMON, mage.cards.v.VastwoodGorger.class));
        cards.add(new SetCardInfo("Verdant Catacombs", 229, Rarity.RARE, mage.cards.v.VerdantCatacombs.class, new CardGraphicInfo(new ObjectColor("BG"), null,
                false)));
        cards.add(new SetCardInfo("Vines of Vastwood", 193, Rarity.COMMON, mage.cards.v.VinesOfVastwood.class));
        cards.add(new SetCardInfo("Warren Instigator", 154, Rarity.MYTHIC, mage.cards.w.WarrenInstigator.class));
        cards.add(new SetCardInfo("Welkin Tern", 76, Rarity.COMMON, mage.cards.w.WelkinTern.class));
        cards.add(new SetCardInfo("Whiplash Trap", 77, Rarity.COMMON, mage.cards.w.WhiplashTrap.class));
        cards.add(new SetCardInfo("Windborne Charge", 38, Rarity.UNCOMMON, mage.cards.w.WindborneCharge.class));
        cards.add(new SetCardInfo("Windrider Eel", 78, Rarity.COMMON, mage.cards.w.WindriderEel.class));
        cards.add(new SetCardInfo("World Queller", 39, Rarity.RARE, mage.cards.w.WorldQueller.class));
        cards.add(new SetCardInfo("Zektar Shrine Expedition", 155, Rarity.COMMON, mage.cards.z.ZektarShrineExpedition.class));
        cards.add(new SetCardInfo("Zendikar Farguide", 194, Rarity.COMMON, mage.cards.z.ZendikarFarguide.class));
    }

}
