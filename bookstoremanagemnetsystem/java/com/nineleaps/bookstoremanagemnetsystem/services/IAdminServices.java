package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import com.nineleaps.bookstoremanagemnetsystem.entity.Admin;

public interface IAdminServices {
	public List<Admin> getAllAdmins();
	public Admin getAdminById(Long adminId);
	public void deleteAdmin(Long adminId);
	public Admin insertAdmin(Admin newAdmin);
	public String updateAdmin(Long adminId,Admin updatedAdmin);
	
	//custom methods
	public Admin findByAdminUserName(String adminUserName);
	public String findByAdminUserNameAndAdminPassword(String adminUserName, String adminPassword);
}
