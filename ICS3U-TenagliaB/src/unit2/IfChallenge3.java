package unit2;

import java.util.Scanner;

/**
 * Description: If challenge 3 quiz <p>
 * Date: November 15, 2024
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

		System.out.println("Are you ready for the GREATEST baseball 2024 WORLD SERIES quiz of ALL TIME? YES/NO");
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

		Thread.sleep(2000);
		System.out.println("\nQuestion 1");
		Thread.sleep(1500);
		System.out.println("\nWhat Baseball team won the 2024 World Series?\n");
		Thread.sleep(500);
		System.out.println("1) New York Yankees\n");
		Thread.sleep(500);
		System.out.println("2) Arizona Diamondbacks\n");
		Thread.sleep(500);
		System.out.println("3) Toronto Blue Jays\n");
		Thread.sleep(500);
		System.out.println("4) Los Angeles Dodgers\n");
		Thread.sleep(500);
		System.out.println("5) Texas Rangers\n");
		Thread.sleep(500);
		System.out.println("Type the number of your answer below and press <Enter>");
		q1 = sc.nextLine();

		if (q1.equals("4")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("CORRECT!!!");
			System.out.println("Great job!");
			points =+ 1;
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
			Thread.sleep(300);
			System.out.println("RESTART.");
			System.exit(0);
		}

		Thread.sleep(2000);
		System.out.println("\nQuestion 2");
		Thread.sleep(1500);
		System.out.println("\nDuring Game 1 of the 2024 World Series, who hit the first walk-off grand slam in world series history?\n");
		Thread.sleep(500);
		System.out.println("1) Shohei Ohtani\n");
		Thread.sleep(500);
		System.out.println("2) Freddie Freeman\n");
		Thread.sleep(500);
		System.out.println("3) Aaron Judge\n");
		Thread.sleep(500);
		System.out.println("4) Juan Soto\n");
		Thread.sleep(500);
		System.out.println("5) Mookie Betts\n");
		Thread.sleep(500);
		System.out.println("Type the number of your answer below and press <Enter>");
		q2 = sc.nextLine();

		if (q2.equals("2")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("CORRECT!!!");
			System.out.println("Great job!");
			points =+ 1;
		}
		else if (q2.equals("1")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("Hah. You thought you would do good, and look at you now, getting a question wrong.");
			}
			else if (ready == 3){
				System.out.println("Wow, you definitely were NOT ready for this quiz.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q2.equals("3")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("Hah. You thought you would do good, and look at you now, getting a question wrong.");
			}
			else if (ready == 3){
				System.out.println("Wow, you definitely were NOT ready for this quiz.");
			}
			else {
				System.out.println("Better luck on the next question");
			}
		}
		else if (q2.equals("4")) {
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
		else if (q2.equals("5")) {
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
			Thread.sleep(300);
			System.out.println("RESTART.");
			System.exit(0);
		}
		
		Thread.sleep(2000);
		System.out.println("\nQuestion 3");
		Thread.sleep(1500);
		System.out.println("\nHow many games did the 2024 World Series have?\n");
		Thread.sleep(500);
		System.out.println("1) 6\n");
		Thread.sleep(500);
		System.out.println("2) 7\n");
		Thread.sleep(500);
		System.out.println("3) 5\n");
		Thread.sleep(500);
		System.out.println("4) 9\n");
		Thread.sleep(500);
		System.out.println("5) 8\n");
		Thread.sleep(500);
		System.out.println("Type the number of your answer below and press <Enter>");
		q3 = sc.nextLine();

		if (q3.equals("3")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("CORRECT!!!");
			System.out.println("Great job!");
			points =+ 1;
			if(points == 3) {
				System.out.println("You definitely studied for this quiz.");
			}
		}
		else if (q3.equals("1")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You really were not ready for this question I guess");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, and yet you said you were ready.");
				}
			}
			else if (ready == 3){
				System.out.println("Did you even study??");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, you were right about NOT being ready.");
				}
			}
		}
		else if (q3.equals("2")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You really were not ready for this question I guess.");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, and yet you said you were ready.");
				}
			}
			else if (ready == 3){
				System.out.println("Did you even study??");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, you were right about NOT being ready.");
				}
			}
		}
		else if (q3.equals("4")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You really were not ready for this question I guess");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, and yet you said you were ready.");
				}
			}
			else if (ready == 3){
				System.out.println("Did you even study??");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, you were right about NOT being ready.");
				}
			}
		}
		else if (q3.equals("5")) {
			System.out.println("You are...");
			Thread.sleep(600);
			System.out.println("WRONG!!!");
			if (ready == 2) {
				System.out.println("You really were not ready for this question I guess");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, and yet you said you were ready.");
				}
			}
			else if (ready == 3){
				System.out.println("Did you even study??");
				if(points == 0) {
					System.out.println("You have not gotten a single question right, you were right about NOT being ready.");
				}
			}
		}
		else {
			System.out.println("What are you even typing???");
			Thread.sleep(300);
			System.out.println("RESTART.");
			System.exit(0);
		}
		
		Thread.sleep(2000);
		System.out.println("\n\nOkay, it is time for the results!!");
		Thread.sleep(1200);
		if (points == 3) {
			System.out.println("You got 3/3 which is 100%!!!");
			if (ready == 2) {
				Thread.sleep(1000);
				System.out.println("You were definitely ready, great job on theis quiz!");
			}
			else if (ready == 3) {
				Thread.sleep(1000);
				System.out.println("You should have more confidence next time!");
			}
		}
		else if (points == 2) {
			Thread.sleep(1200);
			System.out.println("You got 2/3, good job, but study more next time.");
			if (ready == 2) {
				Thread.sleep(1000);
				System.out.println("You were ready, just not enough for the 100%.");
			}
			else if (ready == 3) {
				Thread.sleep(1000);
				System.out.println("You did pretty well considering you not being ready.");
			}
		}
		else if (points == 1) {
			Thread.sleep(1200);
			System.out.println("You only pulled through with 1/3 questions right, you should study a lot more.");
			if (ready == 2) {
				Thread.sleep(1000);
				System.out.println("You were not ready for this quiz, you might have just gotten lucky.");
			}
			else if (ready == 3) {
				Thread.sleep(1000);
				System.out.println("You were right about not being ready after getting only 1/3.");
			}
		}
		else if (points == 0) {
			Thread.sleep(1200);
			System.out.println("You got ZERO questions right, 0/3.");
			if (ready == 2) {
				Thread.sleep(1000);
				System.out.println("You were NOT ready for this quiz at ALL.");
			}
			else if (ready == 3) {
				Thread.sleep(1000);
				System.out.println("I was right, you are COOKED.");
			}
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