package week1.day2;

import java.util.ArrayList;

public class DuplicateNumber {
	public static void main(String[] arg) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20, 17};
//		int[] arr = new int[5];
		int len = arr.length;
		int count;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < len; i++) {
			count = 0;
			for(int j = i+1; j < len; j++) {
				if (arr[i] == arr[j]) {
//					count = count + 1;
					if (al.contains(arr[i])){
						break;
					}
					else {
						al.add(arr[i]);
					}
						
					
				}
			}
		}
		System.out.print(al+ " ");
	}
}
