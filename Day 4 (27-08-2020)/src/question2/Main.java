package question2;

import java.util.Scanner;

public class Main {

	static String playerName;
	static int playerAge;

	public static void validateAge(int age) throws CustomException {
		if (age > 18) {
			System.out.println("Player Name: " + playerName);
			System.out.println("Player Age: " + playerAge);
		} else {
			throw new CustomException("InvalidAgeRangeException");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player name");
		playerName = sc.nextLine();
		System.out.println("Enter the player age");
		playerAge = sc.nextInt();

		try {
			validateAge(playerAge);
		} catch (CustomException e) {
			System.out.println("CustomException: "+e.getMessage());
		}

	}

}
