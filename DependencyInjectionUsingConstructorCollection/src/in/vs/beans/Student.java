package in.vs.beans;

import java.util.*;

public class Student {

	private String name;
	private List<String> phones;
	private Map<String,String> course;
	private Set<Address> address;

	public Student(String name, List<String> phones, Map<String, String> course, Set<Address> address) {
		super();
		this.name = name;
		this.phones = phones;
		this.course = course;
		this.address = address;
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Phone No : "+phones);
		System.out.println("Courses : "+course);
		System.out.println("Address : "+address);
	}
	

}
