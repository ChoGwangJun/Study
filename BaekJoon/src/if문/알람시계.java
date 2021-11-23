package if문;
import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int M = scn.nextInt();

		if(M<45) {
			H--;
			M = M+15;
			if (H<0) {
				H=23;
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M-45));
		}
		scn.close();
	}

}
