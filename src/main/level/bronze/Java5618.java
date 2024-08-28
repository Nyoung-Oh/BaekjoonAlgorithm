package bronze;

import java.util.Scanner;

public class Java5618 {

	// 브론즈 1. 5618번 공약수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 2) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int i = 1; i <= Math.min(a, b); i++) {
				if (a % i == 0 && b % i == 0) {
					System.out.println(i);
				}
			}
		} else {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			for (int i = 1; i <= Math.min(Math.min(a, b), c); i++) {
				if (a % i == 0 && b % i == 0 && c % i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}