package com.mycompany.java2n.sp26.sd21301.sm;

import com.mycompany.java2n.sp26.sd21301.sm.entity.Student;
import com.mycompany.java2n.sp26.sd21301.sm.repository.StudentRepository;
import java.util.List;


public class StudentManager {


    public static void main(String[] args) {


        List<Student> list = new StudentRepository().findAll();

        System.out.println(list);
    }

}
