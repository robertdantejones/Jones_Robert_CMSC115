/* Name: Robert
Date: 1/19/2025
Purpose: The purpose of this program is to calculate the future investment value from user's input. 
Version: 1.0
*/
import java.util.Scanner;
//declare class
public class CalculateInvestValue {
//declare main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Step 1: Get input from user: Investment amount, annual interest rate, years for investment)
		System.out.print("Enter investment amount, for example 1000.56:");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate, for example 4.25:");
		double annualRate = input.nextDouble();
		
		System.out.print("Enter number of years, for example 1:");
		int years = input.nextInt();
		
		// Step 2: Calculate monthly interest rate, converting percentage to decimal
		double monthlyRate = (annualRate / 100) / 12;
		
		// Step 3: Calculate investment value
		double futureValue = investmentAmount * (Math.pow(1 + monthlyRate, 12 * years)); 
		
		// Step 4: Display output (Interest amount)
		System.out.println("Accumulated value is $" + ((int) (futureValue * 100) / 100.0));
		

	}

}
