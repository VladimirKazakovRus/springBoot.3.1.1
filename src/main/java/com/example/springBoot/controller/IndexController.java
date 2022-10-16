package com.example.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String mainPage(ModelMap model) {
//		System.out.println("Index controller");
        return "index";
    }
}
