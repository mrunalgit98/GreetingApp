package com.example.greetingapplication.controller;

import java.util.concurrent.atomic.AtomicLong;


import com.example.greetingapplication.model.Greeting;
import com.example.greetingapplication.service.GreetingApp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//uc1
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
//UC2
    @GetMapping("/getmessage")
    public String getMessage(){
        return GreetingApp.getMessage();
}
}