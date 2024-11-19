package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: Randomness worksheet <p>
Date: November 18, 2024
@author Ben Tenaglia

 */

public class Randomness {
  public static void main(String[] args) {
    for (int i = 0; i < 40; i++) {
      System.out.println((int)(Math.random()*900)+100);
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
    //the range is from 0 to 1

    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    

  }
}