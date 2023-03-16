package com.nineleaps.bookstoremanagemnetsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.bookstoremanagemnetsystem.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long>{
	public Admin findByAdminUserName(String adminUserName);
	public String findByAdminUserNameAndAdminPassword(String adminUserName, String adminPassword);
}
