package week1.day2;

public class SumOfDigit {
	
	public static void main(String[] arg) {
		int digit = 123456;
		int m = 0;
		int sum = 0;
		while(digit>0) {
			m = digit % 10;
			sum = sum + m;
			digit = digit/10;
		}
		System.out.println(sum);
			
	}
	
	
			
}
