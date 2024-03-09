package in.vs.beans;

public class Address {
	
	private String houseNo;
	private String city;
	private int pincode;
	
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
