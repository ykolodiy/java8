package ProjectLambda;

import ProjectLambda.interfaces.simpleInterfaceWithARGS;

public class UseSimpleInterfacewithARGS {

	public static void main (String[] args) {
		
		
		simpleInterfaceWithARGS obj = (v1, v2) -> 
		
		{
			
			int result = v1*v2;
		System.out.println(result);
		
		
		};
		
		obj.doSomething(5,8);
		
	}
	
	
}
