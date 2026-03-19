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
        return students;
    }


    // Tim kiem sv theo id  getById()
    public Student findStudentById(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }


    // Sua sv theo id  update()
    public boolean updateStudent(int id, String newName, int newAge) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);

                return true;
            }
        }
        return false;
    }

    // Xoa sv theo id  delete()
    public boolean removeStudent(int id) {

        return students.remove(findStudentById(id));

    }
}
