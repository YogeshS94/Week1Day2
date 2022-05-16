package week1.day2;

public class Calculator {
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public double sub(double a1, double b1) {
		double subt = a1 - b1;
		return subt;
	}
	public double multiply(double a2, double b2) {
		double mult = a2 * b2;
		return mult;
	}
	public int division(int a3, int b3) {
		int div = a3 / b3;
		return div;
	}
	public static void main(String[] arg) {
		Calculator cal = new Calculator();
		int aa = cal.add(4, 5);
		double bb= cal.sub(10, 4);
		double cc= cal.multiply(4, 4);
		int dd = cal.division(15, 3);
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		int[] number= {};
//		System.out.println(number);
		
	}
}
