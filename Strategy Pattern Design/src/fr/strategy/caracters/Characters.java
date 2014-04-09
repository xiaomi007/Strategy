package fr.strategy.caracters;

import fr.strategy.behavior.Fight;
import fr.strategy.behavior.Heal;
import fr.strategy.behavior.Move;
import fr.strategy.behavior.fight.Peace;
import fr.strategy.behavior.heal.NoHeal;
import fr.strategy.behavior.move.Walk;

/**
The Characters class will set up what a Characters can do.
Here we will connect the behavior of the Caracters to an interface.
Behevior like how to fight, how to move, how to heal someone...
So here we will describe a default characters and then by polymorphism we will have the others archetypes.
**/


public abstract class Characters {

	/**
	We have our 3 interfaces, Fight, Move and Heal.
	Those interfaces show what a Characters is able to do without details, just big lines.
	We can put a default behavior, as Peace, Walk and NoHeal.
 	**/	
	
	//Those attributes are protected because we want there children be able to change them
	protected Fight fight = new Peace();
	protected Move move = new Walk();
	protected Heal heal = new NoHeal();
	
	
	//In the constructor we can define an default behavior
	public Characters(){
		System.out.println("New Character create");
	}
	
	//The overload constructor add the 3 behaviors and set them to the default and we initiated.
	//In this example it's not possible to intenciate Characters, but we will use the polymorphism to inheritate those properties (using super)
	public Characters(Fight fight, Move move, Heal heal){
		this.fight = fight;
		this.move  = move;
		this.heal  = heal;
	}
	
	//The function fighting 
	public void fighting(){
		fight.toFight();
	}
	
	public void moving(){
		move.toMove();
	}
	
	public void healing(){
		heal.toHeal();
	}
	
	public void setFighting(Fight f){
		this.fight = f;
	}
	
	public void setMoving(Move m){
		this.move = m;
	}
	
	public void setHealing(Heal h){
		this.heal = h;
	}
	

	
	
}
