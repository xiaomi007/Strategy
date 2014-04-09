package fr.strategy.Archetypes;

import fr.strategy.behavior.Fight;
import fr.strategy.behavior.Heal;
import fr.strategy.behavior.Move;
import fr.strategy.behavior.fight.Knife;
import fr.strategy.behavior.heal.HeavyHeal;
import fr.strategy.caracters.Characters;

public class Medic extends Characters {

//By polymorphism override the method from the superclass Characters	
	public Medic() {
	    super();
	    this.heal = new HeavyHeal();
	    this.fight = new Knife();
	   
    }

	public Medic(Fight fight, Move move, Heal heal) {
	    super(fight, move, heal);
	   
    }

	
}
