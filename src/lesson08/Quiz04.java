package lesson08;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		// 1. jpg 파일 개수
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int count = 0;
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i];
			if (fileName.endsWith("jpg")) {
				count++;
			}
		}
		System.out.println("jpg의 파일 개수:"  + count);
		
		// 2. 
//		1. 승리을 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook

		// 배열 사용
		String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
		String[] answerWord = {"victory", "love", "computer", "notebook"};
		int score = 0;
		for (int i = 0; i < quizWord.length; i++) {
			System.out.print(quizWord[i] + "를 영어로 입력하세요:");
			String answer = scan.next();
			if (answer.equals(answerWord[i])) {
				score += 25;
			}
		}
		System.out.println("점수:" + score);
		
		// 3. 동명이인 종류 수

		// 3-1. 마킹하기
//		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		String[] names = memberStr.split(":");
//		int resultCount = 0;
//		
//		for (int i = 0; i < names.length - 1; i++) {
//			String name = names[i];   // 검사할 기준 이름
//			boolean isSame = false;
//			
//			if (name.equals("")) { // 동명이인으로 체크되서 빈칸인 경우 skip
//				continue;
//			}
//			
//			for (int j = i + 1; j < names.length; j++) {
//				if (name.equals(names[j])) {
//					isSame = true;
//					names[j] = "";
//				}
//			}
//			
//			if (isSame) {
//				resultCount++;
//			}
//		}
//		
//		System.out.println("동명이인 종류 수 :" + resultCount);


		// 3-2. 심플하게
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] memberArr = memberStr.split(":");
		int resultCount = 0;
		
		for (int i = 0; i < memberArr.length - 1 ; i++) {
			int sameCount = 0;
			for (int j = i + 1; j < memberArr.length; j++) {
				if (memberArr[i].equals(memberArr[j])) {
					sameCount++;
				}
			}
			// 맨 뒤의 동명이인만 최종적으로 카운팅한다.
			if (sameCount == 1) { 
				resultCount++;
			}
		}
		System.out.println(resultCount);

		
		
	}

}
