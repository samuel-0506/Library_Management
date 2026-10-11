package com.APIs.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIs.LibraryManagement.modal.Book;
import com.APIs.LibraryManagement.modal.Member;
import com.APIs.LibraryManagement.repo.MemberRepo;
import com.APIs.LibraryManagement.repo.BookRepo;

@Service
public class Bookimpl implements BookService{
	
	@Autowired
	BookRepo bookRepo;
	@Autowired
	MemberRepo memberRepo;

	@Override
	public Book addBook(Book book) {

	    if (book.getMember() != null
	            && book.getMember().getId() != null) {

	        Member member = memberRepo.findById(
	                book.getMember().getId())
	                .orElseThrow(() ->
	                    new RuntimeException("Member not found"));

	        book.setMember(member);
	    }

	    return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		return bookRepo.findById(id).get();
	}

	@Override
	public Book updateBook(Long id, Book b) {

	    Book bookInfoFromDB = getBookById(id);

	    bookInfoFromDB.setAuthor(b.getAuthor());
	    bookInfoFromDB.setAvailableCopies(b.getAvailableCopies());
	    bookInfoFromDB.setCategory(b.getCategory());
	    bookInfoFromDB.setIsbn(b.getIsbn());
	    bookInfoFromDB.setTitle(b.getTitle());
	    bookInfoFromDB.setTotalCopies(b.getTotalCopies());

	    if (b.getMember() != null
	            && b.getMember().getId() != null) {

	        Member member = memberRepo.findById(
	                b.getMember().getId())
	                .orElseThrow(() ->
	                    new RuntimeException("Member not found"));

	        bookInfoFromDB.setMember(member);

	    } else {
	        bookInfoFromDB.setMember(null);
	    }

	    return bookRepo.save(bookInfoFromDB);
	}

	@Override
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}

}
