package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of overs");
			int totalOvers = sc.nextInt();
			int runs[] = new int[totalOvers];
			System.out.println("Enter the number of runs for each over");
			for (int i = 0; i < totalOvers; i++) {
				runs[i] = sc.nextInt();
			}
			System.out.println("Enter the over number");
			int overNumber = sc.nextInt();
			if (overNumber < 0) {
				throw new NegativeArraySizeException();
			} else {
				System.out.println(runs[overNumber - 1]);
			}

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		} catch (NegativeArraySizeException e2) {
			System.out.println(e2);
		}

	}

}
