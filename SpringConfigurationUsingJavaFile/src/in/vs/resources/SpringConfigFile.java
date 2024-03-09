package in.vs.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vs.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId()
	{
		Student std=new Student();
		std.setName("Kabir");
		std.setRollNo(19);
		std.setEmail("kabir@gmail.com");
		return std;
	}

}
