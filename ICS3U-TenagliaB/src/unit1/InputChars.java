package unit1;
/**
 * Description: Character variables worksheet <p>
 * Date: October 3, 2024
 * @author Ben Tenaglia
 */
import java.util.Scanner;

/**
 * This is the entry point to the program.
 * @param args unused
 */

public class InputChars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare variable
		char ch1, ch2, ch3;
		
		//get user input
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		
		//scan the input
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		
		//give the output
		System.out.println();
		System.out.print("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
		
		sc.close();
	}

}
