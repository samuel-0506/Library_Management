package com.APIs.LibraryManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APIs.LibraryManagement.modal.Member;


public interface MemberRepo extends JpaRepository<Member, Long>{

}
