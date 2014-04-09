package fr.strategy.Archetypes;

import fr.strategy.behavior.Fight;
import fr.strategy.behavior.Heal;
import fr.strategy.behavior.Move;
import fr.strategy.behavior.fight.Gun;
import fr.strategy.behavior.heal.LightHeal;
import fr.strategy.behavior.move.Run;
import fr.strategy.caracters.Characters;

public class Soldier extends Characters {

	//By polymorphism override the method from the superclass Characters
	public Soldier() {
	    this.fight = new Gun();
	    this.move = new Run();
	    this.heal = new LightHeal();
    }

	public Soldier(Fight fight, Move move, Heal heal) {
	    super(fight, move, heal);
	    
    }

	
}
