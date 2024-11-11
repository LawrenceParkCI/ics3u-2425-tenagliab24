package unit1;

/**
 * Description: Decimal format output worksheet
 * Date: Oct 17, 2024
 * @author Ben Tenaglia
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {

/**
 * Entry point to the program
 * @param args unused
 */
	
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  //Run the following program with a cost of 10.00.
  //What value is displayed in the output?
  
  /*
   * a value of 11.3 is outputted
   */
  
  final double TAX_RATE = 0.13;
  new DecimalFormat("$#,###,##0.00");
  DecimalFormat percent = new DecimalFormat("#.#%");

  System.out.print("Please enter the cost of an item then press <Enter>: $");
  System.out.println("The cost of your item with tax is " + percent.format(TAX_RATE));
  

  //Change the above print statement on line 19 to:
  //System.out.println("The cost of your item with tax is " + money.format(total));
  //Run the program again, how is the output different? Why?
  
  /*
   * It outputs "11.30", which adds a second decimal place to make the money format correct
   */
  
  //Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
  //Run the program again with the cost of 10, how is the output different?
  
  /*
   * It outputs "$11.30", a dollar sign has been added after the change
   */
  
  //Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
  //Run the program again with the cost of 10, how is the output different?
  
  /*
   * The output is back to 11.3 but with a dollar sign in front, so it is "$11.3"
   */
  
  //Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
  //Calculate 10.50 x 1.13 = 11.865
  //Run the program again with the cost of 10.50, what is happening?
  
  /*
   * It outputs "$11.87", rounding to the second decimal place
   */
  
  //Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
  //Run the program again with the cost of 123456, what is displayed?
  
  /*
   * it displays "$139505.28"
   */
  
  //Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
  //Run the program again with the cost of 123456, how is the output different? Explain what is happening.
  
  /*
   * It outputs "$139,505.28" now it has added commas to the number. 
   * This happens because the format added commas to put the numbers in between them.
   */
  
  //Uncomment the following print line, and run the program with any value for the cost.
  //What value is printed for the TAX_RATE?
  
  System.out.println("The tax rate is " + TAX_RATE);
  
  /*
   * I inputted 10, and the tax rate was still "0.13", but this 
   * will always be the tax rate no matter what number is inputted.
   */
  
  //Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
  //Run the program again with any cost, how is the TAX_RATE displayed differently?
  
  /*
   * It outputs 13% for the cost + tax no matter what number is inputted
   */

  sc.close();
 }

}