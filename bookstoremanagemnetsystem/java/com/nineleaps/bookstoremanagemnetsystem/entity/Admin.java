package com.nineleaps.bookstoremanagemnetsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="adminnfo")
public class Admin {

	@Id
	@Column(name="adminid")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long adminId;
	@Column(name="adminusername",nullable = false)
	private String adminUserName;
	@Column(name="adminpassword",nullable = false)
	@Pattern(regexp="^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$",message="Password should have atleast 1 Capital letter, 1 Special Character, 1 number ,1 Lower letters and 8-16 characters with no space. ")
	private String adminPassword;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Admin(Long adminId, String adminUserName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}
}
