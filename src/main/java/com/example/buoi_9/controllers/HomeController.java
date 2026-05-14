package com.example.buoi_9.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping ("/") // b2 tạo đường link trang chủ
    public String index(Model model){
        
    }
}
