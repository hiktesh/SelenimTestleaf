package week2.day1;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int num=23,dup=0;
		for(int i=2;i<num-1;i++) {
			if((num%i)==0) {
				System.out.println(num+" is not a prime number");
				dup=dup+1;
				break;
			}
				
		}
		if(dup==0)
			System.out.println(num+" is a prime number");
		
	}
}
