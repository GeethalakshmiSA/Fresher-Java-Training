package question4;

import java.util.Scanner;

class Player {
	
	// Data Members or Attributes with Default access
	String name;
	String country;
	String skill;
	
}

public class Main {
	
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the player details");
		String playerDetails = sc.nextLine();
		
		String player[] = new String[3];
		player = playerDetails.split(",");
		
		Player p = new Player();
		
		p.name = player[0];
		p.country = player[1];
		p.skill = player[2];
		
		System.out.println("Player Details");
		System.out.println("Player Name : "+p.name+"\nCountry Name : "+ p.country+"\nSkill : "+p.skill);
		
		sc.close();

	}
}
