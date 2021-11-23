package if문;
import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score =scn.nextInt();

		if (90 <= score) {
			System.out.println("A");
		} else if (80 <= score) {
			System.out.println("B");
		} else if (70 <= score) {
			System.out.println("C");
		} else if (60<= score) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
1
