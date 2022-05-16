package week1.day2;

public class MissingElementinArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int tem = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]> arr[j]) {
					tem = arr[i];
					arr[i] = arr[j];
					arr[j]=tem;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=1; i<arr.length; i++) {
			if(i != arr[i-1]) {
				System.out.println(" ");
				System.out.println("Missing element is: " + i);
				break;
			}
		}
	}

}
