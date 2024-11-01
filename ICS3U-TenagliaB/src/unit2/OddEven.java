package unit2;

/**
 * Description: Completing the OddEven assignment <p>
 * Date: November 1, 2024
 * @author Ben Tenaglia
 */

import java.util.Scanner;

public class OddEven {

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Input any integer and press <Enter>");
		number = sc.nextInt();
		
		if (number%2 == 0) {
			System.out.println("Your number is even.");
		}
		else {
			System.out.println("Your number is odd");
		}
		
		sc.close();
	}

}
