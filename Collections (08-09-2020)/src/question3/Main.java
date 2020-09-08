package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.println("Enter number of teams:");
		int size = sc.nextInt();
		
		ArrayList<Team> list = new ArrayList<Team>();
		
		for(int i=0; i<size; i++){
			System.out.println("Enter the Team "+ (i+1) + " detail");
			System.out.println("Enter Name");
			String name = reader.readLine();
			System.out.println("Enter number of matches");
			long matches = sc.nextLong();
			Team t = new Team(name, matches);
			list.add(t);
		}
		
		Collections.sort(list, new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team team: list){
			System.out.println(team);
		}
		
		sc.close();

	}

}
