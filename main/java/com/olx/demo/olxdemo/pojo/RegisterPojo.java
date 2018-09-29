package com.olx.demo.olxdemo.pojo;

public class RegisterPojo {

	private String name;
	private String address;
	private String password;
	private String emailId;
	private String phoneNo;
	
	public RegisterPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterPojo(String name, String address, String password,
			String emailId, String phoneNo) {
		super();
		this.name = name;
		this.address = address;
		this.password = password;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "RegisterPojo [name=" + name + ", address=" + address
				+ ", password=" + password + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	
}
