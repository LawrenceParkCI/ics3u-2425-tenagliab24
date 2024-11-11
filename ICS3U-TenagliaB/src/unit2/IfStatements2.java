package unit2;

import java.util.Scanner;

/**
* Description: If statements Worksheet <p>
* Date: November 11, 2024
* @author Ben Tenaglia
*/

public class IfStatements2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    //asks for input
    System.out.println("What is your age?");
    
    //declares  variable and scans it
    int userAge = in.nextInt();
    /*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
    */
    //Looking at the logic above, why do you think the 
    //program won't work? 
    //the program will not work because the variable declaration for "title" is inside the if statement, and you cannot run that code unless the age is equal to 18
    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.

    
    if (userAge > 18) {//If they're over 18, they are titled an adult
    	String title = "Adult";
    	System.out.println(title);
      } else {//if they're not over 18, I don't want a title
        System.out.println("Sorry, not quite yet.");
      }

      
    in.close();
  }
}