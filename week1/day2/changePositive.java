package week1.day2;

public class changePositive {
	public static void main(String[] args) {
		int number=-40;
		if(number<0) {
			number=number*-1;
			System.out.println("The number is altered as "+number);
		}
		else {
			System.out.println("The number is "+number);
		}
	}
}
