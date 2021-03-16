package com.application.techatdoor.api;

import com.application.techatdoor.models.Student;

import java.util.ArrayList;

public interface StudentApi {

    void insert(Student student);

    ArrayList<Student> read();
}
