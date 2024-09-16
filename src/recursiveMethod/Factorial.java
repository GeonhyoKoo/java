package recursiveMethod;

public class Factorial {

	public static void main(String[] args) {

		int input = 4;
		
		System.out.println(fact(input));
		
	}
	
	// factorial method
	public static int fact(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fact(n - 1) * n; //fact(3) * 4
	}

}
