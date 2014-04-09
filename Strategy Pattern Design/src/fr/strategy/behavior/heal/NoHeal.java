package fr.strategy.behavior.heal;

import fr.strategy.behavior.Heal;

public class NoHeal implements Heal {

	@Override
	public void toHeal() {

		System.out.println("I can't heal");

	}

}
