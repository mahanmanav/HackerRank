package algorithms.warmup;

import java.util.Scanner;

public class ChocolateFeast {

	private static int totalChocolates(int n, int c, int m) {
		int totalChocolates = n / c;
		int wrappers = totalChocolates;
		while(wrappers >= m) {
			int chocoByWrapers = wrappers / m;
			wrappers = wrappers % m + chocoByWrapers;
			totalChocolates += chocoByWrapers;
		}
		
		return totalChocolates;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println(totalChocolates(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		}
	}
}