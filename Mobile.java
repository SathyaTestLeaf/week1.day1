package week1.day1;

public class Mobile {
	
	String mobileModel = "Honor 8X";
    int mobileWeight = 15;
    boolean isFullCharge = true;
    double mobileCost = 10500.50;
    
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Call Connected");
	}
private void sendMsg() {
	// TODO Auto-generated method stub
	System.out.println("Message sent");

}	
public static void main(String[] args) {
	Mobile obj = new Mobile();
	obj.makeCall();
	obj.sendMsg();
	System.out.println(obj.mobileModel);
	System.out.println(obj.mobileWeight);
	System.out.println(obj.isFullCharge);
	System.out.println(obj.mobileCost);
}
}
