package com.projectsesmeiva.reporting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
    @GetMapping("/he")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
