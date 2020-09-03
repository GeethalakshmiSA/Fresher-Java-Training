package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> stad = new ArrayList<>();
		
		int num = sc.nextInt();
		for(int i=0; i<=num; i++){
			stad.add(sc.nextLine());
		}
		
		String input = sc.nextLine();
		int count = 0;
		
		for(int i=0; i<=num; i++){
			if(input.equals(stad.get(i))){
				count++;
			}
		}

		System.out.println(count);
		
		sc.close();
		
	}

}
