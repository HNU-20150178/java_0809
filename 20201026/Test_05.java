@FunctionalInterface
interface MyFunc3{
	public int exam(int x, int y);
}

public class Test_05 {
	public static void main(String[] args) {
		MyFunc3 myf3;
		myf3=(x,y)->{
			return x+y;
		};
		System.out.println(myf3.exam(10, 30));
		
		myf3=(x,y)->x+y; // 리턴은 생략가능
		System.out.println(myf3.exam(30, 40));
		
		myf3=(a,b)->a+b;
		System.out.println(myf3.exam(5, 4));
	}
	static int sum(int x,int y) {
		return x+y;
	}
}
