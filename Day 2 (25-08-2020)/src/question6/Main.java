package question6;

import java.util.Scanner;

class ExtraType {
	// Data Members or Attributes with Default access
	String name;
	long runs;
}

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ExtraType extraType = new ExtraType();
		
		System.out.println("Enter the extratype details");
		String extraTypeDetails = sc.nextLine();
		
		String details[] = extraTypeDetails.split("#");
		extraType.name = details[0];
		extraType.runs = Integer.parseInt(details[1]);
		
		System.out.println("ExtraType Details");
		System.out.println("Extra Type:"+extraType.name+"\nRuns:"+extraType.runs);
		
		sc.close();
	}

}