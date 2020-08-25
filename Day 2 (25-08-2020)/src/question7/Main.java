package question7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the over");
		long over = sc.nextLong();
		
		System.out.println("Enter the ball");
		long ball = sc.nextLong();
		
		System.out.println("Enter the runs");
		long runs = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter the batsman name");
		String batsman = sc.nextLine();
		
		System.out.println("Enter the bowler name");
		String bowler = sc.nextLine();
		
		System.out.println("Enter the nonStriker name");
		String nonStriker = sc.nextLine();
		
		Delivery delivery = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		
		System.out.println("Delivery Details :");
		System.out.println("Over : "+delivery.getOver()+"\nBall : "+delivery.getBall()+"\nRuns : "+delivery.getRuns()+"\nBatsman : "+delivery.getBatsman()+"\nBowler : "+delivery.getBowler()+"\nNonStriker : "+delivery.getNonStriker());
		
		sc.close();

	}

}
