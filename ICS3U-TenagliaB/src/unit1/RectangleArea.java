package unit1;
/**
 * Description: Completed the tasks for the Integer variables worksheet <p>
 * Date: October 2, 2024
 * @author Ben Tenaglia
 */
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width, depth;
		
		//get the user input 
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the length of the rectangle and press <Enter>: ");
		length = sc.nextInt();
		
		System.out.println("Type in the width of the rectangle and press <Enter>: ");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectangle and press <Enter>: ");
		depth = sc.nextInt();
		
		//calculate the volume
		int area = length * width;
		int volume = length * width * depth;
		
		//print the output
		System.out.println();
		System.out.println("The area of your rectangle is " + area);
		System.out.println("The volume of your rectangle is " + volume);
		sc.close();
	}

}
