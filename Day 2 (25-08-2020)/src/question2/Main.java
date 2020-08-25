package question2;

import java.util.Scanner;

class Player {
	
	// Data Members or Attributes with Default access
	String name;
	String country;
	String skill;
	
	// Constructor
	Player(String name, String country, String skill){
		this.name=name;
		this.country=country;
		this.skill=skill;
	}
}

public class Main {
	
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the player name");
		String playerName = sc.nextLine();
		
		System.out.println("Enter the country name");
		String countryName = sc.nextLine();
		
		System.out.println("Enter the skill");
		String skill = sc.nextLine();
		
		sc.close();
		
		Player p = new Player(playerName, countryName, skill);
		
		System.out.println("Player Details:");
		System.out.println("Player Name: "+p.name+"\nCountry Name: "+p.country+"\nSkill: "+p.skill);
	}
}
