package com.training.springboot.springbootdemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController{
    @GetMapping(value ="/name")
    public String getName(){
        return "Yogendra";
    }
}