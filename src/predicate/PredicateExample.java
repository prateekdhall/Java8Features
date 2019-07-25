package predicate;

import java.util.function.Predicate;

public class PredicateExample {

	
	private static boolean idM() {
		Predicate<Integer> object = inputValue -> inputValue>100;
		return object.test(120);
	}
	
	public static void main(String args[])
	{
		System.out.println(PredicateExample.idM());
	}
	
}
