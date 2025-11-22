package com.concepts.oops.encapsulation_inheritance_composition;

import java.time.LocalDate;

public class Teacher extends Person {

    private String employeeId;
    private double salary;

    //Composition
    private Address address;

    public Teacher(String name, String dept, int age, String phoneNumber, LocalDate dateOfBirth, String employeeId, double salary, Address address) {

        super(name, dept, age, phoneNumber, dateOfBirth);
        this.employeeId = employeeId;
        this.salary = salary;
        this.address = address;
    }

    public Teacher(String employeeId, double salary, Address address) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getters and Setters

    public String getEmployeeId() {
        employeeId = "EMP" + getEmployeeId();
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
