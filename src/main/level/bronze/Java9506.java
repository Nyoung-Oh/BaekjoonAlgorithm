package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Java9506 {

	// 브론즈 1. 9506번 약수들의 합
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (sc.hasNextInt()) {

			int n = sc.nextInt();

			if (n == -1) {
				
				break;
				
				
				
			} else {

				ArrayList arr = new ArrayList<>();
				int sum = 0;
				for (int i = 1; i < n; i++) {
					if (n % i == 0) {
						sum += i;
						arr.add(i);
					}
				}
				if (sum == n) {
					System.out.print(n + " = 1");
					for (int i = 1; i < arr.size(); i++) {
						System.out.print(" + " + arr.get(i));
					}
					System.out.println();
				} else {
					System.out.println(n + " is NOT perfect.");
				}
			}
		}
	}
}
