package fr.strategy.behavior.move;

import fr.strategy.behavior.Move;

public class Walk implements Move {

	@Override
    public void toMove() {
	    System.out.println("I walk");
	    
    }

}
