package unit1;

/**
 * Description: Casting 2 worksheet<p>
 * Date: Oct 15, 2024
 * @author Ben Tenaglia
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);
		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?

		/*
		 * The code prints "a", "98" and "b"
		 *
		 * Explicit casting: 
		 * 	 char myChar2 = (char) (myChar + 1);
		 *	 System.out.println(myChar2);
		 *	
		 * Implicit casting: 
		 * 	 char myChar = 'a';
		 *	 System.out.println(myChar);
		 *	 System.out.println(myChar + 1);
		 */

		//Why do you think this happens?

		/*
		 * The code creates a new variable called myChar and sets it to "a" then prints that letter, 
		 * but after prints the computer's value of "a" which is 97, and adds 1 to print 98.
		 * The code then creates a new variable called myChar2 and sets it to a forced character 
		 * which removes the computer's value and adds the letter, then adds 1 to myChar which 
		 * makes it equal to b instead of the computer's value.
		 */

		//Investigate what is ASCII. What is it?

		/*
		 * ASCII is a character encoding standard used to represent text in computers and other devices.
		 */

		//Can you find the number value for 'a'? Does it match with your findings above?

		/*
		 * The number value for a is 97. so it does match up.
		 */

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it

		char myCharCap = (char)(myChar - 32);
		System.out.println(myCharCap);


	}

}