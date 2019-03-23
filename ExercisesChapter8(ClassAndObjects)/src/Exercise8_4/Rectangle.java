package Exercise8_4;

public class Rectangle {
	
	/*
	(Rectangle Class) Create a class Rectangle with attributes length and width, each of which
	defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
	methods for both length and width. The set methods should verify that length and width are each
	floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
	*/
	
	private double width = 1;
	private double length = 1;
	
	
	public double getLength() {
		
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {
		
		if(length > 20 || length < 0) {
			System.out.println("Length must be between 0 and 20");
		}
		else
			this.length = length;
	}
	
	public void setWidth(double width) {
		
		if(width > 20 || width < 0) {
			System.out.println("Width must be between 0 and 20");
		}
		else
			this.width = width;
	}
	
	public double area (double width, double length) {
		
		double area = length * width;
		return area;
	}
	
	public double perimeter (double width, double length) {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
}
