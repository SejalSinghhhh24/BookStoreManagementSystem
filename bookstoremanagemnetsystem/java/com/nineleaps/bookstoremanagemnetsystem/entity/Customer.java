package com.nineleaps.bookstoremanagemnetsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customerinfo")
public class Customer {
	@Id
	@Column(name="customerid")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long customerId;
	@Column(name="customername",nullable = false)
	private String customerName;
	@Column(name="customeraddress",nullable = false)
	private String customerAddress;
	@Column(name="customercontactnumber",nullable = false)
	@Pattern(regexp="[\\d]{10}")
	private String customerContactNumber;
	@Column(name="customeremail",nullable = false)
	@Email
	private String customerEmail;
	@Column(name="customerusername",nullable = false)
	private String customerUserName;
	@Column(name="customerpassword",nullable = false)
	@Pattern(regexp="^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$",message="Password should have atleast 1 Capital letter, 1 Special Character, 1 number ,1 Lower letters and 8-16 characters with no space. ")
	
	private String customerPassword;
	
	@Column(name="customerwallet",nullable = false)
	private Long customerWallet;
	
	public Customer(Long customerId, String customerName, String customerAddress,
			@Pattern(regexp = "[\\d]{10}") String customerContactNumber, @Email String customerEmail,
			String customerUserName,
			@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$", message = "Password should have atleast 1 Capital letter, 1 Special Character, 1 number ,1 Lower letters and 8-16 characters with no space. ") String customerPassword,
			Long customerWallet) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNumber = customerContactNumber;
		this.customerEmail = customerEmail;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
		this.customerWallet = customerWallet;
	}

	public Long getCustomerWallet() {
		return customerWallet;
	}

	public void setCustomerWallet(Long customerWallet) {
		this.customerWallet = customerWallet;
	}

	public Customer(Long customerId, String customerName, String customerAddress, String customerContactNumber,
			@Email String customerEmail,@Size(min=8,max=16,message="Password should have atleast 1 Capital letter, 1 Special Character, 1 number and Lower letters. ") String customerUserName, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNumber = customerContactNumber;
		this.customerEmail = customerEmail;
		this.customerUserName = customerUserName;
		this.customerPassword = customerPassword;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerContactNumber() {
		return customerContactNumber;
	}

	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}

	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
