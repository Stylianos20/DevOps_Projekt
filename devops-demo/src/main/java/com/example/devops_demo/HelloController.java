<<<<<<< HEAD
package com.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hallo! Unsere DevOps-Pipeline läuft erfolgreich!";
    }
=======
package com.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hallo! Unsere DevOps-Pipeline läuft erfolgreich!";
    }
>>>>>>> 8d743596ac53b7ff08d04db74e49df217b112224
}