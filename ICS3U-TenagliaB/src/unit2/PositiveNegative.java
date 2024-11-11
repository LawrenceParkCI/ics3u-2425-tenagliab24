package unit2;
/**
 * Description: The Positive Negative assignment <p>
 * Date: November 4, 2024
 * @author Ben Tenaglia
 */
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare the variable
		int num;
		
		//get the user's input
		System.out.println("Input any integer and press <Enter>");
		num = sc.nextInt();
		
		//determine and display computer output
		if (num >= 0) {
			System.out.println("Your number is positive");
		}
		else {
			System.out.println("Your number is negative");
		}
		
		if (num %7 == 0) {
			System.out.println("Your number is divisible by 7");
		}
		else {
			System.out.println("Your number is not divisible by 7");
		}
		sc.close();
	}

}
