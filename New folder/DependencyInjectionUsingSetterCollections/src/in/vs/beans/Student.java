package in.vs.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> phones;
	
	private Map<String,String> course;
	private Set<Address> address;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Phone No : "+phones);
		System.out.println("Course : "+course);
		System.out.println("address : "+address);
		
		
	}
	
	

}
