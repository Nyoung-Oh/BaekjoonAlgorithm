package bronze;

import java.util.Scanner;

public class Java7489 {

	// 브론즈 2. 7489번 팩토리얼

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		long fact = 1;

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			for (int j = n; j >= 1; j--) {
				fact *= j;
			}
			if(fact % 10 == 0) {
				System.out.println(fact % 10);
			} else {
				System.out.println(fact % 10 / 100);
			}
		}
	}
}