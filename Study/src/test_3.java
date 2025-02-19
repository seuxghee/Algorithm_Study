// 연습1-3
// 네 값의 최솟값을 구하여 출력
import java.util.Scanner;

class test_3 {

	//--- a, b, c, d의 최솟값을 구하여 반환 ---//
	static int min4(int a, int b, int c, int d) {
		int min = a;						// 최솟값
		if (b < min) 
		min = b;
		if (c < min) 
		min = c;
		if (d < min) 
		min = d;

		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;

		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 : ");  
		a = sc.nextInt();
		System.out.print("b의 값 : ");  
		b = sc.nextInt();
		System.out.print("c의 값 : ");  
		c = sc.nextInt();
		System.out.print("d의 값 : ");  
		d = sc.nextInt();

		int min = min4(a, b, c, d);		// a, b, c, d의 최솟값

		System.out.println("최솟값은 " + min + "입니다.");
	}
}
