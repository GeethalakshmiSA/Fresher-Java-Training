package question4;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserMain {

	public static boolean validateDate(String stringDate){
		boolean value = false;
		try{
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(stringDate);
			value = true;
		}
		catch(Exception e){
			value = false;
		}
		return value;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringDate = sc.next();
		if(validateDate(stringDate)){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
		sc.close();
	}

}
