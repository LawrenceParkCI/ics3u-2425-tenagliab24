package unit1;

/**
 * Description: Completing the Alive assignment 2 <p>
 * Date: October 8, 2024
 * @author Ben Tenaglia
 */

import java.util.Scanner;

/**
 * This is the entry point to the program.
 * @param args unused
 */

public class Alive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//get the user input
		System.out.println("SLEEPING CALCULATOR\n");
		System.out.println("Enter your birthdate, press <Enter> after each\nYear: \nMonth: \nDay: \nEnter today's date, press <Enter> after each\nYear: \nMonth: \nDay: \n");

		//declare variables
		int birthYear;
		int birthMonth;
		int birthDay;
		int todayYear;
		int todayMonth;
		int todayDay;

		//scan the user input
		birthYear = sc.nextInt();
		birthMonth = sc.nextInt();
		birthDay = sc.nextInt();
		todayYear = sc.nextInt();
		todayMonth = sc.nextInt();
		todayDay = sc.nextInt();

		//calculate the answer
		int daysAlive = (((todayYear - birthYear) * 365) + ((todayMonth - birthMonth) * 30) + (todayDay - birthDay));
		int daysSlept = daysAlive * 8;

		//print the output
		System.out.println("\nYou have been alive for " + daysAlive + " days.");
		System.out.println("\nYou have slept for " + daysSlept + " hours.");

		sc.close();
	}

}
