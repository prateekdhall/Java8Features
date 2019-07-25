package predicate.predicatejoining;

import java.util.function.Predicate;

public class JoinPredicateExample {

	// Numbers greater than 10
	// Even NUmbers
	// Number not greater than 10
	// Number greater than 10 and Even
	// Numbers greate than 10 or Even

	public static void main(String args[]) {
		int[] intarray = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> obj = val -> val > 10;
		Predicate<Integer> obj2 = val -> val % 2 == 0;
		// numbersGreaterThan10(intarray,obj);
		// numbersisEven(intarray,obj2);
		numbersisEvenAndGreaterThan10(intarray, obj, obj2);
	}

	// Numbers greater than 10
	private static void numbersGreaterThan10(int[] intarray, Predicate<Integer> p) {
		for (Integer v : intarray) {
			System.out.println(v + " is greater than 10==" + p.test(v));
		}
	}

	// Numbers is Even
	private static void numbersisEven(int[] intarray, Predicate<Integer> p) {
		for (Integer v : intarray) {
			System.out.println(v + " is Even==" + p.test(v));
		}
	}

	// Numbers is Even
	private static void numbersisEvenAndGreaterThan10(int[] intarray, Predicate<Integer> p, Predicate<Integer> p1) {
		for (Integer v : intarray) {
			System.out.println(v + " is Even and greater than 10==" + p.and(p1).test(v));
		}
	}

}
