package culminating;

import java.awt.Color;

import hsa_new.Console;

public class SlotMachine {

	public static void main(String[] args) throws InterruptedException {
		Console c = new Console(30,100);  // Initialize the HSA console
		
		c.setTextColor(Color.WHITE);
		c.setTextBackgroundColor(Color.BLACK);
		c.clear();

		int playerPoints = 1000;  // Starting points for the player

		c.println("Welcome to the Slot Machine!");
		boolean keepPlaying = true;

		// Array to represent slot machine symbols
		String[] slotSymbols = {
				"7",
				"BAR",
				"Cherry",
				"Lemon",
				"Orange"
		};
		// ASCII art for fruit symbols
		String[] fruitArt = {
				"  7  ",
				"  BAR  ",
				"  🍒  ",
				"  🍋  ",
				"  🍊  "
		};
		while (keepPlaying) {
			c.println("Your Points: " + playerPoints);
			int bet = getBet(c, playerPoints);  // Get a valid bet from the player
			if (bet > 0) {
				playerPoints -= bet;  // Deduct the bet from the player's points
				String[] spinResult = spinSlotMachine(slotSymbols, fruitArt);  // Get the result of the slot spin
				displaySpinResult(spinResult, c);  // Display the result of the spin
				playerPoints = checkWinnings(bet, spinResult, playerPoints, c);  // Check if the player wins and update points
				if (playerPoints == 0) {
					c.println("You're out of points!");
					c.println("Thank you for playing.");
					break;
				}
			} else {
				c.println("Invalid bet. Enter an amount between 1 and " + playerPoints + ": ");
			}
			// Ask if the player wants to keep playing
			keepPlaying = askToKeepPlaying(c, playerPoints);
		}
	}

	/**
	 * @param c - console output
	 * @param playerPoints - The player's point value
	 * @return The bet from the player
	 */
	public static int getBet(Console c, int playerPoints) {
		int bet = 0;
		boolean validBet = false;
		while (!validBet) {
			c.print("Enter your bet: ");
			bet = c.readInt();
			if (bet > 0 && bet <= playerPoints) {
				validBet = true;
			} else {
				c.println("Invalid bet. Enter an amount between 1 and " + playerPoints + ": ");
			}
		}
		return bet;
	}

	/**
	 * @param slotSymbols - the slot symbols
	 * @param fruitArt - the fruit symbols
	 * @return - The result of the slot machine spin
	 * @throws InterruptedException
	 */
	public static String[] spinSlotMachine(String[] slotSymbols, String[] fruitArt) throws InterruptedException {
		// Generate random indices for the slot symbols array
		int index1 = (int) (Math.random() * slotSymbols.length);
		int index2 = (int) (Math.random() * slotSymbols.length);
		int index3 = (int) (Math.random() * slotSymbols.length);
		// Simulate spinning of the slot machine (with a 1-second delay between symbols)
		Thread.sleep(1000);
		String[] result = {slotSymbols[index1], slotSymbols[index2], slotSymbols[index3]};
		return result;
	}

	/**
	 * @param spinResult - result of the slot roll
	 * @param c - console output
	 * @throws InterruptedException
	 */
	public static void displaySpinResult(String[] spinResult, Console c) throws InterruptedException {
		String[] fruitArt = {
				"  7  ",
				"  BAR  ",
				"  🍒  ",
				"  🍋  ",
				"  🍊  "
		};

		c.print(fruitArt[getIndex(spinResult[0])]);
		Thread.sleep(1000);
		c.print(" " + fruitArt[getIndex(spinResult[1])]);
		Thread.sleep(1000);
		c.println(" " + fruitArt[getIndex(spinResult[2])]);
		Thread.sleep(1000);
	}

	/**
	 * @param symbol - symbols for the icons
	 * @return the index of the symbol
	 */
	public static int getIndex(String symbol) {
		String[] slotSymbols = {"7", "BAR", "Cherry", "Lemon", "Orange"};
		for (int i = 0; i < slotSymbols.length; i++) {
			if (slotSymbols[i].equals(symbol)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * @param bet - the player's bet
	 * @param spinResult - the spin result
	 * @param playerPoints - the player's points
	 * @param c - console
	 * @return
	 */
	public static int checkWinnings(int bet, String[] spinResult, int playerPoints, Console c) {
		String[] slotSymbols = {"7", "BAR", "Cherry", "Lemon", "Orange"};

		if (spinResult[0].equals("7") && spinResult[1].equals("7") && spinResult[2].equals("7")) {
			int winnings = 10 * bet;
			c.println("Lucky 7's! JACKPOT $" + winnings);
			playerPoints += winnings;  // Add winnings + original bet to the player's points
		} else if (spinResult[0].equals(spinResult[1]) && spinResult[0].equals(spinResult[2])) {
			int winnings = 5 * bet;
			c.println("3 of a Kind! You win $" + winnings);
			playerPoints += winnings;  // Add winnings + original bet to the player's points
		} else if (spinResult[0].equals(spinResult[1]) || spinResult[0].equals(spinResult[2]) || spinResult[1].equals(spinResult[2])) {
			int winnings = 2 * bet;
			c.println("2 of a Kind! You win $" + winnings);
			playerPoints += winnings;  // Add winnings + original bet to the player's points
		} else {
			c.println("You Lose");
			// Bet is already deducted at the beginning of the loop if the player loses
		}
		return playerPoints;
	}

	/**
	 * @param c - console
	 * @param playerPoints - player's points
	 * @return if player keeps or stops playing
	 */
	public static boolean askToKeepPlaying(Console c, int playerPoints) {
		while (true) {
			c.println("Would you like to keep playing? (Yes/No)");
			String playAgain = c.readString().toLowerCase();
			if (playAgain.equals("yes")) {
				return true;
			} else if (playAgain.equals("no")) {
				c.println("You ended with " + playerPoints + " points");
				c.println("Thank you for playing.");
				return false;
			} else {
				c.println("Invalid input. Please enter 'Yes' or 'No'.");
			}
		}
	}
}
