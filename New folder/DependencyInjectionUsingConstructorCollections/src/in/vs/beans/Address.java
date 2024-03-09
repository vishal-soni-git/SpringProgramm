package in.vs.beans;

public class Address {
	
	private String houseNo;
	private String city;
	private int pincode;
	
	public Address(String houseNo, String city, int pincode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
	}

	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
