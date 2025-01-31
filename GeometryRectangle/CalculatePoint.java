import java.util.Scanner;
public class CalculatePoint {

	public static void main(String[] args) {
//		1. Gather Input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
//		2. Calculate X,Y
		if ((x >= -5 && x <= 5) && (y >= -2.5 && y <= 2.5)) 
				System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
		else 
			System.out.print("Point (" + x + ", " + y + ") is not the rectangle");
		
		input.close();
		
		
 

	}

}
