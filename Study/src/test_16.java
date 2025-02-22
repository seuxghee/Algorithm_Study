// 연습 1-16
// n단의 숫자 피라미드를 출력하는 메서드를 작성하세요
import java.util.Scanner;

public class test_16 {

	static void npira(int n) {
			for (int i = 1; i <= n; i++) {					// i 행( i = 1, 2, ... , n )
				for (int j = 1; j <= n - i; j++)			// n - i 개의 ' ' 을 출력
					System.out.print(' ');
				for (int j = 1; j <= (i-1)*2+1; j++)	// (i - 1) * 2 + 1 개의 숫자 을 출력
					System.out.print(i%10);	//숫자
				System.out.println();									// 줄바꿈
			}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("피라미드를  출력합니다.");
		do {
			System.out.print("단수는：");
			n = sc.nextInt();
		} while (n <= 0);

		
		npira(n);	
	
	}

}
