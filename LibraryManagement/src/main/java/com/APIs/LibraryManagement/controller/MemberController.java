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

import com.APIs.LibraryManagement.modal.Member;
import com.APIs.LibraryManagement.service.MemberService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@PostMapping("/addmem")
	Member addMember(@RequestBody Member member) {
		return memberService.addMember(member);
	}
	
	@GetMapping("/allMembers")
	List<Member> getAllMembers(){
		return memberService.getAllMembers();
		
	}
	
	@GetMapping("/{id}")
	Member getMemberById(@PathVariable Long id) {
		return memberService.getMemberById(id);
	}
	
	@PutMapping("/{id}")
	Member updateMember(@PathVariable Long id, @RequestBody Member member){
		return memberService.updateMember(id, member);
	}
	
	@DeleteMapping("/{id}")
	String deleteMember(@PathVariable Long id){
		memberService.deleteMember(id);
		return "member deleted successfully";
	}
	
	
}
