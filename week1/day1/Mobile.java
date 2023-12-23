package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		Mobile Iphone= new Mobile();
		System.out.println("This is my mobile");
		Iphone.makeCall();
		Iphone.sendMsg();
	}
	public void makeCall() {
		String mobileModel="13";
		Float mobileWeight=200.0f;
		System.out.println("Mobile Model is "+mobileModel+" & Mobile Weight is "+mobileWeight+" grams");
	}
	public void sendMsg() {
		boolean isFullCharged=false;
		int mobileCost=49000;
		System.out.println("Mobile is Fully Charged "+isFullCharged+" & Mobile Cost is Rs "+mobileCost);
	}
}
