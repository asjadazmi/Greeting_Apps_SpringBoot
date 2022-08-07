package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Student;
import com.greetingapp.greetingapp.entity.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IStudentService {
    Student greetingMessage();
    String saveInDataBase(User user);
    Optional<User> findId(long id);
    ArrayList<User> findAll();

}
