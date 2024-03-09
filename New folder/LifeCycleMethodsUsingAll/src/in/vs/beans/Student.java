package in.vs.beans;


public class Student {
	private String name;
	private int rollNo;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name of student");
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
		System.out.println("this time i am in init method of xml");
	}
	
	public void destroy() {
		System.out.println("this time i am going to die through xml");
	}
	
	

}
