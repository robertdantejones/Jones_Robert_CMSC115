import java.util.Scanner;
//Declare class 
public class CalculateTips {

//	declare main method 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		1. Get input from user (subtotal and gratuity)
		System.out.print("Enter the subtotal and a gratuity rate. for example 10 15:");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		
//		2. Calculate: convert gratuity rate to dollar amount (round 
//		to two decimal points
		double convertGratuity = gratuity / 100; 
		
//		4. Calculate gratuity from percentage and subtotal
		double finalTotal = subtotal * convertGratuity; 
		
//		5. Display final total and gratuity rate 
	}

}
