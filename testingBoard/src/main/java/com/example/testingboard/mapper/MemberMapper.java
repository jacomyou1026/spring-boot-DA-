package com.example.testingboard.mapper;

import com.example.testingboard.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MemberMapper {
    public void insertMember( MemberDTO memberDTO );
    public MemberDTO selectMemberOne( int num );
    public void updateMember( MemberDTO memberDTO );
    public List<MemberDTO> selectMemberAll();
    public int deleteMemberOne( int num );

}
