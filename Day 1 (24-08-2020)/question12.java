// 12. Problem Statement:

// Write a program that reads two numbers from the command line, the number of hours worked by an employee and their base pay rate. Then output the total pay due

// Answer - 

class Employee {
    public static void main(String[ ] args) {
		int hoursWorked = Integer.parseInt(args[0]);
		float basePay = Float.parseFloat(args[1]);
		float totalPay = hoursWorked * basePay;
		System.out.println("Total Pay of the Employee " + totalPay);
    }
}
