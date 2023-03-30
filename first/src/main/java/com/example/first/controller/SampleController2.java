package com.example.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController2 {
//post로 보낼시 GetMapping으로 받으면
//    @GetMapping("/post")
//    public String demoPost(){
//        return  "post/post";
//    }
//
    @PostMapping("/post")
    public String demoPost(@RequestBody String req,Model model) {
        System.out.println("성공");
        System.out.println(req);
        /*
        @RequestBody는 전달된 데이터를 일괄로 묶어서 출력.
        만약  Post방식으로 전달된 Form 데이터들에 대해 받고자 한다면
        Get방식 ==> @GetMapping
        Post방식 ==>@PostMapping
        * */

        model.addAttribute("req", req);
        return  "post/post";
        
    }
}
