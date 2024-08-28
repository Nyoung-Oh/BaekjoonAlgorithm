package bronze;

import java.util.Scanner;

public class Java2609 {

	// 브론즈 1. 2609번 최대 공약수와 최소 공배수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 0; // 최대 공약수

		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				max = i;
			}
		}

		int min = (a * b) / max; // 최소 공배수

		System.out.println(max);
		System.out.println(min);
	}
}
