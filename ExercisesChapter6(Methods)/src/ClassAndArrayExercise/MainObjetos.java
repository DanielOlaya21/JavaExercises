package ClassAndArrayExercise;
import 	java.util.Random;

public class MainObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();// Estoy llamando un metodo constructor, por eso pide constructor
		
		int numberOfClients = rand.nextInt(100);
		
		
		Client[] clientLists = new Client[numberOfClients]; // lista de clientes o del objeto
		
		for(int i = 0; i < clientLists.length; i++) {
			
			clientLists[i] = new Client( i+1, rand.nextInt(1000));
		}
		
		System.out.println(numberOfClients);
		
		for(int i = 0; i< clientLists.length; i++) {
			
			System.out.println(clientLists[i].getSavings());
			
		}
		
		for(int i = 0; i<clientLists.length; i++) {
			
			Bank.deductMoney(rand.nextInt(20), clientLists[i]);
		}
		
		for(int i = 0; i< clientLists.length; i++) {
			
			System.out.println("La cantidad deducida: " + clientLists[i].getSavings());
			
		}
		
	}
}
