package com.example.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
    @GetMapping("/SpringBootHelloWorld")
    public String index() {
        return "Spring Boot Hello World!";
    }
}
