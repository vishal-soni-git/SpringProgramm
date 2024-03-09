package in.vs.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> phones;
	
	private Map<String,String> course;
	private Set<Address> address;

	public Student(String name, List<String> phones, Map<String, String> course,Set<Address> address) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Phone No : "+phones);
		System.out.println("Course : "+course);
		System.out.println("address : "+address);
		
		
	}
	
	

}
