// 연습1-7
// 가우스 공식을 사용하여 1, 2, ..., n의 총합을 구합니다
import java.util.Scanner;

public class test_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 정수의 합을 수하세요");
		System.out.print("n의 값:");
		int n = sc.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);   // 총합 가우스의 덧셈 이용
		
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
	}

}
