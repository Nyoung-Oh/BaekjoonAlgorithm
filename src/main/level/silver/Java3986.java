package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java3986 {

	// 실버 4. 3986번 좋은 단어

	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		count = 0;
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			good(s);
		}
		System.out.println(count);
	}

	static void good(String s) {
		if (s.length() % 2 == 1)
			return;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (stack.size() > 0 && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty())
			count++;
	}
}