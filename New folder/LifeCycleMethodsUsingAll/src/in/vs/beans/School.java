package in.vs.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class School {
	
	private String name;
	private int scid;
	private String email;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting Name of School");
		this.name = name;
	}
	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
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
		System.out.println("Id :"+scid);
		System.out.println("Email :"+email);
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("This time i am in annotation file");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("This time i am going to die thorugh annotation");
	}
	

}
