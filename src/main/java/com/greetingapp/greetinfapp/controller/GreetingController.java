package com.greetingapp.greetinfapp.controller;

import com.greetingapp.greetinfapp.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private static final String templates="Hi,%s";
    private static AtomicLong counter=new AtomicLong();

    @GetMapping(value = {"","/","/query"})
    public Student greeting(@RequestParam(value="name",defaultValue ="world") String name){
        return new Student(counter.incrementAndGet(),String.format(templates,name));

    }
}
