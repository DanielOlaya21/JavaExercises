package Exercises6;

import java.util.Scanner;

public class Exercise6_26 {
/*
 6.26 (Reversing Digits) Write a method that takes an integer value and returns the number with its digits reversed. 
 For example, given the number 7631, the method should return 1367. 
 Incorporate the method into an application that reads a value from the user and displays the result.
 */
	public static void main(String[] args) {
		
		reverseInteger();
	}
	
	static void reverseInteger() {
	
		System.out.println("Enter the number to be reversed: ");
		Scanner input = new Scanner(System.in); // declares a new input object.
		int number = input.nextInt();
		
		int digits = (int)(Math.log10(number) + 1);
		
		
		
		int[] reverseArray = new int[digits];
		
		/*
		int x = number % 10;
		reverseArray[0]= x;
		*/
		
		int assignedNumber = number; //Takes the users input and assign it to the variable
		
		
		for(int i = 0; i < digits; i++) {
			
			int storedNumber = assignedNumber %10; // storedNumber is the value that is going to be stored 
													//in the variable. Since it is an int it will ignore the decimal.  
			
			reverseArray[i] = storedNumber; // Assigns storedNumber to a place in the array
			
			assignedNumber = assignedNumber/10; 
			// Takes the Original assignedNumber, divides it by 10 so it can take 
			// be taken to the next cycle. ex: 2034 now becomes 203. Then the modulus takes the 3 by 
			// dividing by 10 and takes the decimal, assigns that and then the assignedNumber is divided by 10.
			// 
												
			
			
			/*
			int a = number/10;
			int b = a % 10;
			reverseArray[digitCounter]= b; 
			*/
			
		}
		
		
		System.out.println("The reversed number is:");
		//Output
		for(int i=0; i <reverseArray.length; i ++) {
			
			System.out.print(reverseArray[i]);
		}
		
		
		/*
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f =0;
		int g =0;
		int h =0;
		
		a = number % 10;
		
		b = number / 10;
		c = b %10;
		
		d = b / 10;
		e = d %10;
		
		g = d / 10;
		h = g % 10;
		*/
		
		
		
		
		//System.out.println(a + " \n" + c + "\n" + e + "\n" + h);
		
		//int[] reverseArray = new int[3];
		

	}
}
