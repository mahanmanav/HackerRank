package algorithms.warmup;

import java.util.Scanner;

public class MaxXor {
	public static int getMaxXor(int left, int right) {
		int maxXor = 0;
		if(left < right) {
			for(int i = left; i <= right; i++) {
				for (int j = left; j <=right; j++) {
					int curXor = i ^ j;
					if(maxXor < curXor) {
						maxXor = curXor;
					}
				}
			}
		}
		return maxXor;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int left = Integer.parseInt(scan.nextLine());
		int right = Integer.parseInt(scan.nextLine());
		
		int maxXor = getMaxXor(left, right);
		System.out.println(maxXor);
	}
}
