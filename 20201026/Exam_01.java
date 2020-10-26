interface Test{
	public void method();
}
class testExam implements Test{
@Override
	public void method() {
		System.out.println("AAAA");
		Test t1 = new Test() {
			public void method() {
				System.out.println("AAAA");
			}
		};
		t1.method();
		
		Test t2 =()->System.out.print("BBBB");
		t2.method();
	}	
}
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
	}

}
