package in.vs.beans;

public class Address {
	
	private String houseNo;
	private String city;
	private int pincode;
	public void setHouseNo(String houseNo) {
		System.out.println("Student house No");
		this.houseNo = houseNo;
	}
	public void setCity(String city) {
		System.out.println("Student city");
		this.city = city;
	}
	public void setPincode(int pincode) {
		System.out.println("Student Area pincode");
		this.pincode = pincode;
	}
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
