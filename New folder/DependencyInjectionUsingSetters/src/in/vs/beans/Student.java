package in.vs.beans;


public class Student {
	private String name;
	private int rollNo;
	private Address address;

	public void setName(String name) {
		System.out.println("Student Name");
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		System.out.println("Student RollNo");
		this.rollNo = rollNo;
	}
	
	public void setAddress(Address address) {
		System.out.println("Student Address");
		this.address = address;
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("rollNo : "+rollNo);
		System.out.println("email : "+address.toString());
		
	}
	
	

}
