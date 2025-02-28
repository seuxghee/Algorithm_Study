// 연습 2-7
// 시력 분포를 그래프로 출력하도록 수정하여 프로그램 작성

import java.util.Scanner;

public class test_7 {

	static final int VMAX = 21; // 시력 분포(0.0~0.1 단위로 21개)
	
	static class PhyscData {
		String name; 	//이름
		double vision;  //시력

		PhyscData(String name,double vision){
			this.name = name;
			this.vision = vision;
			
		}
	}
	
	//시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for(i =0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("강민하", 0.3),
				new PhyscData("김찬우", 0.7),
				new PhyscData("박준서", 2.0),
				new PhyscData("유서범", 2.0),
				new PhyscData("이수연", 0.4),
				new PhyscData("장경오", 1.2),
				new PhyscData("황지안", 0.8),
				
		};
		int[] vdist = new int[VMAX];	//시력분포
		
		distVision(x, vdist);
		
		//시력 분포를 구함
		System.out.println("\n시력의 분포");
		for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : ", i / 10.0);
			for (int j = 0; j < vdist[i]; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
