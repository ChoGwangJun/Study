package for¹®;

import java.util.Scanner;

public class NÂï±â {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		scn.close();
	}
}
