package THREAD;



public class RTH{
	
	public static void main(String[] args){
		
		// Create a new Thread that executes the code in GetTime20
		
		Thread getTime = new GetTime20();
		getTime.start();
		
		
		
		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds
		
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAgain = new GetTheMail(20);
		
		// Call for the code in the method run to execute
		
		
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
		
	}
	
}