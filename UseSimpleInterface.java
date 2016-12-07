package ProjectLambda;

import ProjectLambda.interfaces.simpleInterface;

public class UseSimpleInterface {

	public static void main (String[] args) {
		
		
		simpleInterface obj = () -> System.out.println("say something");
		
		obj.doSomething();
		
		
	}
	
	
}
