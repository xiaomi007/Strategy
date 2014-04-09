package fr.strategy.behavior.fight;

import fr.strategy.behavior.Fight;

public class Gun implements Fight{

	@Override
    public void toFight() {
		System.out.println("I fight with a gun");
	    
    }

}
