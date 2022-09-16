package com.example.greetingapplication.service;

import org.springframework.stereotype.Service;
@Service
public class GreetingApp {
    public static String getMessage(){
        return "Hello";
    }

    public static String messageByName(String fname, String lname){
        return "Hello " + fname + " " + lname;
    }
}
