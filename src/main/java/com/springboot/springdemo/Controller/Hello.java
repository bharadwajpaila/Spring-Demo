package com.springboot.springdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value ="/")
    public String hello(){
        return "Welcome to Spring-boot";
    }

}
