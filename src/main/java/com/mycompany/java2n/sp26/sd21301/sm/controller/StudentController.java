package com.mycompany.java2n.sp26.sd21301.sm.controller;

import com.mycompany.java2n.sp26.sd21301.sm.entity.Student;
import com.mycompany.java2n.sp26.sd21301.sm.service.StudentService;
import java.util.Scanner;

public class StudentController {

    private StudentService service = new StudentService();
    private Scanner scanner = new Scanner(System.in);

    public void run() throws Exception {

        while (true) {

            System.out.println("1. Add Student\n2. View Student\n3. View All\n4. Update\n5.Delete\n6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Id: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    service.create(new Student(id1, name, age));
                    System.out.println("Student added!");
                    break;
                case 3:
                    service.findAll().forEach(student -> System.out.println(student));
                    break;
                case 6:
                    return;
            }

        }

    }
}
