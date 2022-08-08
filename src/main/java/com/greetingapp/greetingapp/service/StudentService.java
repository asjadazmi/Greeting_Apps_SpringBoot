package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Student;
import com.greetingapp.greetingapp.entity.User;
import com.greetingapp.greetingapp.repository.GreetingRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
@Service
public class StudentService implements IStudentService {
    private static final String templates = "Hello world";
    private static AtomicLong counter = new AtomicLong();

    @Override
    public Student greetingMessage() {
        return new Student(counter.incrementAndGet(), String.format(templates));
    }

    @Autowired
    GreetingRepsitory greetingRepsitory;

    @Override
    public String saveInDataBase(User user) {
        greetingRepsitory.save(user);
        return "my name is " + user.getFirstName() + " " + user.getLastName();

    }

    @Override
    public Optional<User> findId(long id) {
        Optional<User> User = greetingRepsitory.findById(id);
        return User;
    }

    @Override
    public ArrayList<User> findAll() {
        List<User> User = greetingRepsitory.findAll();
        return (ArrayList<com.greetingapp.greetingapp.entity.User>) User;
    }

    @Override
    public Optional<User> edit(User user, long id) {
        Optional<User> user1=this.findId(id);
        user1.get().updateUsers(user);
        greetingRepsitory.save(user1.get());
        return Optional.of(user1.get());
    }


}
