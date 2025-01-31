import java.util.Scanner;
public class CalculateDays {

	public static void main(String[] args) {
//		1. Gather input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a month in the year (e.g., 1 for Jan):");
		int month = input.nextInt();
		
		System.out.print("Enter a year:");
		int year = input.nextInt();
		
		
//		2. Convert input to month
		String convertMonths = ""; 
		switch (month) {
		case 1: convertMonths = "January"; break;
		case 2: convertMonths = "February"; break;
		case 3: convertMonths = "March"; break;
		case 4: convertMonths = "April"; break;
		case 5: convertMonths = "May"; break;
		case 6: convertMonths = "June"; break;
		case 7: convertMonths = "July"; break;
		case 8: convertMonths = "August"; break;
		case 9: convertMonths = "September"; break;
		case 10: convertMonths = "October"; break;
		case 11: convertMonths = "November"; break;
		case 12: convertMonths = "December"; break;
		default: System.out.print("Invalid Month"); break;
		}
//		3. Calculate days 
		int days = 0;
		if (month == 1)
			days = 31;
		else if (month == 2)
			days = 28;
		else if (month == 3)
			days = 31;
		else if (month == 4)
			days = 30;
		else if (month == 5)
			days = 31;
		else if (month == 6)
			days = 30;
		else if (month >= 7 && month <= 10)
			days = 31;
		else if (month == 11)
			days = 30;
		else if (month == 12)
			days = 31;
		else 
			System.out.print("Invalid Month");
		
//		4. Calculate leap year 
		boolean isLeapYear = 
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		if (month == 2 && isLeapYear)
			days = 29;
		
//		Display output
		System.out.print(convertMonths + " " + year + 
				" has " + days + " days.");
		
		

	}                                                            

}
