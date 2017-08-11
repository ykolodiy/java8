package pack1;

public class RunnabbeEx {

	public static void main(String[] args) {
	//java7
		Thread myT = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("printed in runnable");
			}
			});
		
		myT.run();
		//java8
		Thread myLambda = new Thread(()->System.out.println("printed lambdsin runnable"));
		myLambda.run();
	}

}
