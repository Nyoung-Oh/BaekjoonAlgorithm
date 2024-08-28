package bronze;

import java.util.Scanner;

public class Java12605 {

	// 브론즈 2. 12605번 단어 순서 뒤집기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < N; i++) {
			String [] arr = sc.nextLine().split(" ");
			System.out.print("Case #" + (i+1) + ": ");
			for(int j = arr.length-1; j >= 0; j--) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
