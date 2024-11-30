package unit1;

/**
 * Description: Completing the String Manipulation assignment <p>
 * Date: Oct 8, 2024
 * @author Ben Tenaglia
 */

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Title
		System.out.println("STRING MANIPULATION!");

		//declare the variable
		String userInput; 

		//get the user input
		System.out.println("\nType in any sentence and press <Enter>:");

		//scan the input
		userInput = sc.nextLine();

		//declare variables for the first and last words
		int firstWord = userInput.indexOf(" ");
		int lastWord = userInput.lastIndexOf(" ");

		//output the different sentences
		System.out.println(userInput);
		System.out.println(userInput.toUpperCase());
		System.out.println(userInput.toLowerCase());
		System.out.println("Length = " + userInput.length());
		System.out.println("The 5th character is: " + userInput.charAt(5));
		System.out.println("The first word is: " + userInput.substring(0,firstWord));
		System.out.println("The last word is:" + userInput.substring(lastWord));

		sc.close();
	}

}
