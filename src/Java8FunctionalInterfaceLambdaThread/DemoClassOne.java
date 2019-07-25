package Java8FunctionalInterfaceLambdaThread;

public class DemoClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{
			for(int i=0;i<10;i++)
			System.out.println("In Thread method");
		};
		Thread t = new Thread(r);
		t.start();

		System.out.println("In Main Thread");

	}

}
