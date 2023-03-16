package com.nineleaps.bookstoremanagemnetsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.repository.BookRepository;
@Service
public class BookServices implements IBookServices {

	@Autowired
	private BookRepository bookRepository;
	
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(Long bookId) {
		return bookRepository.findById(bookId).get();
	}

	@Override
	public void deleteBook(Long bookId) {
		bookRepository.deleteById(bookId);
		
	}

	@Override
	public Book insertBook(Book newBook) {
		return bookRepository.save(newBook);
	}

	@Override
	public Book updateBook(Long bookId, Book updatedBook) {
		Book book=getBookById(bookId);
		if(book!=null) {
			book.setBookName(updatedBook.getBookName());
			book.setBookAuthorName(updatedBook.getBookAuthorName());
			book.setBookPrice(updatedBook.getBookPrice());
			book.setBookType(updatedBook.getBookType());
			book.setBookTotalQuantity(updatedBook.getBookTotalQuantity());
		}
		bookRepository.save(book);
		return null;
	}

	@Override
	public Book findByBookName(String bookName) {
		return bookRepository.findByBookName(bookName);
	}

	@Override
	public Long bookTotalQuantity(Long bookId) {
		return bookRepository.bookTotalQuantity(bookId);
	}

}
