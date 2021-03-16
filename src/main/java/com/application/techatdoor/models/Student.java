package com.application.techatdoor.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    String name;

    public Student(@JsonProperty("name") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
