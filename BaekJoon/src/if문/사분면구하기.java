package if��;
import java.util.Scanner;

public class ��и鱸�ϱ� {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		if (0<x && y>0) {
			System.out.println("1");
		} else if (0>x && 0<y) {
			System.out.println("2");
		} else if (0>x && 0>y) {
			System.out.println("3");
		} else if (0<x && 0>y) {
			System.out.println("4");
		}
		scn.close();
	}
}