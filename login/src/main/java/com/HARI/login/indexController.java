package com.HARI.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class indexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public String empReg(@ModelAttribute Emp emp){
        System.out.println(emp.toString());
        return "index";
    } 
}
