package in.vs.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private List<String> phones;
	private Map<String,String> course;
	private Set<Address> address;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+phones);
		System.out.println("email : "+course);
		System.out.println("Address : "+address);
	}
	

}
