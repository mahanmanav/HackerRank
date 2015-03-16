package algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
	
	static int getUnfairness(int[] list, int K) {
		int unfairness = Integer.MAX_VALUE;
		Arrays.sort(list);
		
		int[] difflist = new int[list.length-1];
		for(int i = 0; i < (list.length - 1); i++) {
			difflist[i] = list[i+1] - list[i];
		}
	
		int globalmin = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0; i <= (difflist.length - K + 1)  ; i++) {
			int localmin = 0;
			for(int j = 0; j < K - 1; j++) {
				localmin += difflist[i+j];
			}
			
			if(localmin < globalmin) {
				globalmin = localmin;
				minIndex = i;
				
			}
		}
		
		unfairness = list[minIndex+K-1] - list[minIndex];
		return unfairness;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int K = Integer.parseInt(scan.nextLine());
		
		int[] list = new int[N];
		for(int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(scan.nextLine());
		}
		
		int unfairness = getUnfairness(list, K);
		System.out.println(unfairness);
	}
}
