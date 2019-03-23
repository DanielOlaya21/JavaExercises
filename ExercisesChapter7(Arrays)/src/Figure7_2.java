import java.util.Random;
public class Figure7_2 {

	public static void main(String[] args) {
		
		
		
		final int ARRAY_LENGTH =10; //Declares a constant. Must be initialized before they are used
									//Cannot be modified thereafter. 
		
		int[] array = new int[ARRAY_LENGTH]; // Create Array
		
		//calculate a value for each array element. This time it is only pair value
		for(int counter =0; counter < array.length; counter++) {
			
			array[counter] = 2 + 2 * counter; 
		}
		
		System.out.printf("%s%8s%n", "Index", "Value"); // Column Headings. Prints the index and 
												//the value when you write printf("%s%8s%n"). For more reference the api for class Formater. 
		//Output Each array element's value
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		
		
	}
}
