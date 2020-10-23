@FunctionalInterface
interface MyFunc2{
	public void test(int x);
}
@FunctionalInterface
interface MyFun2{
	public void test(String a);
}

public class Exam_04 {

	public static void main(String[] args) {
		MyFunc2 f2;
		f2=(x)->{
			int r = x*x;
			System.out.println(r);
		};
		f2.test(5);
		MyFun2 myf2;
		myf2=(String a)->{
			String b = a+a;
			System.out.println(b);
		};
		myf2.test("드래곤볼");
		
	}

}
