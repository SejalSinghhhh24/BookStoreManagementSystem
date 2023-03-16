package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.bookstoremanagemnetsystem.entity.Admin;
import com.nineleaps.bookstoremanagemnetsystem.repository.AdminRepository;
@Service
public class AdminServices implements IAdminServices {

	@Autowired
	private AdminRepository adminRepository;
	@Override
	public List<Admin> getAllAdmins() {
		return adminRepository.findAll();
	}

	@Override
	public Admin getAdminById(Long adminId) {
		return adminRepository.findById(adminId).get();
	}

	@Override
	public void deleteAdmin(Long adminId) {
		adminRepository.deleteById(adminId);
	}

	@Override
	public Admin insertAdmin(Admin newAdmin) {
		return adminRepository.save(newAdmin);
	}

	@Override
	public String updateAdmin(Long adminId, Admin updatedAdmin) {
		Admin admin=getAdminById(adminId);
		if(admin!=null) {
			admin.setAdminUserName(updatedAdmin.getAdminUserName());
			admin.setAdminPassword(updatedAdmin.getAdminPassword());
			adminRepository.save(admin);
			return "Updated!";
		}
		else {
			return "No admin with this id present";
		}
		
	}

	@Override
	public Admin findByAdminUserName(String adminUserName) {
		return adminRepository.findByAdminUserName(adminUserName);
	}
	
	
	@Override
	public String findByAdminUserNameAndAdminPassword(String adminUserName, String adminPassword) {
		Admin admin=findByAdminUserName(adminUserName);
		if(admin!=null) {
		 if(admin.getAdminPassword().equals(adminPassword)) {
			return "Validated";
		}else
		return "Not Validated-password is wrong";
		}
		return "Not validated-user not found";
	}

}
