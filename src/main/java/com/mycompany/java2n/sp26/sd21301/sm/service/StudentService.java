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

}
