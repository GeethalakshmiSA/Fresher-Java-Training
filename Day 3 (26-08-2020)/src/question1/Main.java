package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shape shape;
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("1.Rectangle \n2.Square \n3.Circle");
		System.out.println("Area Calculator --- Choose your shape");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Enter the length and breadth");
				int l = sc.nextInt();
				int b = sc.nextInt();
				shape = new Rectangle(l, b);
				System.out.printf("Area of Rectangle is:%.2f\n",shape.calculateArea());
				break;
			case 2:
				System.out.println("Enter side:");
				int s = sc.nextInt();
				shape = new Square(s);
				System.out.printf("Area of Square:%.2f\n",shape.calculateArea());
				break;
			case 3:
				System.out.println("Enter Radius:");
				int rad = sc.nextInt();
				shape = new Circle(rad);
				System.out.printf("Area of Circle is:%.2f\n",shape.calculateArea());
				break;
			default:
				System.exit(0);
				break;
		}
		}
	}

}
