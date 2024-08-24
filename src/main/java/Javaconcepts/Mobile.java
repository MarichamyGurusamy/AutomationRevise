package Javaconcepts;

public class Mobile {

	public void phoneCall(String Name) {
		
		System.out.println("Calling to "+Name);
		
	}
    public void phoneCall(int Number) {
		
		System.out.println("Calling to "+Number);
		
	}
    
    public boolean receiverAvailability(String Ringing) {
    	String RingingValue = Ringing;
    	
    	System.out.println(RingingValue);
    	
    return true;
    }
}
