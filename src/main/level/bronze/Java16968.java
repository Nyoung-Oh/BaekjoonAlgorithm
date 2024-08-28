package bronze;

import java.util.Scanner;

public class Java16968 {

	// 브론즈 1. 16968번 차량 번호판1
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int combination = 1;
		
		for(int i = 0; i < s.length(); i++) {
			int cases = s.charAt(i) == 'c'? 26 : 10;
			if(i > 0 && s.charAt(i) == s.charAt(i-1)) {
				cases--;
			}
			combination *= cases;
		}
		System.out.println(combination);
		
	}
}
