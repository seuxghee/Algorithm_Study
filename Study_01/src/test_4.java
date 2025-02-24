// 연습 2-4
// 배열의 모든 요소를 배열 a에 복사하는 프로그램 작성

import java.util.Scanner;

class test_4 {

	//--- 배열 b의 모든 요소를 배열 a에 copy  ---//
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;	//삼항 연산자(?:)를 사용하여, a.length가 b.length보다 작거나 같으면 a.length를, 그렇지 않으면 b.length를 선택합니다.
		for (int i = 0; i < num; i++)
			a[i] = b[i];	// b[i]를 a[i]에 저장
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a의 요솟수는  : ");
		int numa = sc.nextInt();		// 요솟수
		int[] a = new int[numa];			// 요솟수가 numa인 배열 
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		System.out.print("b의 요솟수는  : ");
		int numb = sc.nextInt();		// 요솟수
		int[] b = new int[numb];			// 요솟수가 numb인 배열 
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}

		copy(a, b);			// 배열 b의 모든 요소를 배열 a에 copy 

		System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
