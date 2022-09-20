package PokemonBattle;

import java.util.Scanner;

public class PokePick {
	static Scanner in = new Scanner(System.in);
	public static Pokemon trainerPokemon;
	
	
	
public void pickPokemon() {
	System.out.println("Please choose your Pokémon \n Type 1 for: Bulbasaur \n Type 2 for: Charmander \n Type 3 for: Squirtle. "); 
	int selection = in.nextInt();
	switch (selection){
	  case 1:
		    // code block
		  PokeStart.trainerPokemon = new Bulbasaur();
		   System.out.println("You chose Bulbasaur as your partner PokeMon!");
		    break;
	 case 2:
		    // code block
		 PokeStart.trainerPokemon = new Charmander();
		 System.out.println("You chose Charmander as your partner PokeMon!");
		    break;
	 case 3:
		    // code block
		 System.out.println("You chose Squirtle as your partner PokeMon!");
		    break;

	default:  // code block
    	System.out.println("Please enter a valid option.");
	}	
}
	
}
