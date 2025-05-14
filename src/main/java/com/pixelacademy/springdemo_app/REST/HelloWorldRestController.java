package com.pixelacademy.springdemo_app.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // adnotare
public class HelloWorldRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }
}
