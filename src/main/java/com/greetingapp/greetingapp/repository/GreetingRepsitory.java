package com.greetingapp.greetingapp.repository;

import com.greetingapp.greetingapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepsitory extends JpaRepository<User, Long> {

}
