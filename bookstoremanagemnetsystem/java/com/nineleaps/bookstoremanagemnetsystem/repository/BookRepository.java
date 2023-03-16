package com.nineleaps.bookstoremanagemnetsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	public Book findByBookName(String bookName);
	public Long bookTotalQuantity(Long bookId);
}
