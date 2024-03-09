package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vs.beans.Student;
import in.vs.resources.SpringConfig;

public class Main {
	public static void main(String[] arg)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student st=context.getBean(Student.class);
		st.display();
		
	}
}

