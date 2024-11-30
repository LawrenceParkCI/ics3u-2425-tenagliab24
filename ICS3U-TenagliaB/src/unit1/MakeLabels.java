package unit1;
/**
 * Description: Completing the tasks listed on the String Variables worksheet <p>
 * Date: October 2, 2024
 * @author Ben Tenaglia
 */
import java.util.Scanner;

public class MakeLabels {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//get user input
		System.out.println("Type in the subject and name then press <Enter>");

		//declares variables
		String subject;
		subject = sc.nextLine();

		String name;
		name = sc.nextLine();

		//output
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}

}
