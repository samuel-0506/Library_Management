package com.APIs.LibraryManagement.service;

import java.util.List;

import com.APIs.LibraryManagement.modal.Book;

public interface BookService {

	Book addBook(Book book) ;
	
	List<Book> getAllBooks();
	
	Book getBookById(Long id);
	
	Book updateBook (Long id, Book book);
	
	void deleteBook(Long id);
}
