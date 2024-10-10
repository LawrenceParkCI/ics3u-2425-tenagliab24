package unit1;

import java.util.Scanner;

/**
 * Description: using math methods assignment worksheet <p>
 * Date: Oct 9, 2024
 * @author Ben Tenaglia
 */
public class UsingMathMethods {

 /**
  * Entry point to the program
  * @param args
  */
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  double num;
  
  System.out.println("Part A");
  
  //Write code to ask the user for any real number to be input.
  System.out.println("Input any real number and press <Enter>");
  
  //Store their input into the num variable
  num = sc.nextDouble();
  
  System.out.println(Math.round(num));
  System.out.println(Math.rint(num));
  System.out.println(Math.sqrt(num));
  System.out.println(Math.abs(num));
  System.out.println(Math.pow(num, 2));
  System.out.println(Math.pow(num, num));
  System.out.println(Math.pow(num, 3));
  
  /*
   * Run the program and write down the output that is produced
   * when each of the following values are input:
   * 
   *      num = 16.75  | num = 4.0  | num = -23.45
   *      -----------------------------------------------
   * Math.round(num)    17                   | 4 |     -23
   * Math.rint(num)     17.0                 | 4.0 |   -23.0
   * Math.sqrt(num)     4.092676385936225    | 2.0 |   NaN
   * Math.abs(num)      16.75                | 4.0 |   23.45
   * Math.pow(num, 2)   280.5625             | 16.0 |  549.9024999999999
   * Math.pow(num, num) 3.178689376746782E20 | 256.0 | NaN
   * Math.pow(num, 3)   4699.421875          | 64.0 |  -12895.213624999999
   * 
   */
  
  //Why does the last value(-23.45) give strange output for Math.sqrt(num)?
  //NaN stands for Not a number!
  /**
   * It gives that output because you cannot square root a negative value.
   */
  
  //In your own words describe what the following Math methods does
  /*
   * round: rounds the inputed number to the nearest whole
   * rint: rounds the inputed number to the nearest whole and adds a decimal
   * sqrt: outputs the square root of the inputed number
   * abs: Displays the absolute value of the inputed number
   * pow: Multiplies the base number you input by the exponent that you input.
   */
  
  //The methods round, sqrt and abs only have one parameter (which is in the brackets).
  //Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
  /**
   * The pow method needs a base number and an exponent to multiply the base by.
   */
  
  System.out.println("\nPart B");
  
  //Ask the user for any real number and an integer to be input. Display the real number,
  //and its square root. Also determine and display the real number raised to the integer power.
  //Use suitable headings, displaying the results across the screen.
  //
  //Eg. If the real number 13.5 nad the integer 2 are input, display
  //REAL NUMBER SQUARE ROOT  RAISED TO POWER 2 <- display power here
  //   13.5     3.6742   182.25
  
  System.out.println("Input two real numbers then press <Enter>");
  
  double num1;
  double num2;
  
  num1 = sc.nextDouble();
  num2 = sc.nextDouble();
  
  System.out.println("\nYour real number input was: " + num1);
  System.out.println("The square root of your real number is: " + Math.sqrt(num1));
  System.out.println("Your real number raised to your integer's power is: " + Math.pow(num1, num2));
  
  //Write down the results produced by your program when the real number 7.8985 and
  //the integer 3 are input.
  
  /**
   * Your real number input was: 7.8985
   * The square root of your real number is: 2.8104270138183627
   * Your real number raised to your integer's power is: 492.75820832162503
   */
  
  //Change your program so that instead of inputting an integer power, a real number
  //power can be input.
  //Write down the results produced by your program when the following are input:
  //a) the number 16 and the real number power 0.5
  //b) the number 8 and the real number power 0.33
  
  /**
   * a) Your real number input was: 16.0
   * The square root of your real number is: 4.0
   * Your real number raised to your integer's power is: 4.0
   * 
   * b) Your real number input was: 8.0
   * The square root of your real number is: 2.8284271247461903
   * Your real number raised to your integer's power is: 1.9861849908740719
   */
  
  //Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
  
  //The output for the power is now 1.9999998613705687 instead of 1.9861849908740719 before.
  
  
  sc.close();
 }

}
