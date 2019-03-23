package ClassAndArrayExercise;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Random aleatorio = new Random(); // declarar objeto random
		System.out.println(aleatorio.nextInt(100)); //el metodo nextInt es para declarar un rango. 
		*/
		
		Random rand = new Random(); // Declares a random variable.
		
		
		//int[]clientsArray = new int[rand.nextInt(100)];//rand in this case is an int value from 0 to 100.
		int MonyeOfClients = 100;
		int[] clientsArray = new int[100];
		
		
		for(int i= 0; i < clientsArray.length; i++) {
			
			clientsArray[i] = MonyeOfClients;
		}
		
		
		System.out.println("Introduce the amount to be deduced: ");
		Scanner input = new Scanner(System.in);
		int deductedAmount = input.nextInt();
		
		for(int i= 0; i< clientsArray.length; i++) {
			
			clientsArray[i] -= deductedAmount;
		}
		//Array that assigns random values.
		/*
		for (int i = 0; i < clientsArray.length; i++) {
			
			int MoneyOfClients = rand.nextInt(1000);// Money of Clients is any number between 1 and 1000.
			clientsArray[i] = MoneyOfClients;
			MoneyOfClients +=1; // Add 1 to the result to get a number from 1 to 1000 instead of 0 to 999. 
		}
		*/
		System.out.printf("%s%8s%n", "ClientID", "Savings");// Prints the Column titles
		
		for(int counter= 1; counter < clientsArray.length; counter++) { // for loop that formats the index and the values
			System.out.printf("%5d%8d%n", counter, clientsArray[counter]);
		}
	}

}
