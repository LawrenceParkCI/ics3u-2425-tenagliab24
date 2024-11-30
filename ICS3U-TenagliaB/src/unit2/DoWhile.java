package unit2;

/**
Description: Do While worksheet <p>
Date: November 21, 2024
@author Ben Tenaglia
 */

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		/*
		 * String name;
		 * do {
     System.out.print("What is your name? ");
     name = in.nextLine();
   } while (!name.equals("Mr. Lee"));

   System.out.println("You are welcome into the secret secret pogchamp club.");
		 */

		//Run the code. Explain the code in your own words
		//The code runs until you type in the name Mr. Lee, then it ends

		//What code is repeated?
		//lines 22 and 23 are repeated

		//When does it decide whether to repeat or not?
		//It decides after the name is scanned at line 24

		//What is the condition for repeating?
		//The name must be Mr. Lee

		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.

		String word;
		int point = 0;

		System.out.print("Type any word");
		word = in.nextLine();
		do {
			System.out.println(word);
			point = point + 1;
		} while (point < 20);


		in.close();
	}
}