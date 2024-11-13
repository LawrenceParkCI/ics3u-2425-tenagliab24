package unit2;

import java.util.Scanner;

/**
 * Description: If Challenge 2 worksheet <p>
 * Date: November 11, 2024
 * @author Ben Tenaglia
 */

public class IfChallenge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//This is for the portfolio
		/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
		 */

		//declares the variable for the three numbers
		int num1;
		int num2;
		int num3;

		//asks for input
		System.out.println("Type in three numbers, press <Enter> after each.");

		//scans the input
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();

		//calculates the output
		if (num1 < num2) {
			if(num2 < num3) {
				System.out.println("Your numbers are in order.");
			}
			else {
				System.out.println("Your numbers are not in order.");
			}
		}
		else {
			System.out.println("Your numbers are not in order.");
		}
		sc.close();
	}
}