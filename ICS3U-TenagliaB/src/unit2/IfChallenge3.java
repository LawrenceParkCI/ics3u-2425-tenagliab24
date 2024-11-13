package unit2;

import java.util.Scanner;

/**
 * Description: If challenge 3 quiz
 * Date: November 13, 2024
 * @author Ben Tenaglia
 */

public class IfChallenge3 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		String yesno;
		int ready = 1;
		String q1;
		String q2;
		String q3;
		int points = 0;
		
		System.out.println("Are you ready for the GREATEST baseball 2024 WORLD SERIES quiz of ALL TIME?");
		yesno = sc.nextLine();
		
		if (yesno.equalsIgnoreCase("yes")) {
			System.out.println("Alright you better get 100%!");
			ready = 2;
		}
		else if (yesno.equalsIgnoreCase("no")) {
			System.out.println("Well, you might be cooked.");
			ready = 3;
		}
		else {
			System.out.println("I'll take that as a YES!");
		}
		
		System.out.println("\nQuestion 1");
		Thread.sleep(1500);
		System.out.println("\nWhat Baseball team won the 2024 World Series?");
		Thread.sleep(500);
		System.out.println("1) New York Yankees");
		Thread.sleep(500);
		System.out.println("2) Arizona Diamondbacks");
		Thread.sleep(500);
		System.out.println("3) Toronto Blue Jays");
		Thread.sleep(500);
		System.out.println("4) Los Angeles Dodgers");
		Thread.sleep(500);
		System.out.println("5) Texas Rangers");
		Thread.sleep(500);
		System.out.println("Type your answer below and press <Enter>");
		q1 = sc.nextLine();
		
		if (q1.equals("4")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("CORRECT!!!");
			System.out.println("Great job!");
			points = 1;
		}
		else if (q1.equals("1")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You said you were ready? I guess not.");
			}
			else if (ready == 3){
				System.out.println("Huh, maybe you were not ready after all.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q1.equals("2")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You said you were ready? I guess not.");
			}
			else if (ready == 3){
				System.out.println("Huh, maybe you were not ready after all.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q1.equals("3")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You said you were ready? I guess not.");
			}
			else if (ready == 3){
				System.out.println("Huh, maybe you were not ready after all.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q1.equals("5")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You said you were ready? I guess not.");
			}
			else if (ready == 3){
				System.out.println("Huh, maybe you were not ready after all.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else {
			System.out.println("What are you even typing???");
		}
		
		System.out.println("\nQuestion 2");
		Thread.sleep(1500);
		System.out.println("\nDuring Game 1 of the 2024 World Series, who hit the first walk-off grand slam in world series history?");
		Thread.sleep(500);
		System.out.println("1) Shohei Ohtani");
		Thread.sleep(500);
		System.out.println("2) Freddie Freeman");
		Thread.sleep(500);
		System.out.println("3) Aaron Judge");
		Thread.sleep(500);
		System.out.println("4) Juan Soto");
		Thread.sleep(500);
		System.out.println("5) Mookie Betts");
		Thread.sleep(500);
		System.out.println("Type your answer below and press <Enter>");
		q1 = sc.nextLine();
		
		if (q1.equals("2")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("CORRECT!!!");
			System.out.println("Great job!");
			points = 2;
		}
		else if (q1.equals("1")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("Hah. You thought you would so good, and look at you now, getting a question wrong.");
			}
			else if (ready == 3){
				System.out.println("Wow, you definitely were NOT ready for this quiz.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q1.equals("3")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("Hah. You thought you would so good, and look at you now, getting a question wrong.");
			}
			else if (ready == 3){
				System.out.println("Wow, you definitely were NOT ready for this quiz.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q1.equals("4")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("Hah. You thought you would so good, and look at you now, getting a question wrong.");
			}
			else if (ready == 3){
				System.out.println("Wow, you definitely were NOT ready for this quiz.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q1.equals("5")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("Hah. You thought you would so good, and look at you now, getting a question wrong.");
			}
			else if (ready == 3){
				System.out.println("Wow, you definitely were NOT ready for this quiz.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else {
			System.out.println("What are you even typing???");
		}
		//This is for the portfolio

		/*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
		 */
		sc.close();
	}
}