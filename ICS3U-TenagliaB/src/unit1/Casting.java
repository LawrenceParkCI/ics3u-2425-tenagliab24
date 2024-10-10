package unit1;

import java.util.Scanner;

/**
* Description: Casting worksheet <p>
* Date: Oct 10, 2024
* @author Ben Tenaglia
*/
public class Casting {
 
 /**
  * This is the entry point to the program.
  * @param args unused
  */
  public static void main(String[] args) {
    /*
    *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
    */

    System.out.println("Part 1");

    int intNum;
    intNum = 10;

    double doubleNum;
    
    //implicit casting
    doubleNum = intNum;

    //What type of data is printed here? Why?
    System.out.println(doubleNum);
    
    /**
     * a floating point value being 10.0 is printed because the original variable was made a double
     */

    //can you explain what is happening in this code?
    doubleNum = doubleNum + 2.2;
    
    /**
     * the variable "doublenum" is being changed to a different value.
     */

    //explicit casting
    intNum = (int) doubleNum;

    //What type of data is printed here? Why?
    System.out.println(intNum);

    /**
     * an integer value is printed here because when you put "int" in brackets, 
     * it forces the value to become an integer value if it is a floating point value or something else.
     */
    
    /*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
    
      int to double: Explicit, because you are adding a double in brackets to change the data type
      
      double to int: Explicit, because you are adding an int in brackets to change the data type
      
      int to long: Implicit, because you just have to replace the original variable declaration from an int to a long
      
      long to int: Implicit, because you just have to replace the original variable declaration from a long to an int

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
    */

    System.out.println("Part 2");

    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
    double myNum;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Give me decimal number up to the hundredth");
    //code
    myNum = in.nextDouble();
    
    myNum = myNum * 10;
    myNum = (int) myNum;
    myNum = (double) myNum/10;
    
    System.out.print("\nRounding down to the nearest tenth, it is: " + myNum);
    
    in.close();
  }
}