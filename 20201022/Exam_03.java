class Person<T,M>{
	private T kind;
	M model;
	
	public T getkind() {
		return kind;
	}
	public M getmodel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setmodel(M model) {
		this.model = model;
	}
}
class Tv{
	
}
class Car{
	
}

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<Tv, String> p = new Person<Tv, String>();
		p.setKind(new Tv());
		p.setmodel("드래곤볼");
		
		System.out.println(p.getkind()+" "+p.getClass());
		Person<Car, Tv>p2 = new Person<Car, Tv>();
		
		System.out.println(p.getkind()+" "+p.getClass());
	}

}
