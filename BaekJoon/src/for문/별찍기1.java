package for¹®;

import java.util.Scanner;

public class º°Âï±â1 {

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
