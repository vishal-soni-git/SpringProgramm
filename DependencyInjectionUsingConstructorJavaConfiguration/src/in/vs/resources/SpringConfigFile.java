package in.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vs.beans.Address;
import in.vs.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId()
	{ 
		Student std=new Student("Madhav", 21, addId());
		return std;
	}

	private Address addId() {
		// TODO Auto-generated method stub
		Address add=new Address("h-21","Mathura",18181);
		return add;
	}
}
