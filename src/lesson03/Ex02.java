package lesson03;

public class Ex02 {

	public static void main(String[] args) {

		
		// do - while문 : 조건이 거짓이여도 한번은 do가 실행된다.
		
		int i = 0; 
		do {
			System.out.println("딸기 " + i );
			i++;
		} while (i < -3); 


		
		// for (초기식; 조건; 증감식) {}
		for (int j = 0; j < 5; j++) {
			System.out.println("for문 " + j);
		}
		
		
		
	}

}
