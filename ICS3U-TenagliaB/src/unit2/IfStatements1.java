package unit2;

/**
* Description: If statements worksheet <p>
* Date: November 5, 2024
* @author Ben Tenaglia
*/

public class IfStatements1 {
  public static void main(String[] args) {
	  
	//declares two variables and assigns a value to each
    int firstNum = 10;
    int secondNum = 30;

    //
    System.out.println("Part 1: If");
    System.out.println("----------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGLUL");
    }    

    //What prints out? Why?
    //Nothing prints because first num is not greater than second num

    System.out.println("\nPart 2: If, Else");
    System.out.println("----------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    //"XQCL" prints because there is an else statement that runs if first num is not greater than second num

    System.out.println("\nPart 3: If, Else if, Else");
    System.out.println("-------------------------");
    if (firstNum > secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    //It prints "sykSHY" because the else if statement checks if first num is even and also if second num is a multiple of 3, which are both true

    System.out.println("\nPart 4: What's the difference?");
    System.out.println("------------------------------");
    System.out.println(1);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    } else {
      System.out.println("XQCL");
    }

    System.out.println(2);
    if (firstNum < secondNum) {
      System.out.println("KEKW");
      System.out.println("OMEGALUL");
    }

    if (firstNum % 2 == 0 && secondNum % 3 == 0){
      System.out.println("sykSHY");
    }

    if (!(firstNum < secondNum)) {
      System.out.println("XQCL");
    }

    //What prints out? Why?
    //What is the difference between the first and second part?
    //the first section prints only the first IF statement when the operation inside the brackets is true
    //the second section prints all IF statements that are true which are the first and second because they are seperate
  }
}