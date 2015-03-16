package algorithms.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LonelyInteger {
	
	public static int lonelyInteger(int[] array) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: array) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i,  1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() == 1) {
				result = entry.getKey();
			}
		}
		
		return result;		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = Integer.parseInt(scan.nextLine());
		int[] array = new int[size];
		String next = scan.nextLine();
		String[] next_split = next.split(" ");
		
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(next_split[i]);
		}

		int lonely = lonelyInteger(array);
		System.out.println(lonely);
	}
}