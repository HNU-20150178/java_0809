import java.util.Scanner;

@FunctionalInterface
interface MaxScore{
	public int maxScore (int[] score);
}

public class Exam_07 {
	static int pT(int[] score) {//
		int biggest = score[1];
		for(int i =0; i<score.length;i++) {
			if(biggest < score[i]) {
				biggest = score[i];
			}
		}
		return biggest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 7개의 정수를 입력받아서 최대값을 찾아서 출력하는 프로그램 작성
		Scanner scn = new Scanner(System.in);
		int [] score = new int[7];
		
		for(int x = 0; x< score.length; x++) {
			score[x]=scn.nextInt();
		}
		
		
		
		
		
		MaxScore ms;
		ms=(scor)->pT(score);
		System.out.println(ms.maxScore(score));
		
			
			
		};
	}

