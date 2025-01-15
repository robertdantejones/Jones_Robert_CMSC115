//declare project class
public class CalcPiExercise {
	
//declare main method
	public static void main(String[] args) {
		
		// Displays result 1 pi equation
        System.out.println("4(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)) = ");

        // Displays result 1
        // nts: multiplying expressions doesn't work without multiplication operator      
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));

        // Displays result 2 pi equation
        System.out.println("4(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+(1/13)) =");

        // Displays result 2
        System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));

	}

}
