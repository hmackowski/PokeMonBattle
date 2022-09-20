package PokemonBattle;
import java.util.Scanner;


public class PokeStart {
	
	static Scanner in = new Scanner(System.in); //get user input
	public static Pokemon trainerPokemon;
	static PokePick pick = new PokePick();
	static Opponent opp = new Opponent();
	public static Pokemon opponentPokemon;
	static Battle battle = new Battle();
	
	
	public static void main(String[] args) throws InterruptedException {

				
		System.out.println("Hello there! Welcome to the world of Pokémon! "
				+ "In this game you will be able to use pokemon to battle the AI or another player.");
		
		
		pick.pickPokemon();
		Thread.sleep(3000);
		
		opp.oponentPickPokemon();
		Thread.sleep(5000);
		System.out.println("Prepare for battle...");
		Thread.sleep(2000);
		
		
		battle.fight();


		in.close();
		
	}

}
