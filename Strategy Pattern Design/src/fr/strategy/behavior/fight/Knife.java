package fr.strategy.behavior.fight;

import fr.strategy.behavior.Fight;

public class Knife implements Fight{

	@Override
    public void toFight() {
		System.out.println("I fight with a knife");
	    
    }

}
