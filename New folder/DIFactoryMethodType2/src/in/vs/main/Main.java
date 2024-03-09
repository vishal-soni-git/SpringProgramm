package in.vs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.Printable;


public class Main {
	public static void main(String[] arg)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		Printable p1=(Printable) context.getBean("p1");
		Printable p2=(Printable) context.getBean("p2");
		p1.print();
		p2.print();
	}
}

