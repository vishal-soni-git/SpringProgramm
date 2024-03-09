package in.vs.beans;

public class PrintableFactory {
	
	//static method
	public static Printable getPrintableA()
	{
		return new A();
	}
	//static method
	public static Printable getPrintableB()
	{
		return new B();
	}

}
