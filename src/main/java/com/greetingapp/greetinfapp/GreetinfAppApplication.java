package com.greetingapp.greetinfapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetinfAppApplication {
 public static void main(String[] args) {
        SpringApplication.run(GreetinfAppApplication.class, args);
        System.out.println("Welcome to the Greeting Application");
    }

}
