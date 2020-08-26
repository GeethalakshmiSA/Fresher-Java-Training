package question2;

import java.util.Scanner;

public class UserMain {

	public static boolean validateCity(String city){
		int len = city.length();
		boolean value = false;
		String s = city.substring(2, len-2);
		for(int i=0; i<s.length(); i++){
			if((s.charAt(i)) == '*'){
				value = true;
			}
		}
		return value;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cityName = sc.next();
		if(validateCity(cityName)){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
		sc.close();
	}

}
