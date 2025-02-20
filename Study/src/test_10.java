//연습 1-10
//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class test_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("n의 값: ");
		    n = sc.nextInt();
		} while(n<=0);
		

		int no = 0;         // 자릿수 초기화
		while (n > 0) {
			n /= 10;         // n을 10으로 나눕니다
			no++;			 // 자릿수 증가
		}

		System.out.println("그 수는 " + no + "자리입니다.");
		
		

	}

}
