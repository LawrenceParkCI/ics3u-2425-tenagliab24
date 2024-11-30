package unit1;

/**
 * Description: Casting 3 Assignment <p>
 * Date: Oct 15, 2024
 * @author Ben Tenaglia
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way?

		/*
		 * Its prints like this because the computer reads it as a string, not a math equation
		 */

		//Demonstrate casting a double value to a String in this way
		
		System.out.println("helloo " + 5.0);
		
		//Demonstrate casting a boolean value to a String in this way
		
		System.out.println("helloo " + true);
		
		//Demonstrate casting a char value to a String in this way

		System.out.println("helloo" + 'o');

		System.out.println("Part 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "-5";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2"
		 * "23c"
		 * "2 3"
		 * "Lol23"
		 * "-5"
		 */
		//What can you say about how we can use the function, Integer.parseInt()?

		/*
		 * -5 is the only working value out of those five, I think that is because it is the only integer, and the code is only specifically for integers
		 */

		// What do you think the code to change a String to double would look like?

		String strNum2 = "-10";
		double myNum2 = Double.parseDouble(strNum2);
		System.out.println(strNum2 + " x 2 = " + (myNum2 + myNum2));

		//Similarly, test out the code and write down what instructions
		
		System.out.println(myNum2);
		
		//When do you think it might be necessary to change a string value into an integer value/double value?

		/*
		 * When you are doing calculations, you need numbers not strings, 
 		 * so people convert their string values into doubles or integers.
		 */

	}
}