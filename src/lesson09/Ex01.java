package lesson09;

public class Ex01 {

	
	// 나의 의식
	public static void main(String[] args) {

		// 객체로 만든다. 인스턴스 화 한다. sd1: object, ScoreData의 instance
		// 객체(object)로 만든다.
		// ScoreData 의 instance다. instance화 한다.
		// 기본 자료형 (Primitive type) : int char boolean 등등
		// 참조 자료형 (Reference type) : 배열 , String , ScoreInfo 등등 
		
		ScoreData sd1 = new ScoreData();
		
		// 필드에 값 넣기
		sd1.subject = "국어";
		sd1.score = 85;
		sd1.ranking = 7;
		
		// 필드 값 출력하기
		System.out.println(sd1.subject);
		System.out.println(sd1.score);
		System.out.println(sd1.ranking);
		
		sd1.printInfo();
		
	}

}
