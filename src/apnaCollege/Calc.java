package apnaCollege;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 5;

		int a, b; 
		
		Scanner myValue = new Scanner(System.in);
		
		System.out.println("Type a number");
		a = myValue.nextInt(); //read user input
		System.out.println("Type another number");
		b = myValue.nextInt(); //read user input
	
		
		System.out.println("Sum is:" + summation(a,b));
		System.out.println("Subtraction is:" + subtraction(a,b));
		System.out.println("Multiplication is:" + multiplication(a,b));
		System.out.println("Division is:" + division(a,b));

		
	}

	
	public static int summation(int a, int b) {
		return a+b;
	}
	
	public static int subtraction(int a, int b) {
		return a-b;
	}
	
	public static int multiplication(int a, int b) {
		return a*b;
	}
	
	public static int division(int a, int b) {
		return a/b;
	}
}



