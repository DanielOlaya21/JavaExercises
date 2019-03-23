package Exercises6;

public class Exercise6_15 {
	
	/*(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
	a right triangle when the lengths of the other two sides are given. The method should take two arguments
	of type double and return the hypotenuse as a double. Incorporate this method into an application that reads values for side1 and side2 and performs the calculation with the hypotenuse
	method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
	triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]
	Triangle Side 1 Side 2
	1		 3.0 	4.0
	2 		 5.0 	12.0
	3 		 8.0    15.0
Fig. 6.15 | Values for the sides of triangles in Exercise 6.15.
	*/
	public static void main(String[] args) {
		
		
		Triangle triangle1 = new Triangle(3.0, 4.0);
		Triangle triangle2 = new Triangle(5.0,12.0);
		Triangle triangle3 = new Triangle(8.0, 15.0);
		
		/*
		triangle1.setHypothenuse(triangle1.CalculateHypothenuse(triangle1.getSide1(), triangle1.getSide2()));
		triangle2.setHypothenuse(triangle2.CalculateHypothenuse(triangle2.getSide1(), triangle2.getSide2()));
		triangle3.setHypothenuse(triangle3.CalculateHypothenuse(triangle3.getSide1(), triangle3.getSide2()));
		
		
		System.out.println(triangle1.getHypothenuse());
		System.out.println(triangle2.getHypothenuse());
		System.out.println(triangle3.getHypothenuse());
		*/
		
		printHypothenuses("triangle1", triangle1);
		printHypothenuses("triangle2", triangle2);
		printHypothenuses("triangle3", triangle3);
	
	}
	public static void printHypothenuses(String triangleName, Triangle triangle) {
		triangle.setHypothenuse(triangle.CalculateHypothenuse(triangle.getSide1(), triangle.getSide2()));

		System.out.println("The hypothenuse of " + triangleName + " is: " + triangle.CalculateHypothenuse(triangle.getSide1(), triangle.getSide2()));
	}
}

class Triangle{
	double side1;
	double side2;
	double hypothenuse;
	
	public Triangle (double side1, double side2) {
		this.side1= side1;
		this.side2= side2;
	}
	
	
	
	public static double CalculateHypothenuse(double side1, double side2) { // donde tiene que ir este metodo. Aca? o oabajo fuera de public Class, o en main?
		double Hypothenuse = 0;
		double powersOfVariables= 0;
		powersOfVariables = (Math.pow(side1, 2)) + (Math.pow(side2, 2));
		Hypothenuse = Math.sqrt(powersOfVariables);
			
		return Hypothenuse;
	}	
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getHypothenuse() {
		return hypothenuse;
	}
	
	public void setHypothenuse(double Hypothenuse) {
		this.hypothenuse = Hypothenuse;
	}
	
}

