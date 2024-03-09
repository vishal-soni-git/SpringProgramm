package in.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vs.beans.Address;
import in.vs.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Student stdId()
	{
		Student std=new Student();
		std.setName("Madhav");
		std.setRollNo(21);
		//std.setAddress(addId());
		return std;
	}
    
	@Bean
	public Address addId1() {
		// TODO Auto-generated method stub
		Address add=new Address();
		add.setHouseNo("22/7");
		add.setCity("Mathura");
		add.setPincode(18181);
		return add;
	}
	@Bean
	public Address addId2() {
		// TODO Auto-generated method stub
		Address add=new Address();
		add.setHouseNo("H-08");
		add.setCity("Dwarika");
		add.setPincode(11111);
		return add;
	}
}
