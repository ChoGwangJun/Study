package for��;

import java.util.Scanner;

public class �� {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		scn.close();
	}
}