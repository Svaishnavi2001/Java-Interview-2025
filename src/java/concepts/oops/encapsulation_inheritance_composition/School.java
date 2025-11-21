package java.concepts.oops.encapsulation_inheritance_composition;
// Defines the package this class belongs to

import java.time.LocalDate;          // Import LocalDate class for date handling
import java.util.ArrayList;          // Import ArrayList for dynamic list
import java.util.HashMap;            // Import HashMap for key-value storage
import java.util.List;               // Import List interface
import java.util.Map;                // Import Map interface

public class School { // Start of School class

    public static void main(String[] args) { // Main method (program entry point)

        // Creating a Person object using the parameterized constructor
        Person person1 =
                new Person("Sneha", "ECE", 23,"15357767",
                        LocalDate.of(2003,3,15)); // LocalDate.of creates a date object

        //person1.name="Sneha";

        // Creating first Student object
        Student student1 =
                new Student("160", "Vaishnavi", "CSE", 20, "9845484475",
                        LocalDate.of(2002, 5, 10));

        // Creating second Student object (same values but different object in memory)
        Student student2 =
                new Student("160", "Vaishnavi", "CSE", 20, "9845484475",
                        LocalDate.of(2002, 5, 10));

        // Printing objects – automatically calls toString() method
        System.out.println(student1);  // Prints details of student1
        System.out.println(student2);  // Prints details of student2
        System.out.println(person1);   // Prints details of person1

        // Creating a List to store Student objects
        List<Student> studentList = new ArrayList<>();

        studentList.add(student1); // Adding student1 to list
        studentList.add(student2); // Adding student2 to list

        // Creating a HashMap to store Students using String keys
        Map<String, Student> stringStudentMap = new HashMap<>();

        stringStudentMap.put(String.valueOf(1), student1); // Add student1 with key "1"
        stringStudentMap.put(String.valueOf(2), student2); // Add student2 with key "2"

        // Printing map and list
        System.out.println("Students Map " + stringStudentMap);   // Prints map contents
        System.out.println("Students List " + studentList);       // Prints list contents


        Teacher teacher = new Teacher("", 0, new Address("Hanuman Nagar", "Bangarga", "Kar" ,"560056"));

        System.out.println(teacher);
    }
}
