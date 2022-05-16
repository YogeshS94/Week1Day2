package week1.day2;

public class ArmstrongNum {
	public static void main(String[] arg) {
		int in = 153;
		int put = in;
		int sum = 0; 
		while(in > 0) {
			int m = in % 10;
			sum = sum + (m*m*m);
			in = in / 10;
		}
		if (put == sum)
			System.out.println("Given number is a armstrong number: " + sum);
		else
			System.out.println("Given number is not a armstrong number: " + sum);
	}
}
