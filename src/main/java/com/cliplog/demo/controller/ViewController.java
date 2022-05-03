package com.cliplog.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/main")
    public String main() {
        System.out.println("나 실행돼?");
        return "bootstrap/index";
    }
}
