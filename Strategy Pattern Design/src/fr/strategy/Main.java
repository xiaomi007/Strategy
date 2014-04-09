package fr.strategy;

import fr.strategy.Archetypes.Civilian;
import fr.strategy.behavior.move.Run;
import fr.strategy.caracters.Characters;

/**
We will create several Charaters with differents archetypes and behavior.
Archetypes will be a class like Civilian, Soldier, Doctor, which will be able to evolve.

**/

public class Main {

	public static void main(String[] args) {
		
		Characters civil = new Civilian();
		civil.fighting();
		civil.moving();
		civil.healing();
		civil.setMoving(new Run());
		civil.moving();

	}

}
