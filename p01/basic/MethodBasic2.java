package p01.basic;

// sum method 구현
// 1. method 선언 
//		- 프로그램에서 여러번 반복 사용되는 특정 코드 덩어리를 별도의 method로 정의
// 2. method 사용
// 		- 선언된 method 이름을 통해 method를 사용
// 3. method 사용 효과
// 		- 전체 소스코드 양을 대폭 줄일 수 있고, 프로그램 내에서 중복되는 코드 덩어리 제거 가능
//		- 중복되는 코드 덩어리를 수정 할 경우, 메소드 내부에서만 수정하면 되어서 전체 코딩 속도 향상가능
// 4. 회원 가입 여부 check, 쇼핑몰 상품 가격이 1000원 이상인 경우, 상품가격 입력 시 상품 가격 체크 등 ..
public class MethodBasic2 {

	public static void main(String[] args) {

		// 1, 10 => actual parameter list (arguments)
		// sum(1, 10)을 기계어로 처리되는 명령어 리스트
		//  1. 등록된 method list에서 sum이라는 이름을 가진 method signature를 이용하여 찾음
		//  2. 찾은 sum method를 호출하고, method의 formal parameter인 startValue	 변수의 메모리 방에 1의 값을 넣고
		//	 	endValue 변수의 메모리 방에 10의 값을 넣음
		//  3. result라는 변수에 대하여 메모리 방을 잡고 method body의 명령어 실행
		//  4. 최종 결과값을 갖고 있는 result 변수의 값을 sum method를 호출한 곳으로 넘겨줌
		// 		- 최종 결과값을 넘겨 주기 전에 method의 내부 변수인 startValue, endValue, result변수의 메모리 방은 삭제
		System.out.println("1과 10사이의 합 : " + sum(1,10));
		System.out.println("27과 37사이의 합 : " + sum(27,37));
		System.out.println("35과 49사이의 합 : " + sum(35,49));
	}
	
	// 이름이 sum인 method 선언 
	// method signature : sum(int startValue, int endValue)
	// formal parameter list : int startValue, int endValue)
	
	public static int sum(int startValue, int endValue) { // startValue, endValue = 변수
		int result = 0;
		
		for (int i = startValue; i <= endValue; i++) {
			result += i;
		}
		
		return result;
	}
}
