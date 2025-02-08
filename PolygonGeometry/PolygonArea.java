//object for user input
import java.util.Scanner;

//declaring class
public class PolygonArea {

//	declaring main method
	public static void main(String[] args) {
		
//		Step 1. Gather User Input for Sides and Length of Polygon
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int sides = input.nextInt();
		
		System.out.print("Enter the length of a side: ");
		double length = input.nextDouble();
		
//		Step 2. Compute Area of Polygon
		double area = (sides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / sides)));
		
//		Step 3. Display area and user inputs
		System.out.printf("The area of a polygon is %.4f", area);

	}

}
