//연습 1-9
//두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class test_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		//b의 값이 a값 이하면 변수 b값을 다시 입력
		int b;
		do {
			System.out.print("b의 값: ");
			b = sc.nextInt();
		} while (b <= a);
		
		
		System.out.println("두 수의 차는"+(b-a)+"입니다.");
		

	}

}
