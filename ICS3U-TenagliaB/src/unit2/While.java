package unit2;

/**
Description: While worksheet
Date: November 22 2024
@author Ben Tenaglia
 */

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		//to accomodate the names afterward
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			//if it is declared inside the loop, it makes it easier
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}



		//Run the code Using the debugger. 
		//Explain the code in your own words
		//the code asks for a number of people then asks for a name and repeats that until they do the amount of people

		//What code is repeated?
		//lines 20 through 26
		//When does it decide whether to repeat or not?
		//at line 19
		//What is the condition for repeating?
		//if numPeople is greater than 0


		//The do while loop executes the content of the loop once before checking the condition of the while.
		//Whereas a while loop will check the condition first before executing the content.


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.
		String word;
		int point = 0;

		System.out.println("Type any word");
		word = in.nextLine();
		while (point < 20) {
			System.out.println(word);
			point = point + 1;
		}

		in.close();
	}
}