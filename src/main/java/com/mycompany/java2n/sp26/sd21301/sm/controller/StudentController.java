package com.mycompany.java2n.sp26.sd21301.sm.controller;

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

                case 3:
                    service.findAll().forEach(student -> System.out.println(student));
                    break;
                case 6:
                    return;
            }

        }

    }
}
