package bronze;

import java.util.Scanner;

public class Java11050 {

	// 브론즈 1. 11050 이항 계수 1

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		System.out.println(fact(N) / (fact(K) * fact(N - K)));
	}

	static int fact(int num) {

		int result = 1;

		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
