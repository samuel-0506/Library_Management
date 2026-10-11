package com.APIs.LibraryManagement.service;

import java.util.List;

import com.APIs.LibraryManagement.modal.Member;

public interface MemberService {
	
	Member addMember(Member member);
	
	List<Member> getAllMembers();
	
	Member getMemberById(Long id);
	
	Member updateMember(Long id, Member member);
	
	void deleteMember(Long id);
}
