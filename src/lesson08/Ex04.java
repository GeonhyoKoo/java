package lesson08;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 단어
		String word = scan.next();
		System.out.println(word);
		
		// next()가 엔터를 남겨두므로 불필요한 엔터를 소비 시킨다.
		// nextLine을 쓰기 전에 next() or nextInt()를 쓰면 필요한 코드
		scan.nextLine();
		
		// 문장 (스페이스가 포함)
		String text = scan.nextLine();
		System.out.println(text);
			
		
		
		
	}

}
