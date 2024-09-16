package lesson03;

public class Ex01 {

	public static void main(String[] args) {

		// 안녕 3번 쓰기
		
		// 1. 노가다
		
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");

		
		// 2. while문
		
		int i = 0;
		while (i < 3) { 
			System.out.println("안녕 " + i);
			i++; 
		}
		// i = i + 1;
		// i += 1; -> 복합 대입 연산자를 활용하면 위와 동일
		// ++i  -> 증감 연산자(전위)
		// 위에 세개는 같은 값을 보인다.
		
		// i++; -> 증감 연산자(후위) 다음 줄에서 +1이 된다.
		
		// ++i , i++ 차이점
		int number = 5;
		System.out.println("number:" + number); // 결과 : 5
		System.out.println("++number:" + (++number)); // 결과 : 6
		System.out.println("number++:" + (number++)); // 결과 : 6
		System.out.println("number:" + number); // 결과 : 7
		
	}

}
