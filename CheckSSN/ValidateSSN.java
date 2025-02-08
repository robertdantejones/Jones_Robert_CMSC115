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
		
//		Step 2. Check if input is valid and display output
		if ((ssn.length() > 11 || ssn.length() < 11) || (firstSet.contains("-") || 
				secondSet.contains("-") || thirdSet.contains("-")))
			System.out.print(ssn + " is an invalid social security number");
		else 
			System.out.print(ssn + " is an valid social security number");
		
	}

}
