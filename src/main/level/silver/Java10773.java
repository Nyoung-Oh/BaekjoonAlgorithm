package silver;

import java.util.Scanner;
import java.util.Stack;

public class Java10773 {

	// 실버 4. 10773번 제로

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		Stack<Integer> stack = new Stack<Integer>();

		int sum = 0;

		for (int i = 0; i < K; i++) {
			int num = sc.nextInt();

			if (num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}
		for (int o : stack) {
			sum += o;
		}
		System.out.println(sum);
	}
}
