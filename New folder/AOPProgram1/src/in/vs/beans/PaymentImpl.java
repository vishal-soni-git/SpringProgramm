package in.vs.beans;

public class PaymentImpl implements Payment {
	

	public void makePayment(int ammount) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(ammount+" have been deducted");
		
		//your logic
		
		Thread t=new Thread();
		t.sleep(3000);
		
		System.out.println(ammount+" have been credited");
		t.sleep(1000);
		
	}

}
