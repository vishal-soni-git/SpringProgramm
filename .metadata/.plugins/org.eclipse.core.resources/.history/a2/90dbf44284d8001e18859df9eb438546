package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.Student;

public class Main {
	public static void main(String[] arg)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		Student st=context.getBean(Student.class);
		st.display();
		
	}
}

