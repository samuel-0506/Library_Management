package com.APIs.LibraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APIs.LibraryManagement.modal.Book;
import com.APIs.LibraryManagement.service.BookService;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/addBook")
	Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping("/allBooks")
	List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/{id}")
	Book getBookById(@PathVariable Long id){
		return bookService.getBookById(id);
		
	}
	
	@PutMapping("/{id}")
	Book updateBook(@PathVariable Long id, @RequestBody Book book){
		return bookService.updateBook(id, book);
		
	}
	
	@DeleteMapping("/{id}")
	 String deleteBook(@PathVariable Long id) {
		bookService.deleteBook(id);
		return "Book deleted successfully";
		
	}
	
}
