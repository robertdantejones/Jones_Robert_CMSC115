import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Step 1: Gather input
		System.out.print("Enter the the first 12 digits of an ISBN number as a string: ");
		String isbn = input.nextLine();
		int checksum = 0;		
		
		// Step 2: Calculate 13 digit (checksum)
		while (true) {
		if (isbn.length() == 12) {
			
			String digit1 = isbn.substring(0,1);
			int d1 = Integer.parseInt(digit1);
			String digit2 = isbn.substring(1,2);
			int d2 = Integer.parseInt(digit2);
			String digit3 = isbn.substring(2,3);
			int d3 = Integer.parseInt(digit3);
			String digit4 = isbn.substring(3,4);
			int d4 = Integer.parseInt(digit4);
			String digit5 = isbn.substring(4,5);
			int d5 = Integer.parseInt(digit5);
			String digit6 = isbn.substring(5,6);
			int d6 = Integer.parseInt(digit6);
			String digit7 = isbn.substring(6,7);
			int d7 = Integer.parseInt(digit7);
			String digit8 = isbn.substring(7,8);
			int d8 = Integer.parseInt(digit8);
			String digit9 = isbn.substring(8,9);
			int d9 = Integer.parseInt(digit9);
			String digit10 = isbn.substring(9,10);
			int d10 = Integer.parseInt(digit10);
			String digit11 = isbn.substring(10,11);
			int d11 = Integer.parseInt(digit11);
			String digit12 = isbn.substring(11,12);
			int d12 = Integer.parseInt(digit12);
			
			checksum = 10 - (d1 + (3 * d2) + d3 + (3 * d4) + d5 + (3 * d6) + d7 + (3 * d8) +
					d9 + (3 * d10) + d11 + (3 * d12)) % 10;
				if(checksum == 10) {
					checksum = 0;
					System.out.print(isbn + checksum);
					break;
				}
				else {
					System.out.print("The ISBN-13 number is " + isbn + checksum);
					break;
				}
			
		}
		else {
			System.out.print(isbn + " is an invalid input");
			break;
		}
		
	  }

	}

}
