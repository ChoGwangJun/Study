package for��;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (i*n));
		}
		scn.close();
	}
}