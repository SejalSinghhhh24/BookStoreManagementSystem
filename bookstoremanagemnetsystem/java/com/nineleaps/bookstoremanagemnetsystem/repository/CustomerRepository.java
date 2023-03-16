package com.nineleaps.bookstoremanagemnetsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.bookstoremanagemnetsystem.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	public Customer findByCustomerName(String customerUserName);
}
