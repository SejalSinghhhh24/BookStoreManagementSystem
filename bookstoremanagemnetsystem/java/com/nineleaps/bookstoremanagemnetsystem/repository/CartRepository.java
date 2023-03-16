package com.nineleaps.bookstoremanagemnetsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.entity.Cart;
import com.nineleaps.bookstoremanagemnetsystem.entity.Customer;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	public Book findByBook(Book book);
	public Customer findByCustomer_customerId(Long customerId);
}
