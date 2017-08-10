package pack1;

public class Greeter {

	public void Greet (Greeting greeting) {
		greeting.perform();
		
		}
	
	
	
	public static void main(String[] args) {
		Greeter g = new Greeter ();
		hellogreeting h = new hellogreeting ();
		hello2greeting h2 = new hello2greeting ();
		g.Greet(h2);

		
		
		MyLamdba myLambdaF = () -> System.out.print("dsfdsfdsf");
		MyADD addF = (int a, int b) -> a + b;
          
          
	}

}
// we need signature of interface to add before lambda var name
interface MyLamdba {
	void foo();
	
}

interface MyADD {
	int foo(int x, int y);
	
}
