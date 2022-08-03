package p01.basic;

public class MethodBasic {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1과 10사이의 합 = " + sum);
		
		// 중간에 다른 코딩
		
		sum = 0;
		for (int i = 27; i <= 37; i++) {
			sum += i;
		}
		System.out.println("20과 27사이의 합 = " + sum);
		
		
		// 중간에 다른 코딩
		sum = 0;
		for (int i = 35; i <= 39; i++) {
			sum += i;
		}
		System.out.println("35와 49사이의 합 = " + sum);
	}

}


//  함수 (function) : c language 
// 	코딩 :  비슷한 내용의 반복적인 코딩이 많음
