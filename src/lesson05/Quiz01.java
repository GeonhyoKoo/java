package lesson05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 1  2의 제곱 함수
		// 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고 호출한 값을 출력하세요.
		int n = scan.nextInt();
		int tar = getSquared(n);
		System.out.println(n + "의 제곱은" + tar);
		
		
		// 2 평균 구하기 함수
		// 4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
		int a,b,c,d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		System.out.println(getAverage(a,b,c,d));
		
		
		// 3 몫과 나머지 출력 함수
		// 두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
		int num = scan.nextInt();
		int tarnum = scan.nextInt();
		printQuotientRemainder(num , tarnum);
		
		
		// 4 홀짝 함수
		// 정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
		int number = scan.nextInt();
		System.out.println(isEven(number));
		
	}
	
	
	// 1 
	public static int getSquared(int n) {
		return (n * n);
	}
	
	
	// 2
	public static double getAverage(int a, int b, int c, int d) {
		return((a * b * c * d) / 4.0);
	}
	
	
	//3
	public static void printQuotientRemainder(int a ,int b) {
		int quotient = a / b;
		int remainder = a % b;
		System.out.println(quotient);
		System.out.println(remainder);
	}
	
	//4 삼항 연산자 또는 삼항 조건문
	// 삼항 연산자 : a , b , c  세 개의 피연산자가 들어가며
	// 조건 a 가 ture 이면 b, false 이면 c 여서 ? 로 줄여서 표현함.
	public static boolean isEven(int n) {
		return n % 2 == 0 ? true : false;
	}
	
	// 4번의 경우 더 줄일 수 있음.
	// public static boolean isEven(int n) {
	//	return n % 2 == 0;
	//	}
	
	
	
}
