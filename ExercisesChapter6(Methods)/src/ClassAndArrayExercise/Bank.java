package ClassAndArrayExercise;

public class Bank {

	// la caracteristica de los metodos static es que no hay necesidad de construir un objeto para
	// acceder a este metodod. Basta con llamar a la clase. Como la clase math para acceder a los metodos
	//El void es porque vamos a hacer cambios en una variable que no hay necesidad de mostrarla u operarla con totra cosa.
	public static void deductMoney(double quantityDeducted, Client clientID) {
		
		clientID.setSavings(clientID.getSavings() - quantityDeducted);// set es llamado para cambiar el valor del get (accede la cantidad) y deduciendo la cantidada a deducir.
	
	}
	
}
