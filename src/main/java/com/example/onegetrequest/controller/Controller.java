package com.example.onegetrequest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Controller {
    @Value("${feature.toggle}")
    boolean isToggle;

    @GetMapping
    public String createHello(){
        if (isToggle){
            return "Hello toggle is on";
        }else {
            return "Hello world!";
        }

    }
}
