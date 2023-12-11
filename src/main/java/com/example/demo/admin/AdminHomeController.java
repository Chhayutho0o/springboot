package com.example.demo.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminHomeController {
    @GetMapping("/admin")
    public String index () {

        return "admin/index";
    }
    
}
