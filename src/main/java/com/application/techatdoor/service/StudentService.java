package com.application.techatdoor.service;

import com.application.techatdoor.api.StudentApi;
import com.application.techatdoor.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fake")
    private final StudentApi studentApi;

    public StudentService(StudentApi studentApi) {
        this.studentApi = studentApi;
    }

    public void insertStudent(Student student) {
        studentApi.insert(student);
    }
}
