package �������迭;

import java.util.Arrays;
import java.util.Scanner;

public class �ּ��ִ� {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int maxMin[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			maxMin[i] = scn.nextInt();
		}
		Arrays.sort(maxMin);
		System.out.println(maxMin[0] + " " + maxMin[N-1]);
	}

}
