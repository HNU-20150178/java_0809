package example04;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String phone;
	private int age;
	
	Person(String name, String phone, int age){
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+phone+"\t"+age;
	}
	
	
	
}
