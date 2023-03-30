package com.example.dbdb.mapper;

import java.util.List;

import com.example.dbdb.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface MemberMapper {

	public void insertMember( MemberVo memberDTO );
	public MemberVo selectMemberOne( int num );
	public void updateMember( MemberVo memberDTO );
	public List<MemberVo> selectMemberAll();
	public int deleteMemberOne( int num );

}
