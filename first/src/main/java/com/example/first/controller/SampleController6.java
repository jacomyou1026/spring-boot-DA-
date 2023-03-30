package com.example.first.controller;

import com.example.first.dto.BoardDTO;
import com.example.first.dto.BookDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController6 {
    @GetMapping("/SampleController6")
    public String mainPage(Model model){
//        단일 객체 생성
        BoardDTO boardDTO = new BoardDTO(1, "bookDTO객체입니다.", "홍길동");

        model.addAttribute("boardDTO",boardDTO);
        model.addAttribute("heading","Book Informations");



        return "post/SampleController6";
    }

}
