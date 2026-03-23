package com.mycompany.java2n.sp26.sd21301.oop;

import java.util.ArrayList;
import java.util.List;


public class OopMain {


    public static void main(String[] args) {

        // Tao 3 nhan vien
        Employee employee1 = new Employee(1, "Employee 1", "Email 1","Phone 1", 1001);
        Employee employee2 = new Employee(2, "Employee 2", "Email 2","Phone 2", 1002);

        Employee employee3 = new Employee();
        employee3.setName("Employee 3");
        employee3.setEmail("Email 3");
        employee3.setPhone("Phone 3");
        employee3.setSalary(1003);

        // Dua vao List
        List<Employee> employees = new ArrayList();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        //
        System.out.println(employees);

        for (int i = 0; i < employees.size(); ++i) {

            System.out.println(employees.get(i));
        }

        for (Employee employee : employees) {

            System.out.println(employee);
        }

        for (Employee employee : employees) {

            employee.info();
        }

    }

}
