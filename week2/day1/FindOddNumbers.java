package week2.day1;

public class FindOddNumbers {
	public static void main(String[] args) {
		int i,maxRange=10;
		System.out.println("Odd Numbers between 1 and 10 are:");
		for (i=1;i<maxRange;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}
}
