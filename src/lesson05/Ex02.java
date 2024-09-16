package lesson05;

public class Ex02 {

	public static void main(String[] args) {

		// method를 사용하는 곳
		
		int x = 30;
		int y = 50;
		
		int result = sum(x, y); // 전달 인자값 , 인수 , Argument -> x , y
		System.out.println(result);
		System.out.println(sum(x, y)); 
		// 함수 사용 : 함수를 부른다. 호출한다. call
		
		printHelloWorld(); // void 타입은 결과 값이 없으니 받을 수 없음. 부르기만 한다.
		
		
		
	}
	
		// method 만드는 곳
	
		// static(정적) : 주소값이 고정되어 있음.
		// static 메소드인 main 이 부르는 대상도 메모리에 올라와 있어야 하기 때문
		public static int sum(int a, int b) { // 매개변수 , Parameter
			System.out.println("sum 메소드 시작");
			return a+b;
		}
		
		// input : x  output : x  기능 : 출력
		public static void printHelloWorld() {
			System.out.println("Hello world!");
			return; // 생략 가능 . 메소드 종료
		}
	
	
	
	
	

}
