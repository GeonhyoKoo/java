package lesson02;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		
		int month = scan.nextInt();
		
		
		// 1.노가다 방법
		
//		switch (month) {
//		
//		case 1 : 
//			System.out.println("겨울");
//			break;
//		case 2 : 
//			System.out.println("겨울");
//			break;
//		case 12 : 
//			System.out.println("겨울");
//			break;
//		
//		case 3 : 
//			System.out.println("봄");
//			break;
//		case 4 : 
//			System.out.println("봄");
//			break;
//		case 5 : 
//			System.out.println("봄");
//			break;
//
//		case 6 : 
//			System.out.println("여름");
//			break;
//		case 7 : 
//			System.out.println("여름");
//			break;
//		case 8 : 
//			System.out.println("여름");
//			break;
//			
//		case 9 : 
//			System.out.println("가을");
//			break;
//		case 10 : 
//			System.out.println("가을");
//			break;
//		case 11 : 
//			System.out.println("가을");
//			break;
//		}
//		
		
		// java 14 ver. 부터 가능함.
		
//		switch (month) {
//		
//		case 1, 12, 2 :
//			System.out.println("겨울");
//			break;
//		
//		case 3, 4 ,5 :
//			System.out.println("봄");
//			break;
//		
//		case 6, 7, 8 :
//			System.out.println("여름");
//			break;
//			
//		case 9, 10, 11 :
//			System.out.println("가을");
//			break;
//		default :
//			System.out.println("월을 잘못 입력했습니다.");
//		
//		}
		
		
		// 2. java 모든 버전에서 가능하기 때문에 이를 추천함
		// 폴 스루를 이용해서 흐르게 만들고 필요한 곳에서 break
		
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//		case 9:
		
		
		// 3. 개선된 switch 문 - java 14 ver 이후 부터만 사용가능
		switch (month) {
		case 3,4,5 -> System.out.println("봄");
		case 6,7,8 -> System.out.println("여름");
		case 9,10,11 -> System.out.println("가을");
		case 12,1,2 -> System.out.println("겨울");
		}
		
		
		
	}

}
