package PokemonBattle;

import java.util.Random;
import java.util.Scanner;

public class Opponent {

	Random r = new Random();
	static Scanner in = new Scanner(System.in);
	
	
	
	public void oponentPickPokemon() {
		int opponentSelection = 1 + r.nextInt(3);
		
		switch (opponentSelection){
		  case 1:
			    // code block
			  PokeStart.opponentPokemon = new Bulbasaur();
			   System.out.println("Your Opponent chose Bulbasaur as their partner PokeMon!");
			    break;
		 case 2:
			    // code block
			 PokeStart.opponentPokemon = new Charmander();
			 System.out.println("Your Opponent chose Charmander as their partner PokeMon!");
			    break;
		 case 3:
			    // code block
			 System.out.println("Your Opponent chose Squirtle as their partner PokeMon!");
			    break;

		default:  // code block
	    	
		}			
		
	}
	
	
	public int opponentDamage(int attackSelection) {
		
		return 5;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
