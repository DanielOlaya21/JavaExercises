package Exercises8;

public class SavingsAccount {
	
	static double annualInterestRate;// Variable global, unica para toda la clase. Sin importar cual sea el objeto
	
	private double savingsBalance;
	
	public double calculateMonthlyInterest() {
		
		double monthlyInterestRate = (annualInterestRate * savingsBalance)/ 12;
		
		savingsBalance += monthlyInterestRate;
		
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double newAnnualInterestRate) { //void porque solo necesito operarlo
		
		annualInterestRate = newAnnualInterestRate; //No se puede usar this.ann.. porque this hace referencia a la copia de x. Con metodo static hago referencia a la variable de la clase no de un objeto. 
		
	}
	
	public SavingsAccount(double savingsBalance) { // El metodo contstructor tiene el mismo nombre de la clase
		this.savingsBalance = savingsBalance;
	}
	
	
}
