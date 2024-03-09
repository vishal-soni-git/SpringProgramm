package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.Student;
import in.vs.resources.SpringConfigFile;

public class Main {
	public static void main(String[] arg)
	{
		//if use xml file
		//ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		//if use java Configuration file
	     ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student st=context.getBean(Student.class);
		st.display();
		
	}
}

