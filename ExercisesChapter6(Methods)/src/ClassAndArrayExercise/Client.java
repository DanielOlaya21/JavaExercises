package ClassAndArrayExercise;
import java.util.Random;

public class Client {
/* un array con clientes. 
	Incluir cantidad de dinero que tienen usando la clase random o numero aleatorio (usar rango de inicio y rango final).
	Cada Cliente va a ir en un array, la cantidad de clientes va a ser dado por un numero aleatorio (que cada cliente sea identificado con el numero de ID. Va en orden).
	Crear un metodo en la clase banco que deduzca una cantidad de dinero, a todos el mismo numero. O hacerlo deduciendo 100, 99, 98, 97. 
	*/
	//Caracteristicas o variables de los clients.
	
	int clientID;
	double savings;
			
	//Crear metodo constructor, darle valores iniciales a los clientes u objetos. 
			
	public Client(int clientID, double savings) {
		//
		this.clientID = clientID;
		this.savings = savings;
		
	}
	// Metodos setter para modificar los valores de las variables de cada objeto.
	
	public void setSavings(double savings) {
		this.savings = savings;
	}
	
	public double getSavings() {
		return savings;
	}
}
