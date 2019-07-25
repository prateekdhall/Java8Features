
public class LambdaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface1 interface1= (a,b)->{
			int maxNUmber = Math.max(5, 6);
			System.out.println("MAx number::"+maxNUmber);
		};
		interface1.method5("5","6");
	}

}
