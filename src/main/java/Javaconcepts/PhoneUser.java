package Javaconcepts;

public class PhoneUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile mb=new Mobile();
		mb.phoneCall("Marichamy");
		mb.phoneCall(98899928);
		boolean st=mb.receiverAvailability("Ringing");
		System.out.println(st);
		

	}

}
