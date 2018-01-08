package org.mage.test.cards.single.gpt;

import mage.constants.PhaseStep;
import mage.constants.Zone;
import mage.game.permanent.Permanent;
import org.junit.Assert;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

public class SteamVentsTest extends CardTestPlayerBase {
    @Test
    public void testUntapped() {
        addCard(Zone.HAND, playerA, "Steam Vents");

        setChoice(playerA, "Yes");
        playLand(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Steam Vents");
        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        assertLife(playerA, 18);

        // Check that the land is untapped
        Permanent land = getPermanent("Steam Vents", playerA.getId());
        Assert.assertEquals("Steam Vents is tapped but should not be", false, land.isTapped());

        Assert.assertTrue("The mana the land can produce should be [{U}, {R}] but it's " + playerA.getManaAvailable(currentGame).toString(), playerA.getManaAvailable(currentGame).toString().equals("[{U}, {R}]"));
    }

    @Test
    public void tesTapped() {
        addCard(Zone.HAND, playerA, "Steam Vents");

        setChoice(playerA, "No");
        playLand(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Steam Vents");
        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        assertLife(playerA, 20);

        // Check that the land is untapped
        Permanent land = getPermanent("Steam Vents", playerA.getId());
        Assert.assertEquals("Steam Vents is untapped but should not be", true, land.isTapped());

        Assert.assertTrue("The mana the land can produce should be [] but it's " + playerA.getManaAvailable(currentGame).toString(), playerA.getManaAvailable(currentGame).toString().equals("[]"));
    }

}
