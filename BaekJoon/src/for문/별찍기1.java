package for��;

import java.util.Scanner;

public class �����1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N =scn.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for(int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
