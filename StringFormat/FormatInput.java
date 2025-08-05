import java.util.Scanner;
public class FormatInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int intValue = input.nextInt();
		
		System.out.println("Enter the width: ");
		int widthValue = input.nextInt();
	
		System.out.println(format(intValue, widthValue));
	}
	
	public static String format(int number, int width) {
		String numberStr = String.valueOf(number);
		
	    if (numberStr.length() < width) {
	        String formatted = "%0" + width + "d";
	        return String.format(formatted, number);
	    } else {
	        return numberStr;
	    }
	}
}
