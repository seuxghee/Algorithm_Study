import java.util.Scanner;

public class test_6 {
	
	static int cardConv(int x, int r, char[] d) {
		int n = ((Integer)x).toString().length();
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		do {
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n),
												r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    ... %%d\n", n),
												x / r, x % r);
			d[digits++] = dchar.charAt(x % r);   // r 로 나눈 나머지를 저장
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits/ 2; i++) {   // d[0] ~ d[digits-1]
			char temp = d[i];                  // 을 역순으로 정렬
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		
			do {
				System.out.print("변환하는 음이 아닌 정수:");
				no = sc.nextInt();
			}while (no < 0);
		
		
		do {
			System.out.print("어떤 진수로 변환할까요? (2~36):");
			cd = sc.nextInt();
		}while (cd < 2 || cd > 36);
		
		
		dno = cardConv(no, cd, cno);
		
		System.out.print(cd + "진수로 ");
		for (int i = 0; i < dno; i++)
			System.out.print(cno[i]);
		System.out.println("입니다.");
		

	}

}
