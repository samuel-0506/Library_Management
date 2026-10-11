package com.APIs.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APIs.LibraryManagement.modal.Member;
import com.APIs.LibraryManagement.repo.MemberRepo;

@Service
public class Memberimpl implements MemberService{

	@Autowired
	MemberRepo memberRepo;
	
	@Override
	public Member addMember(Member m) {
		return memberRepo.save(m);
	}

	@Override
	public List<Member> getAllMembers() {
		return memberRepo.findAll();
	}

	@Override
	public Member getMemberById(Long id) {
		return memberRepo.findById(id).get();
	}

	@Override
	public Member updateMember(Long id, Member m) {
		Member memberInfoFromDB = getMemberById(id);
		memberInfoFromDB.setName(m.getName());
		memberInfoFromDB.setAddress(m.getAddress());
		memberInfoFromDB.setEmail(m.getEmail());
		memberInfoFromDB.setPhone(m.getPhone());
		return memberRepo.save(memberInfoFromDB);
	}

	@Override
	public void deleteMember(Long id) {
		memberRepo.deleteById(id);
	}

}
