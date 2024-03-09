package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vs.beans.Student;
import in.vs.resources.SpringConfig;

public class Main {
	public static void main(String[] arg)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student st=(Student)context.getBean("stdId");
		st.display();
		
	}
}

