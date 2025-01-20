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
		System.out.println("\nDISTANCE:");
		System.out.println(distance (4,5,6,7));
		System.out.println("\nHYPOTENUSE:");
		System.out.println(hypotenuse (5,6));
		System.out.println("\nFACTORS:");
		System.out.println(numOfFactors (64));
		System.out.println("\nPRIME:");
		System.out.println(isPrime (43));
		System.out.println("SUM:");
		int [] arrayint = {1,2,3,4};
		System.out.println(arrayint);
		double [] arraydouble = {5,6,7,8};
		System.out.println(arraydouble);

	}

	/**
	 * Calculates the distance between the two points
	 * @param x1 - x value of first point
	 * @param y1 - y value of first point
	 * @param x2 - x value of first point
	 * @param y2 - y value of first point
	 * @return distance between x1 & x2, y1 & y2s
	 */
	public static double distance (int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
	}

	/**
	 * calculates the hypotenuse of a triangle given two sides
	 * @param side1 - first side of triangle
	 * @param side2 - second side of triangle
	 * @return the hypotenuse length
	 */
	public static double hypotenuse (double side1, double side2) {
		return  Math.sqrt(Math.pow(side1,  2 + Math.pow(side2, 2)));
	}

	/**
	 * calculates the number of factors that a given number has
	 * @param x3 - the given number
	 * @return Returns the number of factors of the given number
	 */
	public static int numOfFactors (int x) {
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				System.out.print(" " + i + " ");
			}
		}
		return x;
	}


	/**
	 * Calculates if a given number is prime or not
	 * @param x4 - the given number
	 * @return Returns true if the number given is prime, and false otherwise.
	 */
	public static boolean isPrime (int x) {

		boolean flag = false;
		if (x == 0 || x == 1) {
			flag = true;
		}

		for (int i = 2; i <= x / 2; i++) {

			if (x % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}


}

