package PokemonBattle;

import java.util.Random;

public class Battle {

	
	Random r = new Random();
	
	
	
	public void fight() {
		int n = 1 + r.nextInt(3);
		System.out.println(n);
	}
}
