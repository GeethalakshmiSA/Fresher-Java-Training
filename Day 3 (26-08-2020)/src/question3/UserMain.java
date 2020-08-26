package question3;

import java.util.Scanner;

public class UserMain {

	public static boolean validatePlayer(String player){
		String s = " ";
		s += player;
		boolean value = false;
		for(int i=1; i<s.length(); i++){
			if(s.charAt(i) == 'a'){
				if(i%2 != 0){
					value = true;
				}
				else if(i%2==0) {
					value = false;
					return value;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String playerName = sc.nextLine();
		if(validatePlayer(playerName)){
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
		sc.close();

	}

}
