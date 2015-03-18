package algorithms.warmup;

import java.util.Scanner;

public class FillingJars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nm = scan.nextLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		long M = Integer.parseInt(nm[1]);
		
		long totalCandies = 0;
		for(int i = 0; i < M; i++) {
			String[] abk = scan.nextLine().split(" ");
			long a = Integer.parseInt(abk[0]);
			long b = Integer.parseInt(abk[1]);
			long k = Integer.parseInt(abk[2]);
			
			totalCandies += ((b - a + 1) * k); 
		}

		long avgCandies = totalCandies/N;
		System.out.println(avgCandies);
	}
}
