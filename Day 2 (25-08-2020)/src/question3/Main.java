package question3;

import java.util.Scanner;

class Delivery {
	
	// Data Members or Attributes with public access
	public long over;
	public long ball;
	public long runs;
	public String batsman;
	public String bowler;
	public String nonStriker;
	
	public void displayDeliveryDetails(){
		System.out.println("Over : "+over+"\nBall : "+ball+"\nRuns : "+runs+"\nBatsman : "+batsman+"\nBowler : "+bowler+"\nNonStriker : "+nonStriker);
	}
}

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Delivery d = new Delivery();
		
		System.out.println("Enter the over");
		d.over = sc.nextLong();
		
		System.out.println("Enter the ball");
		d.ball = sc.nextLong();
		
		System.out.println("Enter the runs");
		d.runs = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter the batsman name");
		d.batsman = sc.nextLine();
		
		System.out.println("Enter the bowler name");
		d.bowler = sc.nextLine();
		
		System.out.println("Enter the nonStriker name");
		d.nonStriker = sc.nextLine();
		
		System.out.println("Delivery Details :");
		d.displayDeliveryDetails();
		
		sc.close();
		
	}
}
