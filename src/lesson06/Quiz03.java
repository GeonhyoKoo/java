package lesson06;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		// 1 위치 변경 (swap)
		// 두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
		
		int[] numbers = {3, 5, 2, 10, 39};
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
		// 2 배열 순서 변경
		// 1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
		Random rand = new Random();
		int[] arrs = {1,2,3,4,5,6,7,8,9,10};
		
		int tar = 0;
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10);
			tar = arrs[0];
			arrs[0] = arrs[randIndex];
			arrs[randIndex] = tar;
		}
		
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
	}

}
