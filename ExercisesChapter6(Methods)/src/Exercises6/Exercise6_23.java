package Exercises6;

import java.util.Scanner;

public class Exercise6_23 {
	/*
	 (Find the Minimum) Write a method minimum3 that returns the smallest of three floating- point numbers.
	 Use the Math.min method to implement minimum3. Incorporate the method into an application that reads three values from the user, 
	 determines the smallest value and displays the result.
	 */
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 3 values to check as minimum");
		
		double x= input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		//Output
		double result = minimum3(x,y,z);
		
		//Print 
		System.out.println(result);
	}
	
	public static double minimum3(double x, double y, double z) {
		
		double minimumValue = x;
		if(y < minimumValue)
			minimumValue = y;
		
		if(z < minimumValue)
			minimumValue = z;
		
		return minimumValue;
	}
}
