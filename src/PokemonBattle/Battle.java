package PokemonBattle;

import java.util.Random;
import java.util.Scanner;

public class Battle {

	static boolean battleOver = false;
	Random r = new Random();
	Scanner in = new Scanner(System.in);
	
	
	public void fight() {
		while (!battleOver) {
			System.out.println("It is your turn, Please select an attack to perform!");
			PokeStart.trainerPokemon.getMoveSet();
			int userInput = in.nextInt();
			
			PokeStart.trainerPokemon.attackOption(userInput);
			
		}
	}
}
