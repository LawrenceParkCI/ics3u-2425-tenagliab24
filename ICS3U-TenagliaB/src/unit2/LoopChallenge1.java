package unit2;

import java.util.Scanner;

/**
Description: Loop challenge 1 program
Date: November 25, 2024
@author Ben Tenaglia
 */

public class LoopChallenge1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
     Create a program that will ask for the password. If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */

		String pass;

			System.out.println("What is the password?");
			pass = sc.nextLine();
			while (pass.equals("123456")) {
				System.out.println("Correct, you may pass.");
			}

		
		sc.close();
	}
}