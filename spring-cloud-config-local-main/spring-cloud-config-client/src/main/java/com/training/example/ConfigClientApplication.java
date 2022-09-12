package com.training.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@SpringBootApplication
@RestController
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${limits-service.greeting}")
    private String msg1;

    @Value("${limits-service.msg}")
    private String msg2;

    @GetMapping(value = "/data")
    public String data(){
            System.out.println(msg1);
            System.out.println(msg2);
        return msg1+" "+msg2;

    }

}