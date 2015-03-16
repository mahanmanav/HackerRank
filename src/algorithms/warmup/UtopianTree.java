package algorithms.warmup;

import java.util.Scanner;

public class UtopianTree {
	
	public static int getUtopianTreeHeight(int cycles) {
		int result = 1;
		if(cycles > 0) {
			for(int i = 1; i <= cycles; i++) {
				if(i % 2 == 0) {
					result += 1;
				} else {
					result *= 2;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcases = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < testcases; i++) {
			int cycles = Integer.parseInt(scan.nextLine());
			int height = getUtopianTreeHeight(cycles);
			System.out.println(height);
		}
	}
}