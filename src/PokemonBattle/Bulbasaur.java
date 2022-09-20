package PokemonBattle;



public class Bulbasaur implements Pokemon{

	private static int health = 0;
	private static String[] moveSet = {"Tackle", "Razor Leaf", "Vine Whip", "Growl"};

	
	public  int attackOption(int selection) {
		int damage = 0;
		switch (selection){
		  case 1:
			    // code block
			  damage = 10;
			  System.out.println("Bulbasaur used Tackle and it did " + damage + " damage!");
			    break;
		 case 2:
			    // code block
			  damage = 15;
			  System.out.println("Bulbasaur used Razor Leaf " + damage + " damage!");
			    break;
		 case 3:
			    // code block
			  damage = 12;
			  System.out.println("Bulbasaur used Vine Whip " + damage + " damage!");
			    break;
		 case 4:
			    // code block
			  damage = 3;
			  System.out.println("Bulbasaur used Growl " + damage + " damage!");
			    break;
	    default:  // code block
	    	System.out.println("Please enter a valid option.");
		}		
		
		return damage;
	}


	public  void getMoveSet() {
		int option = 1;
		for (String moveList : moveSet) {
			System.out.println(option + ": " + moveList);
			option++;
		}

	}


	public void setMoveSet(String[] moveSet) {
		Bulbasaur.moveSet = moveSet;
	}


	public static int getHealth() {
		return health;
	}


	public static void setHealth(int health) {
		Bulbasaur.health = health;
	}


	



	@Override
	public void health() {

		
	}
}
