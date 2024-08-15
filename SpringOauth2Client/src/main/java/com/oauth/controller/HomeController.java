package com.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/helloSecured")
    public String helloSecured(){
        return "hello world secured";
    }
}
