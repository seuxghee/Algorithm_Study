// 연습 2-3
// 배열 a의 모든 요소의 합계를 구하여 반환하는 프로그램 작성
import java.util.Arrays;
import java.util.Scanner;

public class test_3 {
	//합계 구하기
	static int sumOf(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++)
			sum += x[i];
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i +"]: ");
			x[i] = sc.nextInt();
		}
		System.out.println("모든 요소의 합계는 " + sumOf(x) + "입니다.");
	}

}
