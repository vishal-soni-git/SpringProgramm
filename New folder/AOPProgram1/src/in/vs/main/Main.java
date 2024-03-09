package in.vs.main;

import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vs.beans.Payment;
import in.vs.beans.PaymentImpl;

public class Main {

	public static void main(String[] arg) throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vs/resources/applicationContext.xml");
		
		Payment p=context.getBean("payment",Payment.class);
		
		
		
		p.makePayment(100);
	}
}
