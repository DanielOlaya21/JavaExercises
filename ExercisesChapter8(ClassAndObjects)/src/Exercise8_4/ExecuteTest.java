package Exercise8_4;

public class ExecuteTest {
	
	public static void main(String[] args) {
		
		Rectangle myRectangle = new Rectangle();
		
		myRectangle.setLength(4);
		myRectangle.setWidth(4);
		
		System.out.println("The area is: \t" + myRectangle.area(myRectangle.getLength(),myRectangle.getWidth()));
		System.out.println("The perimeter is: \t" + myRectangle.perimeter(myRectangle.getLength(),myRectangle.getWidth()));
		
	}

}
