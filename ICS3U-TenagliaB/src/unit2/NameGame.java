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
		
		System.out.println("What is your name?");
		sc.nextLine();
		
		int name;
		
		name =(int)((Math.random()*10) + 1);
		
		if (name <= 7) {
			System.out.println("Your name is my favourite!");
		}
		
		if (name > 7) {
			System.out.println("I hate that name");
		}
		sc.close();
	}

}
