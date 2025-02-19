// 연습1-8
// 정수a, b를 포함하여 그 사이의 모든 정수의 총합을 구합니다
import java.util.Scanner;

public class test_8 {
	
	static int sumof(int a, int b) {
		int min;
		int max;
		//a와 b의 대소관계 상관없음.
		if (a<b) { 
			min = a; max = b;
		}else {
			min = b; max =a;
		}
		
		int sum = 0;
		
		for (int i = min; i<=max; i++)
			sum+=i;
			return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이에 있는 모든 정수의 총합을 구합니다.");
		System.out.print("a의 값 : ");  
		int a = sc.nextInt();
		System.out.print("b의 값 : ");  
		int b = sc.nextInt();

		System.out.println("정수 a, b 사이의 모든 정수의 총합은 " + sumof(a, b) + "입니다.");

	}

}
