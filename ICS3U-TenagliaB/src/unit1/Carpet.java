package unit1;

/**
 * Description: Completing the carpet assignment from assignment 2 <p>
 * Date: Oct 9, 2024
 * @author Ben Tenaglia
 */

import java.util.Scanner;

/**
 * This is the entry point to the program.
 * @param args unused
 */

public class Carpet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//print the instructions
		System.out.println("Carpet Cost Calculator!");
		System.out.println("Type in the length and width of your room in meters, press <Enter> after each.");
		System.out.println("Type in the cost per square meter of your chosen carpet and press <Enter>.");

		//declare variables
		int roomLength;
		int roomWidth;
		int costPerMeter;

		//scan the inputs
		roomLength = sc.nextInt();
		roomWidth = sc.nextInt();
		costPerMeter = sc.nextInt();

		//calculate the cost
		int carpetCost = (roomLength * roomWidth * costPerMeter);

		//print the output
		System.out.println("In total, your carpet will cost you: $" + carpetCost);

		sc.close();
	}

}
