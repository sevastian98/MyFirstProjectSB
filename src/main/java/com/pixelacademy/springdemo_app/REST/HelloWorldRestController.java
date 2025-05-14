package com.pixelacademy.springdemo_app.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // adnotare
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }
    @GetMapping("/meniu")
    public String meniu() {
        return  "1.pizza \n2.Sarmale \n3.Zama";
    }
}
