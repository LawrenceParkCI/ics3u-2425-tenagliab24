package unit3;

/**
 * Description: Mathplus worksheet
 * Date: December 17, 2024
 * @author Ben Tenagila
 */

import java.util.Scanner;

public class MathPlus {
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Header for the main method, determines the values for each method
	 * @param args
	 */
	public static void main(String[] args) {
		distance (4,5,6,7);
		hypotenuse (5,6);
		numOfFactors (64);
		isPrime (43);
	}

	/**
	 * Calculates the distance between the two points
	 * @param x1 - x value of first point
	 * @param y1 - y value of first point
	 * @param x2 - x value of first point
	 * @param y2 - y value of first point
	 * @return distance between x1 & x2, y1 & y2
	 */
	public static double distance (int x1, int y1, int x2, int y2) {
		System.out.println("DISTANCE:");
		System.out.println(" " +(x1 - x2) + ", " + (y1 - y2));
		return 0;
	}
	
	/**
	 * calculates the hypotenuse of a triangle given two sides
	 * @param side1 - first side of triangle
	 * @param side2 - second side of triangle
	 * @return the hypotenuse length
	 */
	public static double hypotenuse (double side1, double side2) {
		System.out.println("\nHYPOTENUSE:");
		System.out.println(" " + Math.sqrt(Math.pow(side1,  2 + Math.pow(side2, 2))));
		
		return 0;
	}

	/**
	 * calculates the number of factors that a given number has
	 * @param x3 - the given number
	 * @return Returns the number of factors of the given number
	 */
	public static int numOfFactors (int x3) {
		
		System.out.println("\nThe factors of 64 are:");
		for (int i = 1; i <= x3; ++i) {
		      if (x3 % i == 0) {
		        System.out.print(i + " ");
		      }
		}
		return 0;
	}
	
	/**
	 * Calculates if a given number is prime or not
	 * @param x4 - the given number
	 * @return Returns true if the number given is prime, and false otherwise.
	 */
	public static boolean isPrime (int x4) {
		
		boolean flag = false;
		if (x4 == 0 || x4 == 1) {
	        flag = true;
	    }

	    for (int i = 2; i <= x4 / 2; ++i) {

	      // condition for nonprime number
	      if (x4 % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println("\n\n" + x4 + " is a prime number.");
	    else
	      System.out.println("\n\n" + x4 + " is not a prime number.");
		return true;
	}

}
