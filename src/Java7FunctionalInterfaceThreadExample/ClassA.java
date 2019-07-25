package Java7FunctionalInterfaceThreadExample;

public class ClassA implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter in child thread");
		}

	}
}
