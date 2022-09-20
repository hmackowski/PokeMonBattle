package PokemonBattle;

public class Charmander implements Pokemon{

	private static int health = 0;
	private static String[] moveSet = {"Scratch", "Ember", "Flamethrower", "Tail Whip"};
	
	@Override
	public int attackOption(int selection) {
		int damage = 0;
		switch (selection){
		  case 1:
			    // code block
			  damage = 10;
			  System.out.println("Charmander used Scratch and it did " + damage + " damage!");
			    break;
		 case 2:
			    // code block
			  damage = 15;
			  System.out.println("Charmander used Ember " + damage + " damage!");
			    break;
		 case 3:
			    // code block
			  damage = 12;
			  System.out.println("Charmander used Flamethrower " + damage + " damage!");
			    break;
		 case 4:
			    // code block
			  damage = 3;
			  System.out.println("Charmander used Tail Whip " + damage + " damage!");
			    break;
	    default:  // code block
	    	System.out.println("Please enter a valid option.");
		}		
		
		return damage;
	}
	
	

	@Override
	public void health() {
		
		
	}

	@Override
	public void getMoveSet() {
		int option = 1;
		for (String moveList : moveSet) {
			System.out.println(option + ": " + moveList);
			option++;
		}
		
	}



	public static int getHealth() {
		return health;
	}



	public static void setHealth(int health) {
		Charmander.health = health;
	}

}
