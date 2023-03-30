package com.example.dbdb.controller;

import com.example.dbdb.vo.MemberVo;
import com.example.dbdb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/")
    public String list(Model model){
        List<MemberVo> list = memberService.listAll();
        model.addAttribute("list",list);
        return "member/list";

    }



}
