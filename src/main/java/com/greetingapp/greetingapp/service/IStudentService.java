package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.entity.Student;
import com.greetingapp.greetingapp.entity.User;

public interface IStudentService {
    Student greetingMessage();
    String saveInDataBase(User user);
}
