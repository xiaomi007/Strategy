package fr.strategy.behavior.heal;

import fr.strategy.behavior.Heal;

public class HeavyHeal implements Heal {

	@Override
	public void toHeal() {
		System.out.println("I provide a heavy heal");

	}

}
