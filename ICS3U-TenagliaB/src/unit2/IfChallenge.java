package unit2;

import java.util.Scanner;

/**
* Description: IF challenge worksheet
* Date: November 5, 2024
* @author Ben Tenaglia
*/

public class IfChallenge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int favNum;
    
    System.out.println("What is your favourite number?");
    favNum = sc.nextInt();
    
    if (favNum < 0) {
    	System.out.println("Look on the bright side!");
    }
    else if (favNum %2 != 0) {
    	System.out.println("That's a bit strange");
    }
    if (favNum %2 == 0) {
    	if (favNum %3 == 0) {
        	System.out.println("Consider thinking about 6");
        }
    }
    else {
    	System.out.println("You can keep wholesome");
    }
    
    if (favNum %10 == 8) {
    	System.out.println("You are too full!");
    }
    else if (favNum %10 == 9) {
    	System.out.println("Canada is a nice country!");
    }
    else {
    	System.out.println("Don't count on it");
    }
    
    /*

    (IF)
	
    ask for the user's favorite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
    */
    
    sc.close();
  }
}