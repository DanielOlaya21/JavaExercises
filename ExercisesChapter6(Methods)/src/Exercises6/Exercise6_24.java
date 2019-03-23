package Exercises6;

import java.util.Scanner;

public class Exercise6_24 {

/*6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including 1 
 		(but not the number itself), sum to the number. For example, 6 is a perfect number, because 6 = 1 + 2 + 3. 
 		Write a method isPerfect that determines whether parameter number is a perfect number.
 		Use this method in an application that displays all the perfect numbers between 1 and 1000. Display 
 		the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing power of your 
 		computer by testing numbers much larger than 1000. Display the results.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPerfect();
	}
	static void isPerfect() {
		
		System.out.println("Enter the range of the Perfect numbers to be checked:");
		Scanner input = new Scanner(System.in); // declares a new input object.
		double max = input.nextInt();
		
		for(int number = 0; number < max; number++) {// recorre todos los numeros hasta mil
			
			double x; // variable que se usa para verificar cuales divisores no tienen remainder
			double sum = 0; // variable que va sumando los divisores que no tienen remainder.
			
			for(int divisor= 1; divisor < max; divisor++) { // divide por todos los numeros hasta mil.
				
				x = number % divisor; 
				
				if(x == 0) { // si x es 0, quiere decir que la division no tinee remainder. 
					sum = sum + divisor; // se anade el valor del divisor a la sumatoria
				}
			}
			int check = number * 2; // Generalmente se suman todos los factores, y estan incluidos el numero original.
									// EX: 6 es perfecto. Factores de 6 son 1, 2, 3, 6 y sumados dan 12 que es el doble que 6. 
				
			if(sum == check) {
				
				System.out.println("The " + number + " is prime:");
			}
		}
	}
	
}
