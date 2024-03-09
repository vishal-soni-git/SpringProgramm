package in.vs.beans;

public class PrintableFactory {
	
	public  Printable getPrintableA()
	{
		return new A();
	}
	
	public  Printable getPrintableB()
	{
		return new B();
	}

}
