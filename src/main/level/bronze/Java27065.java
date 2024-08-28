package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Java27065 {

	// 브론즈 1. 27065번 2022년이 아름다웠던 이유

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < T; i++) {

			int n = sc.nextInt();

			// 입력 받은 값의 약수 구하기, 약수 리스트 추가
			for (int j = 1; j < n; j++) {
				if (n % j == 0) {
					sum1 += j;
					arr.add(i);
				}
			}
				// 약수들의 완전수, 과잉수, 부족수 여부 판단
			
			  
				for (int k = 0; k < arr.size(); k++) {
					for (int l = 1; l < arr.get(k); l++) {
						if (arr.get(k) % l == 0) {
							sum2 += l;
						}
					}
					
				}
				
			if (sum1 > n && sum2 <= n) {
				System.out.println("Good Bye");
			} else {
				System.out.println("BOJ 2022");
			}
		}
	}
}