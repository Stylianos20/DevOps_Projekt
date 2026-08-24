package com.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hallo! Unsere DevOps-Pipeline läuft erfolgreich!";
    }
}