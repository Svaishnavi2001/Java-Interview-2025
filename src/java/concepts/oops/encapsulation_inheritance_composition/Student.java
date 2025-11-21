package java.concepts.oops.encapsulation_inheritance_composition;
// Declares the package where this class is stored.

import java.time.LocalDate;
// Imports LocalDate to store date of birth.

// Student is a type of Person → inheritance.
public class Student extends Person {

    // Private field → encapsulation.
    private String studentID;

    // Parameterized Constructor
    public Student(String studentID, String name, String dept,int age, String phoneNumber, LocalDate dateOfBirth) {

        // Call the parent (Person) constructor.
        // This sets name, dept, age, phoneNumber, and dateOfBirth in the Person class.
        super(name, dept, age, phoneNumber, dateOfBirth);

        // Generate studentID in the constructor itself.
        // This is the correct place to build custom ID.
        this.studentID = "1RNS19" + dept + studentID;
    }

    // Getter for studentID
    public String getStudentID() {
        // Getter should NOT modify values — it only returns.
        return studentID;
    }

    // Setter for studentID
    public void setStudentID(String studentID) {
        // Also generate formatted ID if user sets a new one.
        this.studentID = "1RNS19" + getDept() + studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", department='" + getDept() + '\'' +
                '}';
    }
}
