package com.mycompany.java2n.sp26.sd21301.sm.service;

import com.mycompany.java2n.sp26.sd21301.sm.entity.Student;
import com.mycompany.java2n.sp26.sd21301.sm.repository.StudentRepository;
import java.util.List;

public class StudentService {

    private StudentRepository repo = new StudentRepository();

    //1.
    public List<Student> findAll() {

        return repo.findAll();
    }

    //3.
    public void create(Student student) throws Exception {

        if (student.getAge() < 15) {
            throw new IllegalArgumentException("Age must be >= 15");
        }

        repo.create(student);
    }

    //4.
    public void update(Student student) throws Exception{

        repo.update(student);
    }

}
