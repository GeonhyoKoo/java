package lesson01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		
		// 입력하기
		// import 단축키 : command + shift + o
		Scanner scan = new Scanner(System.in);
		// 쓰겠다 선언하는 용도.
		
		System.out.print("how many candys");
		
		int candy = scan.nextInt(); // int 입력방법
		
		System.out.println("문자열과 숫자를 이을 땐" + candy + "이렇게 하면 되겠지요.");
		
		
	}

}
