package com.greetingapp.greetingapp.controller;

import com.greetingapp.greetingapp.entity.Student;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/greeting/{name}")
    public Student greetings(@PathVariable String name){
        return new Student(counter.incrementAndGet(),String.format(templates,name));
    }

   @Autowired
   private IStudentService studentService;
    @GetMapping("/get/service")
    public Student greeting(){
        return studentService.greetingMessage();
    }
//    uc3

    @GetMapping("/greeting/{FirstName}/{LastName}")
    public String greetings(@PathVariable String FirstName,@PathVariable String LastName){
        return "Hello "+FirstName+"  "+LastName;

    }
    @PostMapping("/post/{FirstName}/{LastName}")
    public String sayHelloAndSaveInDatabase(@PathVariable String FirstName,@PathVariable String LastName ){
        return studentService.saveInDataBase(new User(FirstName,LastName));
    }

}
