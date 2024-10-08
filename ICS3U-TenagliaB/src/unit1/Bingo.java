package unit1;
/**
 * Description: Prints rules for the game "BINGO" and also prints the rules above.
 * <p> Date: September 25, 2024
 * @author Ben Tenaglia
 */
public class Bingo {

	/**
	 * Entry point to the program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
	
		//This prints the Bingo Rules
		System.out.println("Bingo Card");
		System.out.println("\n1. The caller randomly pulls a numbered bingo ball.");
		System.out.println("\n2. The number is placed on the bingo board and called out.");
		System.out.println("\n3. Players look for the called number on their bingo card.");
		System.out.println("\n4. If the number is located, it is marked off.");
		System.out.println("\n5. Steps 1 and 4 are repeated until a player matches the BINGO pattern.");
		System.out.println("\n6. The winning player yells BINGO!");
		
		//This prints the Bingo board
		System.out.format("\n\t\tB\tI\tN\tG\tO\n");
		System.out.format("\n\t\t9\t23\t34\t50\t70\n");
		System.out.format("\n\t\t6\t29\t44\t46\t62\n");
		System.out.format("\n\t\t8\t18     FREE\t59\t75\n");
		System.out.format("\n\t\t14\t22\t40\t55\t68\n");
		System.out.format("\n\t\t2\t28\t37\t60\t69\n");
	}

}
