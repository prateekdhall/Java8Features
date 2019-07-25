package Java7FunctionalInterfaceThreadExample;

public class DemoClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new ClassA();
		Thread t = new Thread(r);
		t.start();

		System.out.println("In Main Thread");

	}

}
