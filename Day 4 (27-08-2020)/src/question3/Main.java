package question3;

import java.util.Scanner;

public class Main {

	public static boolean validateTeams(String s, String str[]) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase(s)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String teamNames[] = { "Chennai Super Kings", "Deccan Chargers", "Delhi Daredevils", "Kings XI Punjab",
				"Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore" };

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the expected winner team of IPL Season 4");
			String winner = sc.nextLine();
			boolean winnerValidation = validateTeams(winner, teamNames);

			if (winnerValidation == true) {
				System.out.println("Enter the expected runner team of IPL Season 4");
				String runner = sc.nextLine();
				boolean runnerValidation = validateTeams(runner, teamNames);
				
				if (runnerValidation == false) {
					throw new TeamNameNotFoundException(
							"TeamNameNotFoundException: Entered team is not a part of IPL Season 4");
				} else {
					System.out.println("Expected IPL Season 4 winner: " + winner);
					System.out.println("Expected IPL Season 4 runner: " + runner);
				}
				

			} else {
				throw new TeamNameNotFoundException(
						"TeamNameNotFoundException: Entered team is not a part of IPL Season 4");
			}
		} catch (TeamNameNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
