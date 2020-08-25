// 6. Problem Statement:
/*
Write a program that draws the following figures one above the other.

* * * * *             * 

* * * * *            * * 

* * * * *           * * *

* * * * *         * * * * * 

Now modify it to draw them next to each other like earlier.
*/

// Answer:
class Pattern {

	public static void main(String[] args) {
		
		for(int outer=1; outer<=4; outer++){
			
			for(int inner1=1; inner1<=5; inner1++)
			{
				System.out.print("* ");
			}
			
			for(int inner2=7-outer; inner2>1; inner2--)   
			{   
				System.out.print(" ");   
			}    
			
			for(int inner3=1; inner3<=outer; inner3++ )   
			{         
				System.out.print("* ");   
			}
			
			System.out.println();
		}

	}

}


