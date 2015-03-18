package algorithms.warmup;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {

	private static void getPossibleLastStones(int n, int a, int b) {
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0; i < n; i++) {
			set.add((a*i) + (n-1-i)*b);
		}
		
		System.out.println(set.toString().replaceAll("\\[|\\]|,", ""));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			getPossibleLastStones(scan.nextInt(), scan.nextInt(), scan.nextInt());
		}
	}

}
