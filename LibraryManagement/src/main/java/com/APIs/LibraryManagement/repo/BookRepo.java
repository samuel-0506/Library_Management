package com.APIs.LibraryManagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APIs.LibraryManagement.modal.Book;

public interface BookRepo extends JpaRepository<Book, Long>{

	List<Book> findByMemberId(Long memberId);
}
