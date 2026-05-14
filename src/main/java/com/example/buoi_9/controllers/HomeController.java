package com.example.buoi_9.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping ("/index.html") // b2 tạo đường link trang chủ
    public String index(Model model){   //b3
        return "pages/home/index"; //b4 trả về đường dẫn đến file html
    }

    @GetMapping("/cart.html")
    public String cart(Model model) {
        return "pages/home/cart";
    }

    @GetMapping("/about.html")
    public String about(Model model) {
        return "pages/home/about";
    }

    @GetMapping("/shop.html")
    public String shop(Model model) {
        return "pages/home/shop";
    }
}
