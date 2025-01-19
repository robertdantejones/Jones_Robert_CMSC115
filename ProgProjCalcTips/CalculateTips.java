import java.util.Scanner;
//Declare class 
public class CalculateTips {

//	declare main method 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		1. Get input from user (subtotal and gratuity)
		System.out.print("Enter the subtotal, for example 10:");
		double subtotal = input.nextDouble();
		System.out.print("Enter the gratuity, for example 15:");
		double gratuity = input.nextDouble();
		
//		2. Calculate: convert gratuity rate to dollar amount
		double convertGratuity = gratuity / 100.0; 
		
//		4. Calculate gratuity from percentage and subtotal
		double tipAmount = subtotal * convertGratuity; 
		
//		5. Calculate: add gratuity to subtotal
		double finalTotal = tipAmount + subtotal; 
		
//		6. Display final total and gratuity rate (round to hundredth decimal point)
		System.out.print("The gratuity is $" + ((int) (tipAmount * 100) / 100.0)  + " and total is $" + ((int) (finalTotal * 
				100) / 100.0));
	}

}
