package in.vs.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Vishal")
	private String name;
	@Value("058")
	private int rollNo;
	@Value("vso55089@gmail.com")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		System.out.println("Setting rollNo");
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		System.out.println("Setting email");
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+rollNo);
		System.out.println("email : "+email);
		
	}
	
	public void init() {
		System.out.println("this time i am in init method");
	}
	
	public void destroy() {
		System.out.println("this time i am going to die");
	}
	
	

}
