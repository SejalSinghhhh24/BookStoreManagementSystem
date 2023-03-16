package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;

public interface IBookServices {
	public List<Book> getAllBooks();
	public Book getBookById(Long bookId);
	public void deleteBook(Long bookId);
	public Book insertBook(Book newBook);
	public Book updateBook(Long bookId,Book updatedBook);
	//custom methods
	public Book findByBookName(String bookName);
	public Long bookTotalQuantity(Long bookId);
}
