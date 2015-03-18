package algorithms.warmup;

import java.util.Scanner;

public class SherlockAndSquares {
    
    private static long getSquareIntegerCount(int a, int b) {
		int sqrtA = (int)Math.sqrt(a);
		int sqrtB = (int)Math.sqrt(b);
		
		if(sqrtA * sqrtA < a) {
			sqrtA++;
		}
		
		return (sqrtB - sqrtA + 1);
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println(getSquareIntegerCount(scan.nextInt(), scan.nextInt()));
		}
    }
}