package in.vs.main;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.vs.beans.School;
import in.vs.beans.Student;
import in.vs.beans.Teacher;

public class Main {
	public static void main(String[] arg)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		//for destroy method
		context.registerShutdownHook();
		
		System.out.println("------------------------------------------------------");
		
		Student st=(Student)context.getBean("stdId");
		//Student st= (Student) context.getBean(Student.class);
		st.display();
		
		System.out.println("------------------------------------------------------");
		Teacher tc=(Teacher) context.getBean("tId",Teacher.class);
		tc.display();
		
		System.out.println("------------------------------------------------------");
		
		School sc=(School) context.getBean(School.class);
		sc.display();
		
		System.out.println("------------------------------------------------------");
		
		
		
	}
}

