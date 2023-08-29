package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index(){
        return "Greetings from SpringBoot!";
    }

    @GetMapping("/2")
    public String index2(){
        return "2!";
    }
}
