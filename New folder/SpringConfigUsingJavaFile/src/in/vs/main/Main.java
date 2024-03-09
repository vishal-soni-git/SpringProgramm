package in.vs.main;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import in.vs.beans.Student;
import in.vs.resources.ConfigFile;

public class Main {
	public static void main(String[] arg)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Student st=(Student)context.getBean("stdId");
		st.display();
		context.registerShutdownHook();
		
	}
}

