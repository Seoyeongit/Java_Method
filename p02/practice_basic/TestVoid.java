package p02.practice_basic;

// return type이 void인 메소드 사용 사례
//  - 정보 출력용으로 사용 (검사 결과 출력 )
public class TestVoid {

	public static void main(String[] args) {
		System.out.print("78.5의 등급 : ");
		printGrade(78.5);
		
		System.out.print("59.5의 등급 : ");
		printGrade(59.5);
	}
	
	public static void printGrade(double score) {
		if (score > 90) {
			System.out.println("A등급 입니다.");
		} else if (score > 80) {
			System.out.println("B등급 입니다.");
		} else if (score > 70) {
			System.out.println("C등급 입니다.");
		} else if (score > 60) {
			System.out.println("D등급 입니다.");
		} else {
			System.out.println("F등급 입니다.");
		}
	}
}
