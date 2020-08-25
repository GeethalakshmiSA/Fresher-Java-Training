//11. Problem Statement:

//There are exactly 2.54 centimeters to an inch. Write a program that takes a number of inches from the command line and converts it to centimeters.

//Answer -

class Convert {
    public static void main(String[ ] args) {
		float inches = Float.parseFloat(args[0]);
		float cm = inches * 2.54f;
		System.out.println(cm);
    }
}
