import java.util.Scanner;
@FunctionalInterface
interface MySum{
	public int add(int x, int y);

}
public class Exam_06 {
	
	static int myfunc(int x, int y) {
		int count = 0;
		int cnt = 0;
		for(int i=x; i<=y; i++) 
		{
			for(int j=2; j<=i; j++)
			{
				if(i%j ==0) 
				{
					count++;
				}    
			}
			if(count==1)
			{
				cnt++;
			}
			count=0;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// 키보드로 x,y를 입력 받아서
		// x~y의 곱을 계산하는 프로그램 작성
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		MySum ms;
		ms=(x,y)->myfunc(x,y);
		System.out.println(ms.add(a, b));
	}
}

