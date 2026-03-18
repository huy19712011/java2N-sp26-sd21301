package com.mycompany.java2n.sp26.sd21301.ass1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    // 1. data
    private List<Student> students = new ArrayList();

    // 2b. methods

    // Them sv vao ds  add()
    public void addStudent(Student student) {

        students.add(student);
    }

    // Lay ra ds sv   getAll()
    public List<Student> getAllStudents() {

        //
        return null;
    }


    // Tim kiem sv theo id  getById()
    public Student findStudentById(int id) {

        return null;
    }


    // Sua sv theo id  update()
    public boolean updateStudent(int id, String newName, int newAge) {
        return true;
    }

    // Xoa sv theo id  delete()
    public boolean removeStudent(int id) {
        return true;
    }
}
