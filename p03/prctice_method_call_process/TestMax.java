package p03.prctice_method_call_process;

// 1. JVM이 method 실행 방식 : activation record를 메모리 stack 영역에 할당하는 방식
// 2. method 호출순서 
//		- JVM main()method 호출 => max method 호출
//		- => max method	호출
// 3. main method에서 max method를 호출할 때 actual parameter로 선언된 변수의 값이
//	  max method의 formal parameter로 선언 된 변수로 복사(copy_ => call by value라고 함
// 4. call by value의 정의
//		- method의 formal parameter를 호출(call)할 때 formal parameter의 변수로 값이 전달
//		*참고) call by reference 의 정의 : method의 formal parameter를 호출(call)할 때 formal parameter의 변수로 주소가 전달
public class TestMax {

	public static void main(String[] args) {
		int i = 5;
		int j = 12;
		int k = max(i,j);
		
		System.out.println(i+ "와 " + j + "중 최대값 : " + k);
	}

	
	// 2개 숫자 중에 최대값 구하기
	public static int max(int num1, int num2) {
		int result;
		
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		return result;
	}
}
