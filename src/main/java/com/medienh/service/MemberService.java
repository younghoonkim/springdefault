package com.medienh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.medienh.dao.MemberDAO;
import com.medienh.entity.Member;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDao;
	
	public void getMemberList() {
		
		List<Member> memberList = memberDao.selectMemberList();
		
		return;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void putMember(Member member)
	{
		memberDao.insertMember(member);
		
	}
	
}
