package in.vs.resources;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import in.vs.beans.Student;

@Configurable
public class ConfigFile {

	@Bean
	public Student stdId()
	{
		Student std=new Student();
		std.setName("Madhav");
		std.setRollNo(021);
		std.setEmail("Krishna@gmail.com");
		return std;
		
	}
}
