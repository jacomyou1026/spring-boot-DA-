package com.example.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
    @GetMapping("/user/userid")
    public  String userId(@RequestParam(value ="userid",required = false) String id, Model model){
        System.out.println(id);

        model.addAttribute("userid",id);

        return "user/userid";
    }

    @GetMapping("/user/userparams")
    public String userParams(@RequestParam(value = "userid")String userid, @RequestParam(value = "username",required = false) String username,Model model){
        model.addAttribute("userid",userid);
        model.addAttribute("username",username);
        return "user/userinfo";
    }
}
