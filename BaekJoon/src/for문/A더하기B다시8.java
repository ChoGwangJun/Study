package for문;

import java.util.Scanner;

public class A더하기B다시8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
		scn.close();
	}

}
