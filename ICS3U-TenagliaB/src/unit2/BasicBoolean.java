package unit2;

/**
* Description: Basic Boolean worksheet
* Date: November 5, 2024
* @author Ben Tenaglia
*/

public class BasicBoolean {
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either true or false
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because first num is 5 and second num is 10
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because first num is 5 and second num is 10
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because 5.5 is turned into 5 to equal to first num
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out false because 5.5 is greater than 5
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: greater than
      * < means: less than 
      * <= means: less than or equal to
      * >= means: greater than or equal to
      * == means: is equal to
      * != means: is not equal to
    */

  }
}