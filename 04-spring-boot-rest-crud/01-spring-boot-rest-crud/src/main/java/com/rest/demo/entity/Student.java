package com.rest.demo.entity;

public class Student {

    private String firstName;
    private String lastName;

    private Student() {

    }

    public Student(String fristName, String lastName) {
        this.firstName = fristName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
