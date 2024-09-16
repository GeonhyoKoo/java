package recursiveMethod;

public class Fibo {

	public static void main(String[] args) {

		
		int input = 8;
		
		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i) + " ");
		}
		
		
		
	}
	
	
	public static int fibo(int n ) {
		
		if (n <= 1) {
			return n;
		} else {
			// 재귀호출
			return fibo(n - 2) + fibo(n - 1);
		}
		
		
		
	}

}
