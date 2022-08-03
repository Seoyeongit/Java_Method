package p02.practice_basic;

// prime number : 소수 (1과 자기자신의 숫자로만 나누어 지는 수)
// - 2, 3, 5, 7, 11, 13, 17, 19, 23 ...


public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("가장 작은 소수부터 20개의 소수 : ");
		printPrimeNumbers(20);
	}
	
	// return값이 없는 경우 : void 사용 ( void : 빈, 공허한... )
	public static void printPrimeNumbers(int numberOfPrimes) {
		int count = 0;
		int number = 2;		// 특정 숫자가 소수인지 판단하기 위한 시작 숫자
		
		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
				System.out.println(count + "번째 소수 : " + number);
			}
			number++;
		}

		
	}
	public static boolean isPrime(int number) {
		
		// 특정 숫자가 소수인지 판별하기 위해서는 2부터 시작하여 number / 2까지 for문을 수행하면서 나머지가 0인 수가 있는지 판단하면 됨
		for (int divisor=2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) {
				return false; // 결과는 똑같은데 속도떄문에 2로 나눔
			}
		}
		// 메소드 마지막 부분에 return 명령어 사용해야 함 (이유는 if문 안에 있는 return 명령어가 한 번도 실행하지 않을 수 있기 때문
		return true;
	}
}
