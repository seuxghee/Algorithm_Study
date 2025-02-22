// 연습 1-11
// 구구단 곱셈표를 출력하는 프로그램을 작성하세요. (구분선은 수직선 (|), - + 기호 사용)
public class test_11 {

	public static void main(String[] args) {
		

		System.out.print("   |");
		for (int i = 1;i <= 9; i++)
			System.out.printf("%3d", i); //1부터 9까지 출력 (for 루프)
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)  //i는 세로축 (1~9) 숫자를 나타내고 j는 가로축 (1~9) 숫자를 나타냄
				System.out.printf("%3d", i * j); //i와 j를 곱한 값을 3칸 오른쪽 정렬하여 출력.
			System.out.println();
		}
	}

}
