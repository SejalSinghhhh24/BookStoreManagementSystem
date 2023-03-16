package com.nineleaps.bookstoremanagemnetsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.bookstoremanagemnetsystem.entity.Book;
import com.nineleaps.bookstoremanagemnetsystem.services.IBookServices;

@RestController
public class BookController {

	@Autowired
	private IBookServices bookService;
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
//	@GetMapping("/getbookbyid/{bookid}")
//	public Book getBookById(@PathVariable(name="bookid") Long bookId) {
//		return bookService.getBookById(bookId);
//	}
//	
//	@DeleteMapping("/deletebookbyid/{bookid}")
//	public void deleteBook(@PathVariable(name="bookid")Long bookId) {
//		bookService.deleteBook(bookId);
//	}
//	
	@PostMapping("/insertbooks")
	public Book insertBook(@RequestBody Book newBook) {
		return bookService.insertBook(newBook);
		
	}
//	
//	@PatchMapping("/updatebooks/{bookid}")
//	public Book updateBook(@PathVariable(name="bookid")Long bookId,@RequestBody Book updatedBook) {
//		return bookService.updateBook(bookId, updatedBook);
//		
//	}
//	
//	@GetMapping("findbybookname/{bookname}")
//	//custom methods
//	public Book findByBookName(@PathVariable(name="bookname")String bookName) {
//		return bookService.findByBookName(bookName);
//		
//	}
}
