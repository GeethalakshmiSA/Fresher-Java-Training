package question5;

import java.util.Scanner;

class Venue {
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		
}
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Venue venue = new Venue();
		
		System.out.println("Enter the venue name");
		venue.setName(sc.nextLine());
		
		System.out.println("Enter the city name");
		venue.setCity(sc.nextLine());
		
		while(true){
		System.out.println("Venue Details:");
		System.out.println("Venue Name: "+venue.getName()+"\nCity Name: "+venue.getCity());
		
		System.out.println("Menu");
		System.out.println("1.Update Venue Name \n2.Update City Name \n3.All informations Correct/Exit \nType 1 or 2 or 3 ");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Enter the venue name");
				sc.nextLine();
				String name = sc.nextLine();
				venue.setName(name);
				break;
				
			case 2:
				System.out.println("Enter the city name");
				sc.nextLine();
				String city = sc.nextLine();
				venue.setCity(city);
				break;
				
			case 3:
				System.exit(0);
				break;
		}
		
		
		}
	}

}
