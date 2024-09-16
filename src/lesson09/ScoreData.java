package lesson09;


// 설계도  , 내가 만든 자료형, 붕어빵틀
public class ScoreData {
	
		// 속성: 멤버변수 또는 필드(field)
		int score;
		String subject;
		int ranking;
		
		// 행위: 메소드
		// 내 필드에 있는 변수를 쓸 때는 this.을 붙여서 사용한다.
		void printInfo() {
			System.out.println("과목명:" + this.subject);
			System.out.println("점수:" + this.score);
			System.out.println("등수:" + this.ranking);
		}
	
}
