package com.application.techatdoor.repositories;

import com.application.techatdoor.api.StudentApi;
import com.application.techatdoor.datasource.FakeDataSource;
import com.application.techatdoor.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("fake")
public class StudentRepo implements StudentApi {

    private final FakeDataSource fakeDataSource;

    @Autowired
    public StudentRepo(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }

    @Override
    public void insert(Student student) {
        fakeDataSource.students.add(student);
    }
}
