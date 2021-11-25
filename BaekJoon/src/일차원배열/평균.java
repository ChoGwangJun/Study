package 일차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class 평균 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		double score[] = new double[N];
		double sum = 0;
		
		for (int i = 0; i < N; i++) {
			score[i] = scn.nextFloat();
			}
		Arrays.sort(score);
		
		for (int i = 0; i < N; i++) {
			sum += (score[i]/score[N-1]*100);
		}
		System.out.println(sum/N);
		}
}
