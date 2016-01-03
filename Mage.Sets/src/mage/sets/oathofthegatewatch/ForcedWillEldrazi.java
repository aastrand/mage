/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.oathofthegatewatch;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.CastSourceTriggeredAbility;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.abilities.effects.common.UntapTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.effects.common.continuous.GainControlTargetEffect;
import mage.abilities.keyword.DevoidAbility;
import mage.abilities.keyword.HasteAbility;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Rarity;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.Target;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author fireshoes
 */
public class ForcedWillEldrazi extends CardImpl {

    public ForcedWillEldrazi(UUID ownerId) {
        super(ownerId, 96, "Forced-Will Eldrazi", Rarity.RARE, new CardType[]{CardType.CREATURE}, "{2}{R}");
        this.expansionSetCode = "OGW";
        this.subtype.add("Eldrazi");
        this.subtype.add("Drone");
        this.power = new MageInt(3);
        this.toughness = new MageInt(1);

        // Devoid
        this.addAbility(new DevoidAbility(this.color));
        
        // Haste
        this.addAbility(HasteAbility.getInstance());
        
            // When you cast Forced-Will Eldrazi, you may pay {1}{C}. If you do, gain control of target creature until end of turn. Untap that creature. It gains haste until end of turn.
        Ability ability = new CastSourceTriggeredAbility(new DoIfCostPaid(new GainControlTargetEffect(Duration.EndOfTurn), new ManaCostsImpl("{1}{C}")));
        Effect effect = new UntapTargetEffect();
        effect.setText("Untap that creature");
        ability.addEffect(effect);
        effect = new GainAbilityTargetEffect(HasteAbility.getInstance(), Duration.EndOfTurn);
        effect.setText("It gains haste until end of turn");
        ability.addEffect(effect);
        Target target = new TargetCreaturePermanent(new FilterCreaturePermanent());
        ability.addTarget(target);
        this.addAbility(ability);
    }

    public ForcedWillEldrazi(final ForcedWillEldrazi card) {
        super(card);
    }

    @Override
    public ForcedWillEldrazi copy() {
        return new ForcedWillEldrazi(this);
    }
}