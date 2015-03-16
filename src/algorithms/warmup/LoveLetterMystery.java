package algorithms.warmup;

import java.util.Scanner;

public class LoveLetterMystery {

	static int getMinPalindromeConversionOp(String letter) {
		int minOp = 0;
		for(int i = 0; i < letter.length()/2; i++) {
			char begin = letter.charAt(i);
			char end = letter.charAt(letter.length() - 1 - i);
			if(begin != end) {
				int diff = ((int)begin) - ((int)end);
				if(diff < 0) {
					minOp -= diff;
				} else {
					minOp += diff;
				}
			}
			
		}
		
		return minOp;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < size; i++) {
			String letter = scan.nextLine().trim();
			int minOp = getMinPalindromeConversionOp(letter);
			System.out.println(minOp);
		}
	}
}