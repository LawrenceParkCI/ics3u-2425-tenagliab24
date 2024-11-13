package unit2;

import java.util.Scanner;

/**
 * Description: String Challenge worksheet
 * Date: November 12, 2024
 * @author Ben Tenaglia
 */

public class StringChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//This is for the portfolio
		
		//declaring all variables
		String A;
		String B;
		String C;

		//getting part 1 input
		System.out.println("Part 1!");
		System.out.println("What class are you in?");
		A = sc.nextLine();

		//using .equals() method to check the user's answer
		if(A.equals("Computer Science")) {
			System.out.println("You are Correct!");
		}
		//using .equalsIgnoreCase() method to tell user to correct the spelling
		else if(A.equalsIgnoreCase("computer science")) {
			System.out.println("Maybe try correcting your Uppercase or Lowercase");
		}
		else {
			System.out.println("Wrong class, try again!");
		}
		
		//Part 2, getting input
		System.out.println("Part 2!");
		System.out.println("Type in two different subjects, and press <Enter> after each.");
		B = sc.nextLine();
		C = sc.nextLine();
		
		//using .compareTo() method to see how far apart the subjects are lexicographically
		System.out.println("Your subjects are " + B.compareTo(C) + " apart");
		
		//Explicit and Implicit casting
		double D = 20.0;
		int I = 3;
		
		//explicit
		I = (int) D;
		
		//implicit
		D = I;
		
		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
		 */
		sc.close();
	}
}