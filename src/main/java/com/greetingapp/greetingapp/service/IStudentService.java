package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Student;
import com.greetingapp.greetingapp.entity.User;
import java.util.ArrayList;
import java.util.Optional;

public interface IStudentService {
    Student greetingMessage();
    String saveInDataBase(User user);
    Optional<User> findId(long id);
    ArrayList<User> findAll();

    Optional<User> edit(User user,long id);
    Optional<User> delete(long id);





}
