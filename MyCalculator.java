package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator2 myCal = new Calculator2();
		System.out.println(myCal.add(8, 6, 14));
		System.out.println(myCal.sub(122, 2));
		System.out.println(myCal.mul(122, 61));
		System.out.println(myCal.divide(150f, 5f));
	}
}
