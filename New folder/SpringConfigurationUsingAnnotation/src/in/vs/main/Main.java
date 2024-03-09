package in.vs.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


import in.vs.beans.Student;
import in.vs.resources.ConfigFile;

public class Main {
	public static void main(String[] arg)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
	//	Student st=(Student)context.getBean("student");
		Student st=context.getBean("student",Student.class);
		st.display();
		
	}
}

