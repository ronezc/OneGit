package com.zc.vo;

public class Contact {

	private String address;
	private String phone;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Contact(String address, String phone) {
		super();
		this.address = address;
		this.phone = phone;
	}
	public Contact() {
		super();
	}
	
	@Override
	public String toString() {
		return "Contact [address=" + address + ", phone=" + phone + "]";
	}
	
}
