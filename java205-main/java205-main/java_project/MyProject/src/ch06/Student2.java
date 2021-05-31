package ch06;

public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] korScore = new int[10];
		int[] engScore = new int[10];
		int[] mathScore = new int[10];
		
		korScore[0] = 50;
		korScore[1] = 90;
		korScore[2] = 80;
		korScore[3] = 70;
		korScore[4] = 70;
		korScore[5] = 80;
		korScore[6] = 90;
		korScore[7] = 100;
		korScore[8] = 60;
		korScore[9] = 80;
		
		System.out.println();
		
		int sum = 0;
		for(int i =0; i < korScore.length ;i++) {
			sum = sum + korScore[i];
		}
		System.out.println("국어 점수의 합 : " + sum);
		
		float avg = (float)sum/korScore.length;
		System.out.println("국어 점수의 평균 : " + avg);
		
	}

}
