/*Name: Robert
 * Purpose: The purpose of this program is to allow a user to
 * calculate the total price of a product based on the discount. 
 * Date: 1/20/2025
 * Version: 1.0
 */
//import input
import java.util.Scanner;
//initialize class
public class DiscountProject {
//declare main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		1. Get input for discount rate and item price.
		System.out.print("Enter the price of the item: $");
		double itemPrice = input.nextDouble();
		
		System.out.print("Enter the discount rate in percentage," + ""
				+ "for example 35:");
		double discount = input.nextDouble();
		
//		2. Convert percentage to decimal
		double discountDecimal = discount / 100.0;
		double discountDollarAmount = discountDecimal * itemPrice;
		
//		3. Calculate and display final price. 
		double finalPrice = itemPrice - discountDollarAmount;
		System.out.print("At checkout, your item will be: $" + ((int) (finalPrice * 100) / 100.0));

	}

}
