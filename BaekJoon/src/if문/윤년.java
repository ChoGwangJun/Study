package if¹®;
import java.util.Scanner;

public class À±³â {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		if(year % 400 == 0) {
			 System.out.println("1");
		} else if (year % 100 == 0) {
			System.out.println("0");
		} else if (year % 4 == 0) {
			System.out.println("1");	
		} else {
			System.out.println("0");
		}
		scn.close();

	}

}
