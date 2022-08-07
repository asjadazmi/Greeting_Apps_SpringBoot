package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Student;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
@Service
public class StudentService implements IStudentService {
    private static final String templates="Hello world";
    private static AtomicLong counter=new AtomicLong();
    @Override
    public Student greetingMessage() {
        return new Student(counter.incrementAndGet(),String.format(templates));
    }
}
