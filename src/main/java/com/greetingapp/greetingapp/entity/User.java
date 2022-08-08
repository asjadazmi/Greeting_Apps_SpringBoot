package com.greetingapp.greetingapp.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class User {
    @Id
    @GeneratedValue

    private long id;
    private String FirstName;
    private String LastName;

    public User(String firstName, String lastName) {
        super();
        FirstName = firstName;
        LastName = lastName;
    }

    public User() {

    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void updateUsers(User user){
        this.FirstName=user.getFirstName();
        this.LastName=user.getLastName();
    }

}
