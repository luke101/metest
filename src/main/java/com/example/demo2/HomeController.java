package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("home")
public class HomeController {

    @RequestMapping("/")
    public String Test(){
        return "test";
    }
}
