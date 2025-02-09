/* Name: Robert
Date: 2/8/2025
Purpose: The purpose of this program is to validate format of 
SSN from user's input. 
Version: 1.0
*/

import java.util.Scanner;

//declare class
public class ValidateSSN {

//	declare method 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Step 1. Gather user input
		System.out.print("Enter a string for SSN: ");
		String ssn = input.nextLine();

//		Step 2. Extract substrings from dashes
		String firstSet = ssn.substring(0, 3);
		String secondSet = ssn.substring(4, 6);
		String thirdSet = ssn.substring(7);
		
//		Step 3. Verify if SSN has dashes
		String dashOne = ssn.substring(3, 4);
		String dashTwo = ssn.substring(6, 7);
		
//		Step 4. Verify if SSN only has digits 
		boolean first = firstSet.contains("#") || firstSet.contains("?");
		
		boolean second = secondSet.contains("#") || secondSet.contains("?");
		
		boolean third = thirdSet.contains("#") || thirdSet.contains("?");
		
		
//		System.out.print(dashOne + "and " + dashTwo);
//		Step 3. Check if input is valid and display output
//		Checking if SSN string is length 11 or contains "-" within in number places
		if ((ssn.length() < 11 && ssn.length() > 11) || (firstSet.contains("-") || 
				secondSet.contains("-") || thirdSet.contains("-")))
			System.out.print(ssn + " is an invalid social security number");
		
//		Checking if SSN length is 11 and if invalid characters are present 
		else if ((ssn.length() < 11 && ssn.length() > 11)|| (first && second && third ))
			System.out.print(ssn + " is an invalid social security number");
		
////		Checking if SSN length is 11, contains "-", and doesn't have invalid characters in 
//		number spaces
		else if (ssn.length() == 11 && dashOne.contains("-") && 
				dashTwo.contains("-") && !(first || second || third))
			System.out.print(ssn + " is an valid social security number");
		else 
			System.out.print(ssn + " is an invalid social security number");
	}

}
