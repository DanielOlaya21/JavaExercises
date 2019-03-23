package Exercises6;

import java.util.Scanner;

public class Exercise6_25 {
	/*
(Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. 
The number 1, by definition, is not prime.
a) Write a method that determines whether a number is prime.
b) Use this method in an application that determines and displays all the prime numbers
less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
you’ve found all the primes?
c) Initially, you might think that n/2 is the upper limit for which you must test to see
whether a number n is prime, but you need only go as high as the square root of n. Re- write the program, and run it both ways.
	 */
	public static void main (String[] Arg) {
		
		isPrime();
		
	}
	static void isPrime() {
		
		System.out.println("Enter the range of the Prime numbers to be checked:");
		Scanner input = new Scanner(System.in); // declares a new input object.
		double max = input.nextInt();
		
		for (int number = 1 ; number < max; number++) { // loop that goes through all the numbers in the range
			
			int counter = 0; // Counter that counts how many times the number has a remainder of 0. For primes it can only be two since it is only divisible by one and itself

			for(int divisor= 1; divisor < max; divisor++) {// loop that divides using all of the numbers in the range
				
				double a = number % divisor;
				if (a == 0) {
					counter ++;
				}
			}
			
			if (counter == 2) {// if there is only 2 numbers that 
				System.out.println("the number " + number + " is prime");
			}
			
			
		}
		
	}

}
