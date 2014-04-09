package fr.strategy.behavior.fight;

import fr.strategy.behavior.Fight;

public class Peace implements Fight {

	@Override
	public void toFight() {
		System.out.println("I don't fight");
	}
	
}
