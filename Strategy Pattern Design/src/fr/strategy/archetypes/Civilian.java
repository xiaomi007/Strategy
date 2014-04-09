package fr.strategy.archetypes;

import fr.strategy.behavior.Fight;
import fr.strategy.behavior.Heal;
import fr.strategy.behavior.Move;
import fr.strategy.caracters.Characters;

public class Civilian extends Characters {

	//By polymorphism override the method from the superclass Characters
	public Civilian (){
		super();
	}

	
	public Civilian(Fight fight, Move move, Heal heal) {
	    super(fight, move, heal);
    }
	
	

	 
}
