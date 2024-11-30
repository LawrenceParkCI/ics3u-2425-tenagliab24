package unit1;

/**
 * Description: Number format output worksheet
 * Date: Oct 17, 2024
 * @author Ben Tenaglia
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  final double TAX_RATE = 0.13;
  NumberFormat money = NumberFormat.getCurrencyInstance();
  NumberFormat percent = NumberFormat.getPercentInstance();

  double cost;
  System.out.print("Please enter the cost of an item then press <Enter>: $");
  cost = sc.nextDouble();
  double total = cost + (cost * TAX_RATE);
  System.out.println("The cost of your item with tax is " + money.format(total));
  System.out.println("The tax rate is " + percent.format(TAX_RATE));
  
  //How can you change how your value is displayed?
  
  /*
   * You can't change how it is displayed because NumberFormat is not 
   * customizable like DecimalFormat, and it has presets to choose from instead.
   */
  
  //What other formats does NumberFormat offer?
  /*
   * NumberFormat.getNumberInstance(); - Returns the NumberFormat instance for general-purpose number formatting
   * NumberFormat.getCurrencyInstance(); - Returns the NumberFormat instance for currency formatting
   * NumberFormat.getCompactNumberInstance(); - Returns a NumberFormat instance for compact number formatting
   */
  
  sc.close();
 }

}
