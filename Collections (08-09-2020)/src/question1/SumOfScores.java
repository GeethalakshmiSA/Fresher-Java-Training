package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfScores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		int size = sc.nextInt();
		int odd = 0, even = 0;
		
		for(int i=0; i<size; i++){
			list.add(sc.nextInt());
			int temp = list.get(i);
			if(i%2==0){
				if(temp%2 == 0){
					even += temp;
				}
			}
			else{
				if(temp%2 != 0){
					odd += temp;
				}
			}
		}
		
		System.out.println(odd+even);
		
		sc.close();
	}

}
