package week2.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1=0,num2=1,i;
		int numFib=8;
		System.out.println("The number of numbers in Fibonacci series is:"+numFib);
		if(numFib>2) {
			System.out.print("0,1,");
			for(i=1;i<numFib-1;i++) {
				int nextNum=num1+num2;
				System.out.print(nextNum+",");
				num1=num2;
				num2=nextNum;
			}
		}
	}
}
