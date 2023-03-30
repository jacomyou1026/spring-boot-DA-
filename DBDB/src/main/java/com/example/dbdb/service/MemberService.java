package com.example.dbdb.service;

import com.example.dbdb.vo.MemberVo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MemberService {

    List<MemberVo> listAll();
}
