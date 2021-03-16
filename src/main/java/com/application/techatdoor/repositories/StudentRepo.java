package com.application.techatdoor.repositories;

import com.application.techatdoor.api.StudentApi;
import com.application.techatdoor.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("fake")
public class StudentRepo implements StudentApi {

    private final ArrayList<Student> students = new ArrayList<>();

    @Override
    public void insert(Student student) {
        students.add(student);
    }

    @Override
    public ArrayList<Student> read() {
        return students;
    }
}
