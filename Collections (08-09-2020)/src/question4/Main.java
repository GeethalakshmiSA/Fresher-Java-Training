package question4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader rd =  new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Player> map = new TreeMap<>();
		
		System.out.println("Enter the number of players");
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++){
			System.out.println("Enter the details of player "+ (i+1));
			String capNumber = sc.next();
			String name = rd.readLine();
			String team = rd.readLine();
			String skill = rd.readLine();
			Player play = new Player(name, team, skill);
			map.put(capNumber, play);
		}
		
		System.out.println("Player Details");
		
		for(Map.Entry<String,Player> m : map.entrySet()){
			System.out.println(m.getKey() + "--" + m.getValue());
		}
	}

}
