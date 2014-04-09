package fr.strategy.Archetypes;

import fr.strategy.behavior.Fight;
import fr.strategy.behavior.Heal;
import fr.strategy.behavior.Move;
import fr.strategy.caracters.Characters;

public class Civilian extends Characters {

	//Default constructor, the Civilian as the same properties than the caracters, Peace, Walk and NoHeal
	public Civilian (){	}

	//the constructor from the superclass Characters
	public Civilian(Fight fight, Move move, Heal heal) {
	    super(fight, move, heal);
    }
	
	

	 
}
