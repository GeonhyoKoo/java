package lesson02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 조건문(if문) 과 비교 연산자 사용하기
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("몸무게를 입력하세요:");		
//		int weight = scan.nextInt();
//		
//		// 만약에 몸무게가 75kg 미만이면 "커피"
//		if (weight < 75) {
//			System.out.println("커피 먹자!");
//		}
//		
//		// 만약에 몸무게가 100kg 이상이면 "다이어트 시작"
//		if (weight >= 100) {
//			System.out.println("다이어트 시작");
//		} 
//		
//		// 만약에 몸무게가 68kg이면 "68kg군요"
//		if (weight == 68) {
//			System.out.println("68kg군요");
//		}
//		
//		// 만약에 75kg이 아니면 "75kg가 아니군요"
//		if (weight != 75) {
//			System.out.println("75kg가 아니군요");
//		}
		
		
		// 두 개의 수를 입력받고 비교
		System.out.print("두 개의 수를 입력하세요:"); // 5 9
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		if (number1 > number2) {
			System.out.println("number1이 더 크다.");
		}
		
		if (number1 < number2) {
			System.out.println("number1이 작다.");
		}
		
		if (number1 == number2) {
			System.out.println("두 값은 같다.");
		}
		
		if (number1 != number2) {
			System.out.println("두 값은 다르다");
		}
		
		
		
	}

}
