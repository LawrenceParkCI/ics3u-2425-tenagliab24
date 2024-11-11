package unit2;

import java.util.Scanner;

/**
 * Description: String challenge Worksheet <p>
 * Date: November 11, 2024
 * @author Ben Tenaglia
*/

class StringComparison {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = sc.nextLine();

    if (answer.equals("Toronto")) {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    
    //Run the code. What happens when you type the correct answer? The incorrect answer?
    //The correct answer leads to the program saying "Correct!", and the wrong answer leads to the program saying "Sorry, that's incorrect."
    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */
    String a = "Java";
    String b = "Coding";
    String c = "java";
    
    System.out.println(a.compareTo(b));
    System.out.println(a.equals(c));
    System.out.println(a.equalsIgnoreCase(c));
    
    //What values does compareTo() return?
    //compareTo returns an integer
    //How can we interpret the value?
    //The compareTo() method compares values lexicographically and returns an integer value that describes 
    //if first string is less than, equal to or greater than second string.
    
    //what value does equals() and equalsIgnoreCase() return? 
    //they return a Boolean value
    //What is the difference between these two functions?
    //The String class equals() method compares the original content of the string.
    //The equalsIgnoreCase() method performs a case-insensitive comparison.
    sc.close();
  }
}