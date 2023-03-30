package com.example.testingboard.service;

import com.example.testingboard.dto.MemberDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MemberService {
	
	public void insertMember( MemberDTO memberDTO );
	public MemberDTO getMemberOne( int num );
	public void updateMember( MemberDTO memberDTO );
	public List<MemberDTO> getMemberList();
	public int deleteMember( int num );
	
}
