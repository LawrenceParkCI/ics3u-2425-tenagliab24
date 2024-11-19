package unit2;

/**
	Description: Randomness worksheet <p>
	Date: November 18, 2024
	@author Ben Tenaglia
 */
public class DoubleDiceContest {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		
		//rolling user's dice
		System.out.println("Your first number:");
		Thread.sleep(500);
		int user1 = (int)((Math.random()*6)+1);
		System.out.println(user1);
		System.out.println("\nYour second number:");
		Thread.sleep(500);
		int user2 = (int)((Math.random()*6)+1);
		System.out.println(user2);
		//printing user's roll
		System.out.println("\nYour total roll:");
		Thread.sleep(800);
		int userFinal = user1 + user2;
		System.out.println(userFinal + "\n");
		
		//rolling computer's dice
		System.out.println("Computer's first number:");
		Thread.sleep(500);
		int computer1 = (int)((Math.random()*6)+1);
		System.out.println(computer1);
		System.out.println("\nComputer's second number:");
		Thread.sleep(500);
		int computer2 = (int)((Math.random()*6)+1);
		System.out.println(computer2);
		//printing user's roll
		System.out.println("\nComputer's total roll:");
		Thread.sleep(800);
		int computerFinal = computer1 + computer2;
		System.out.println(userFinal + "\n");
		
		//outputting if the user won or not or if it was a tie
		if (userFinal > computerFinal) {
			System.out.println("\nYou win!");
		}
		else if (computerFinal > userFinal) {
			System.out.println("\nYou lose!");
		}
		else {
			System.out.println("\nIt's a tie!");
		}
		
	}
}
