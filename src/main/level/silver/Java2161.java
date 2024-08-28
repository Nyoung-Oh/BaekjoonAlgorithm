package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java2161 {

	// 실버 5. 2161번 카드1

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Queue<Integer> que = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			que.add(i);
		}

		while (que.size() != 1) {
			int s = que.poll();
			System.out.print(s + " ");
			int qu = que.poll();
			que.add(qu);
		}
		System.out.print(que.poll());
	}
}