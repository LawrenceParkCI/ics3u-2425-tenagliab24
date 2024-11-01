package unit2;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Input any integer and press <Enter>");
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Your number is positive");
		}
		else {
			System.out.println("Your number is negative");
		}
		
		sc.close();
	}

}
