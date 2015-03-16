package algorithms.warmup;

import java.util.Scanner;

public class SolveMeSecond {
	
	public static int solveMeSecond(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int sum = solveMeSecond(a, b);
			System.out.println(sum);
		}

	}

}
