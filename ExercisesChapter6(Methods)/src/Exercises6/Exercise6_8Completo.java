package Exercises6;

import java.util.Scanner;

public class Exercise6_8Completo {
	/*A parking garage charges a $2.00 minimum fee to park for up to three
	hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
	hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
	longer than 24 hours at a time. Write an application that calculates and displays the parking charges
	for each customer who parked in the garage yesterday. You should enter the hours parked for each
	customer. The program should display the charge for the current customer and should calculate and
	display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
	the charge for each customer.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] timeTable = new int[5];
		double[] chargesTable = new double[5];
		
		
		//Input
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0; i < timeTable.length; i++) {
			System.out.println("Enter amount of parking hours for client " + i + ":");
			timeTable[i] = input.nextInt();
		}
		for (int j = 0; j < chargesTable.length; j++) {
			chargesTable[j] =  calculateCharges(timeTable[j]);
		}
		for (int i =0; i < timeTable.length; i++) {
			System.out.println("Time: " + timeTable[i] + "  Charge: " + chargesTable[i]);
		}
		//Process
		//calculateCharges(hours);
		
		//Output
		System.out.println("Charges: " + calculateCharges(input.nextInt()));
		
	}
	
	
	//Method that Calculates the Charges
	static double minimumfee = 2.00;
	int time = 1;
	static double chargesPerHour = 0.50;
	
	public static double calculateCharges(int time) {
		double charges = minimumfee;
		if(time > 3) {
			
			charges = (chargesPerHour * (time - 3))+ minimumfee;
			
			if(charges > 10) {
				charges = 10;
			}
			
		}
		
		return charges;
		
	}
	
}
