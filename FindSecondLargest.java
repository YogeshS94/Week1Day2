package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] arg) {
		int[] data = {3,2,11,4,6,7};
		int le = data.length;
		int tem = 0;
		for(int i = 0; i<le; i++) {
			for(int j=i+1; j<le;j++) {
				if(data[i]> data[j]) {
					tem = data[i];
					data[i] = data[j];
					data[j] = tem;
				}
			}
		}
		for(int i =0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
		System.out.println("Second largest number: " + data[data.length-2]);
		
//		Arrays.sort(data);
//		System.out.println(data[le-2]);
	}
}
