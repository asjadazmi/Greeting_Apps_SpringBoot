package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Student;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.repository.GreetingRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
@Service
public class StudentService implements IStudentService {
    private static final String templates="Hello world";
    private static AtomicLong counter=new AtomicLong();
    @Override
    public Student greetingMessage() {
        return new Student(counter.incrementAndGet(),String.format(templates));
    }
@Autowired
    GreetingRepsitory greetingRepsitory;
    @Override
    public String saveInDataBase(User user) {
        greetingRepsitory.save(user);
        return "my name is "+user.getFirstName()+" "+user.getLastName();

    }

    @Override
    public Optional<User> findId(long id) {
        Optional<User> User =greetingRepsitory.findById(id);
        return User;
    }


}

