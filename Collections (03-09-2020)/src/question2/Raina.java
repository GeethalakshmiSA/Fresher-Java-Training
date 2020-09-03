package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Raina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> runs = new ArrayList<>();
		
		int numberOfMatches = sc.nextInt();
		for(int i=0; i<numberOfMatches; i++){
			runs.add(sc.nextInt());
		}
		
		Collections.sort(runs);
		System.out.println();
		
		for(Integer r : runs){
			System.out.println(r);
		}
		
		sc.close();
	}

}
