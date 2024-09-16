package lesson01;

public class Ex03 {

	public static void main(String[] args) {

		// 자료형(Data type) 변환  -> casting
		
		double pi = 3.54;
		int intPi = (int)pi; // double -> int : 소수점 뒷자리 버림
		
		System.out.println(intPi);
		System.out.println((double)intPi); // 현재 int -> double : .0이 붙는다.
		
		int number = 7;
		double result =  number / 2;  // 예상값 : 3.5  결과 : 3.0  int / int  = int 가 되어서 이렇게 되어버림.
		System.out.println(result);

		// 1 ) 둘 중 하나를 double 로 캐스팅
		
		result = (double)number / 2;
		System.out.println(result);

		// 2) 나눌 때 소수로 나눈다.
		
		result = number / 2.0;
		System.out.println(result);
		
		
		// 반올림 하는법
		// Math 클래스
		// Math.round(소수) -> 3.14 -> 3      4.8 -> 5  무조건 소수점 첫째에서 반올림 처리
		
		pi = 3.141592653;
		System.out.println(Math.round(pi));
		
		// 둘때 자리까지 반올림
		// 1. pi 에 100을 곱해서 314.1592653으로 만든다.
		// 2. 그 숫자를 Math.round 적용 -> 314
		// 3. 3.14로 만들기 위해 100.0을 나눈다.
		
		System.out.println( Math.round(pi *100) / 100.0 );
	}

}
