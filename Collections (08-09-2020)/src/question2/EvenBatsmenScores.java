package question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenBatsmenScores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		int size = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<size; i++){
			list.add(sc.nextInt());
			if(i%2 != 0){
				sum += list.get(i);
			}
		}
		
		System.out.println(sum);
				
		sc.close();

	}

}
