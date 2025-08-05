import java.util.Scanner; 
public class MsCalculator {

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("Enter time in milliseconds: ");
    long data = input.nextLong();

    System.out.print(convertMillis(data));
    }

    public static String convertMillis(long milliseconds){
    int total_seconds = (int)(milliseconds / 1000);
    int hours = total_seconds / 3600; 
    int minutes = (total_seconds % 3600) / 60;
    int seconds = total_seconds % 60; 

    String totalTime = hours + ":" + minutes + ":" + seconds;

    return totalTime;
    }

}
