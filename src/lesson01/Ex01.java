package lesson01;

public class Ex01 {

	public static void main(String[] args) {

		
		// 정수형 변수(Integer)
		
		int number = 10; 
		// 저장한다. 할당한다. 대입한다. = 대입연산자라고 부름. 처음 입력시 넣을 땐 초기화. assign
		
		System.out.println(number);
		
		number = 5; // 변수이므로 값 변경 가능. 재사용 시 자료형 쓰지 않는다.
		
		System.out.println(number);
		
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		

		// 소수 변수 (Float) -> 권장 안함 (오차가 있을 수 있다.)
		
		float f = 1.55555555f;

		System.out.println(f);
		
		// double 사용 권장
		double d = 1.555555555;
		
		System.out.println(d * number2);

		// 문자 변수 (Character) : 문자 한개 . 작은 따옴표
		
		char c  = 'z';
		System.out.println(c);

		// boolean 변수 : 참 (true) or 거짓 (false)
		
		boolean isReal = true;
		boolean isFalse = false;
		
		System.out.println("참:" + isReal);
		System.out.println("거짓이다" + isFalse );
		
		
	}

}
