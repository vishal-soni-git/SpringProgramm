package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.A;

public class Main {
	public static void main(String[] arg)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		A a=context.getBean(A.class);
		//A a=(A)context.getBean("a");
		a.msg();
		
	}
}

