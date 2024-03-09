package in.vs.main;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import in.vs.beans.Student;

public class Main {
	public static void main(String[] arg)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		Student st=(Student)context.getBean("stdId");
		//Student st= (Student) context.getBean(Student.class);
		st.display();
		context.registerShutdownHook();
		
	}
}

