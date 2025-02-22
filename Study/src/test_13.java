//1-13
//정사각형을 *로 출력하는 프로그램을 작성

import java.util.Scanner;

public class test_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정사각형을 출력합니다.");

		do {
			System.out.print("변의 길이 : ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n; j++) // 줄바꿈
				System.out.print('*');
			System.out.println();
		}
	}

}
