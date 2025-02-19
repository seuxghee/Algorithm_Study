// 연습1-5
// 세 정숫값의 중앙값을 구하여 출력(다른 풀이)

public class test_5 {
	//a, b, c의 중앙값을 구하여 반환
	static int med3(int a, int b, int c) {
		if((b >= a && c <= a)||(b <= a && c >=a))
			return a;
		else if ((a > b && c < b)||(a<b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a

	}

}
// 이 코드보다 test_4의 med3 메서드가 더 효율적임.
// 비교연산이 더 적고 빠르게 종료되기 때문에 더 효율적임.