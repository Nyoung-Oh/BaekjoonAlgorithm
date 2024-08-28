package bronze;

import java.util.Scanner;

public class Java1934 {

	// 브론즈 1. 1934번 최소 공배수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a * b / gcd(a, b));
		}

	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}