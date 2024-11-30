package unit1;

/**
 * Description: Asks for two items you would like to purchase, the cost and amount of each, 
 * and then prints a receipt including the subtotal, tax, and total. <p>
 * Date: Oct 23, 2024
 * @author Ben Tenaglia
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Entry point to the program
 * @param args unused
 */

public class GroceryShopping {

	public static void main(String[] args) {
		//This line creates a scanner so that the user can type into the console.
		Scanner sc = new Scanner(System.in);

		//Here, i am declaring variables for the two items' name, cost and amount.
		String item1;
		double item1Cost;
		int item1Amount;

		String item2;
		double item2Cost;
		int item2Amount;

		//This line formats and output with the right amount of decimal places.
		DecimalFormat money = new DecimalFormat("$###,##0.00");

		/*
		 * Here is where the printing begins.
		 * The following line prints the header.
		 */

		System.out.format("|| $$$ \\\\\\ ========== \"Mr. Tenaglia's Grocery\" ========== /// $$$ ||\n");

		/*
		 * Here, the program asks for the first item, the cost and amount, and scans the user's input after they type them in, 
		 * then it thanks the user for buying the product.
		 */
		System.out.println("\nWhat would you like to buy?");
		item1 = sc.nextLine();
		System.out.println("How much does one " + item1 + " cost?");
		item1Cost = sc.nextDouble();
		System.out.println("How many " + item1 + "s are you buying?");
		item1Amount = sc.nextInt();
		sc.nextLine();
		System.out.println("Thank you for buying " + item1Amount + " " + item1 + "s.");

		/*
		 * Here, the program asks for the second item, the cost and amount, and scans the user's input after they type them in, 
		 * then it thanks the user for buying the product.
		 */

		System.out.println("\nWhat else would you like to buy?");
		item2 = sc.nextLine();
		System.out.println("How much does one " + item2 + " cost?");
		item2Cost = sc.nextDouble();
		System.out.println("How many " + item2 + "s are you buying?");
		item2Amount = sc.nextInt();
		System.out.println("Thank you for buying " + item2Amount + " " + item2 + "s.");

		//This is where the program begins printing the receipt.
		System.out.println("\nThis is your reciept:\n");

		System.out.println("\n\tMr. Tenaglia's Grocery");

		//The next three lines print out the real-time to be printed on the receipt.
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss\n");
		Date date = new Date();
		System.out.println(formatter.format(date));

		/*
		 * This prints and formats the table section of the receipt to tell the user what they purchased, how much each 
		 * singular item they purchased cost, how much they purchased, and how much they paid for the item(s) in total.
		 */
		System.out.format("%-10s %-10s %-12s %-8s","Item","|\tPrice","|\tQuant.","|\tTotal Price");
		System.out.println("\n-------------------------------------------------------------------");
		System.out.format("%-10s %-10s %-12s %-8s",item1,"|\t" + money.format(item1Cost),"|\t" + item1Amount,"|\t" + money.format(item1Cost*item1Amount) + "\n");
		System.out.format("%-10s %-10s %-12s %-8s",item2,"|\t" + money.format(item2Cost),"|\t" + item2Amount,"|\t" + money.format(item2Cost*item2Amount) + "\n");
		System.out.println("---------------------------------------------------------------------");

		//The next five lines determine the subtotal, tax, and total of everything they bought.
		final double subTotal = (item1Cost*item1Amount) + (item2Cost*item2Amount);
		System.out.format("%55s","Subtotal:  " + money.format(subTotal) + "\n");
		System.out.format("%54s","Tax:  " + money.format((subTotal)*0.13) + "\n");
		double total = subTotal * 1.13;
		System.out.format("%55s","Total:  " + money.format(total) + "\n");
		
		
		DecimalFormat money2 = new DecimalFormat("$###,##0");

		//These next two lines change the total into an integer to state how much they approximately need to pay.
		total = (int) total;
		System.out.println("This is approximately " + money2.format(total) + ".");

		//These final lines wish the user a nice day, thank them for using the program, and close the scanner.
		System.out.println("\nHave a good day!");
		System.out.println("Thank you for shopping at Mr. Tenaglia's Grocery!");

		sc.close();
	}

}
