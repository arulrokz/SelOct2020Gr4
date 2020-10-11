package week1.day1;

public class Mobile {
	float mobPrice = 25000.00f;
	long mobNumber = 8787878787L;
	String mobBrand = "Samsung";
	boolean isCharged = true;
	
	public void makeCall() {
		System.out.println("Making call");
	}
	public void sendText() {
		System.out.println("Sending Text");
	}
	public void takePicture() {
		System.out.println("Taking a Snap");
	}
	public static void main(String[] args) {
		Mobile myMobile=new Mobile();
		myMobile.makeCall();
		myMobile.sendText();
		myMobile.takePicture();
		System.out.println("Is ur Mobile charged? : "+myMobile.isCharged);
		System.out.println(myMobile.mobBrand);
		System.out.println(myMobile.mobPrice);
		System.out.println(myMobile.mobNumber);
	}
}
