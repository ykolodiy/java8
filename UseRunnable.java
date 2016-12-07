package runnable;

public class UseRunnable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Runnable r1 = () -> System.out.println("thread1");
		Runnable r2 = () -> System.out.println("thread2");
		new Thread(r1).start();
		Thread.sleep(1000);
		new Thread(r2).start();
		new Thread(r1).start();
		
	}

}
