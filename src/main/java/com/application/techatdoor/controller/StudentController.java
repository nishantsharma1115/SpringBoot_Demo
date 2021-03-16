package com.application.techatdoor.controller;

import com.application.techatdoor.models.Student;
import com.application.techatdoor.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("api/v1/person")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void insertStudent(@RequestBody Student student) {
        studentService.insertStudent(student);
    }

    @GetMapping
    public ArrayList<Student> read() {
        return studentService.read();
    }
}
