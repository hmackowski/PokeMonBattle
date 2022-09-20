package PokemonBattle;
import java.util.Scanner;


public class PokeStart {
	
	static Scanner in = new Scanner(System.in);
	public static Pokemon trainerPokemon;
	static PokePick pick = new PokePick();
	static Opponent opp = new Opponent();
	
	
	public static void main(String[] args) throws InterruptedException {
		Battle battle = new Battle();
		battle.fight();
				
		System.out.println("Hello there! Welcome to the world of Pokémon! "
				+ "In this game you will be able to use pokemon to battle the AI or another player.");
		
		
		pick.pickPokemon();
		Thread.sleep(3000);
		
		opp.oponentPickPokemon();
		Thread.sleep(5000);
	
		System.out.println("Please select an attack to perform!");
		trainerPokemon.getMoveSet();
		int userInput = in.nextInt();

		
		
		trainerPokemon.attackOption(userInput);
		in.close();
		
	}

}
