package in.vs.beans;

public class A {
	
	private static final A obj=new A();  
	private A(){System.out.println("private constructor");}  
	public static A getA(){  
	    System.out.println("factory method ");  
	    return obj;  
	}  
	public void msg(){  
	    System.out.println("Succesfully implement factory method");  
	}  

}
