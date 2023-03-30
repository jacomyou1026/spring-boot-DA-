package com.example.dbdb.service;

import com.example.dbdb.vo.MemberVo;
import com.example.dbdb.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<MemberVo> listAll() {
        return memberMapper.selectMemberAll();
    }
}
