package in.vs.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean,DisposableBean {
	
	private String name;
	private int id;
	private String email;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Name of teacher");
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Id :"+id);
		System.out.println("Email :"+email);
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am from java bean method");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am going to die through java interfaces");	
	}

}
