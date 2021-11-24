package for¹®;

import java.util.Scanner;

public class ±âÂïN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++)
			System.out.println(n-i);
		scn.close();
	}

}
