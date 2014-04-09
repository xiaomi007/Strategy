package fr.strategy;

import java.util.ArrayList;

import fr.strategy.archetypes.Civilian;
import fr.strategy.archetypes.Medic;
import fr.strategy.archetypes.Soldier;
import fr.strategy.behavior.fight.Gun;
import fr.strategy.behavior.heal.HeavyHeal;
import fr.strategy.behavior.move.Run;
import fr.strategy.caracters.Characters;

/**
We will create several Charaters with differents archetypes and behavior.
Archetypes will be a class like Civilian, Soldier, Doctor, which will be able to evolve.

**/

public class Main {

	public static void main(String[] args) {
		
		Characters civil = new Civilian();
		Characters medic = new Medic();
		Characters soldier = new Soldier();
		
		ArrayList<Characters> list = new ArrayList<>();
		
		list.add(civil);
		list.add(medic);
		list.add(soldier);
		
		
		for(Characters c : list){
			System.out.println("--------------------");
			System.out.println("I'm a " + c.getClass().getSimpleName());
			c.fighting();
			c.moving();
			c.healing();
		}
		
		//Let them training the civilian and make him a super civilian ^^!
		civil.setFighting(new Gun());
		civil.setMoving(new Run());
		civil.setHealing(new HeavyHeal());
		
		for(Characters c : list){
			System.out.println("--------------------");
			System.out.println("I'm a " + c.getClass().getSimpleName());
			c.fighting();
			c.moving();
			c.healing();
		}	
			
		

	}

}
