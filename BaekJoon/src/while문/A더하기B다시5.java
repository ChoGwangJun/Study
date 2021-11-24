package while문;

import java.util.Scanner;

public class A더하기B다시5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 0;
		
		while (true) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			if (A==0 && B==0) {
				break;
			}
			System.out.println(A+B);
		}
		scn.close();
	}

}
