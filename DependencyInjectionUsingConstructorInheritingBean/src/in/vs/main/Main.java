package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.Student;

public class Main {
	public static void main(String[] arg)
	{
		//use xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		Student st1=(Student) context.getBean("stdId1");
		st1.display();
		
		System.out.println("===========================");
		
		Student st2=(Student) context.getBean("stdId2");
		st2.display();
		
		
	}
}

