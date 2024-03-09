package in.vs.beans;


public class PrintableFactory {
	
	//non- static method
	public  Printable getPrintableA()
	{
		return new A();
	}
	
	//non-static method
	public Printable getPrintableB()
	{
		return new B();
	}

}
