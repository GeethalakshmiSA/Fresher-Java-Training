package question1;

import java.util.Scanner;

class Venue {
	
	// Data Members or Attributes with Default access
	String name;
	String city;
	
	// Constructor
	Venue(String name, String city){
		this.name=name;
		this.city=city;
	}
	
}

public class Main {
	
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the venue name");
		String name = sc.nextLine();
		
		System.out.println("Enter the city name");
		String city = sc.nextLine();
		
		sc.close();
		
		Venue v = new Venue(name, city);
		
		System.out.println("Venue Details:");
		System.out.println("Venue Name: "+v.name+"\nCity Name: "+v.city);
	}

}
