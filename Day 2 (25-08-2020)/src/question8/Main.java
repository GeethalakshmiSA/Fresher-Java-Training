package question8;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Long;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of wickets");
		int numberOfWickets = sc.nextInt();
		int count = 1;
		Wicket wicket[] = new Wicket[numberOfWickets];
		
		if(numberOfWickets>0){
			
			for(int i=0; i<numberOfWickets; i++)
			{
			
				System.out.println("Enter the details of wicket " + count);
				
				InputStreamReader r=new InputStreamReader(System.in);    
				BufferedReader br=new BufferedReader(r);
				
				String input = br.readLine();
				
				String details[] = new String[5];
				details = input.split(",");
			
				long over = Long.parseLong(details[0]);
				long ball = Long.parseLong(details[1]);
				String wicketType = details[2];
				String playerName = details[3];
				String bowlerName = details[4];
				
				wicket[i] = new Wicket(over, ball, wicketType, playerName, bowlerName);
				
				count++;
				
			}
		
			System.out.println("Wicket Details");
		
			for(int i=0; i<numberOfWickets; i++){
				System.out.println("Over : " + wicket[i].getOver());
				System.out.println("Ball : "+ wicket[i].getBall());
				System.out.println("Wicket Type : "+wicket[i].getWicketType());
				System.out.println("Player Name : "+wicket[i].getPlayerName());
				System.out.println("Bowler Name : "+ wicket[i].getBowlerName());
			}
		}
		sc.close();

	}

} 