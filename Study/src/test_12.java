// 연습 1- 12
// 덧셈을 출력하는 프로그램 작성
public class test_12 {

	public static void main(String[] args) {
		System.out.println("----- 덧셈표 -----");
		
		System.out.print("   |");
		for (int i= 1; i <=9; i++) 
			System.out.printf("%3d", i);
		System.out.println("\n---+-------------");
		
		for (int i =1; i <=9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j); // 덧셈 출력하는 부분
			System.out.println();
				
			
	}
		
		
	}

}
