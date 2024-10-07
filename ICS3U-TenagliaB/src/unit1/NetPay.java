package unit1;

/**
 * Description: Completing the NetPay assignment 2
 * Date: October 7, 2024
 * @author Ben Tenaglia
 */

public class NetPay {

	public static void main(String[] args) {

		//declare the variables
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		
		//calculate the net pay
		double netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		
		//print the output
		System.out.println(netPay);
	}

}
