// 연습 1-14

import java.util.Scanner;

public class test_14 {
	
	static void triangleLB(int n) {
		// 왼쪽 아래가 직각인 이등변삼각형을 출력
		for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
			for (int j = 1; j <= i; j++)            // i 개의 '*'을  출력
				System.out.print('*');
			System.out.println();                  // 줄바꿈
		}
	}
	static void triangleLU(int n) {
		// 왼쪽 위가 직각인 이등변삼각형을 출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		//오른쪽 위가 직각인 이등변삼각형을 출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)         // i - 1 개의 ' '을  출력
				System.out.print(' ');
			for (int j = 1; j <= n-i+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleRB (int n) {
		//오른쪽 아래가 직각인 이등변삼각형을 출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++)         // i - 1 개의 ' '을  출력
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("삼각형을  출력합니다.");
		do {
			System.out.print("단수는：");
			n = sc.nextInt();
		} while (n <= 0);

		System.out.println("왼쪽 아래 직각삼각형");
		triangleLB(n);			

		System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력");
		triangleLU(n); 	
		
		System.out.println("오른쪽 위가 직각인 이등변삼각형을 출력");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력");
		triangleRB(n);
	}

}
