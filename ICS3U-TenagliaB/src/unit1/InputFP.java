package unit1;

import java.util.Scanner;

/**
 * Description: Floating-Point Variables Worksheet <p>
 * Date: October 3, 2024
 * @author Ben Tenaglia
 */
public class InputFP {

	 /**
	  * This is the entry point to the program.
	  * @param args unused
	  */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//user input
		System.out.println("Input a Floating-Point value and press <Enter>");
		
		//declares variables
		double num1, num2;
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		//output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();
	}

}
