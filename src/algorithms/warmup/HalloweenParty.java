package algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class HalloweenParty {
	
	private static void printMaxChocoPieces(int k) {
		BigInteger h = BigInteger.valueOf(k/2);
		BigInteger w = BigInteger.valueOf(k - ((int)(k/2)));
		System.out.println(h.multiply(w).toString());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			printMaxChocoPieces(scan.nextInt());
		}
	}
}