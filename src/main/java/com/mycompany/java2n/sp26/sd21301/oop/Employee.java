package com.mycompany.java2n.sp26.sd21301.oop;

public class Employee {

    // Data
    private int id;
    private String name;
    private String email;
    private String phone;
    private double salary;

    // Methods
    // a: constructors, getters, setters

    public Employee() {
    }

    public Employee(int id, String name, String email, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", salary=" + salary + '}';
    }

    // b
    public void info() {

        System.out.println("I am " + name + " , phone " + phone + ", salary " + salary);
    }


}
