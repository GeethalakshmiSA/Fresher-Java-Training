package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> score = new ArrayList<>();
		int numberOfMatches = sc.nextInt();
		int totalRuns = 0;
		for(int i=0; i<numberOfMatches; i++){
			score.add(sc.nextInt());
			totalRuns += score.get(i);
		}
		
		double average = (double) (totalRuns / numberOfMatches);
		
		System.out.println(totalRuns);
		System.out.println(average);
		
		sc.close();
		
	}
}
