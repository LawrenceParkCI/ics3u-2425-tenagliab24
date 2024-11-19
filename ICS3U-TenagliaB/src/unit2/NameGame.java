package unit2;

import java.util.Scanner;

/**
	Description: Randomness worksheet  <p>
	Date: November 18, 2024
	@author Ben Tenaglia
 */
public class NameGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		String name;
		
		System.out.println("What is your name?");
		name = sc.nextLine();
		
		
		sc.close();
	}

}
