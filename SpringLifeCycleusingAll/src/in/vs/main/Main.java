package in.vs.main;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.School;
import in.vs.beans.Student;
import in.vs.beans.Teacher;

public class Main {
	public static void main(String[] arg)
	{
		//use xml file
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		//for enable destroy method we apply hook
		context.registerShutdownHook();
		System.out.println("-------------------------------------------");
		Student st=(Student) context.getBean("stdId");
		st.display();
		System.out.println("-------------------------------------------");
		Teacher tc=context.getBean("tId",Teacher.class);
		tc.display();
		System.out.println("-------------------------------------------");
		School sc=context.getBean(School.class);
		sc.display();
		System.out.println("-------------------------------------------");
		
	}
}

