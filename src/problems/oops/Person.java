package problems.oops;                     // 1. Declares the package (organization / namespace).

import java.time.LocalDate;               // 2. Import LocalDate so we can store dates (DOB).

// 3. Class declaration: 'Person' is a blueprint for person objects.
public class Person {

    // 4. Private fields — data hidden from outside the class (encapsulation).
    private String name;                   // 5. Person's name
    private String dept;                   // 6. Department / group the person belongs to
    private int age;                       // 7. Age in years
    String phoneNumber;                    // 8. Contact number
    private LocalDate dateOfBirth;         // 9. Date of birth

    // 10. Parameterized constructor — initialize a Person with full details.
    public Person(String name, String dept, int age, String phoneNumber, LocalDate dateOfBirth) {
        this.name = name;                  // 11. 'this' assigns constructor value to field 'name'
        this.dept = dept;                  // 12. assign 'dept'
        this.age = age;                    // 13. assign 'age'
        this.phoneNumber = phoneNumber;    // 14. assign 'phoneNumber'
        this.dateOfBirth = dateOfBirth;    // 15. assign 'dateOfBirth'
    }

    // 16. Default constructor — allows creating an empty Person then set fields later.
    public Person() {
        // 17. Intentionally empty: safe default state (fields are null/0).
    }

    // 18. Getter for dept — returns the department (controlled access).
    public String getDept() {
        return dept;                       // 19. Return the private field value
    }

    // 20. Setter for dept — allows controlled modification of the department.
    public void setDept(String dept) {
        this.dept = dept;                  // 21. Update field after any checks (none here)
    }

    // 22. Getter for name — controlled read access to name.
    public String getName() {
        return name;                       // 23. Return field
    }

    // 24. Setter for name — controlled write access to name.
    public void setName(String name) {
        this.name = name;                  // 25. Update field
    }

    // 26. Getter for age — returns age.
    public int getAge() {
        return age;                        // 27. Return field
    }

    // 28. Setter for age — update age with validation possibility.
    public void setAge(int age) {
        if (age < 0) {                     // 29. Example validation: prevent negative age
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;                    // 30. Assign if valid
    }

    // 31. Getter for phoneNumber — returns phone number.
    public String getPhoneNumber() {
        return phoneNumber;                // 32. Return field
    }

    // 33. Setter for phoneNumber — update phone number (could validate format).
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;    // 34. Assign new phone number
    }

    // 35. Getter for dateOfBirth — returns DOB.
    public LocalDate getDateOfBirth() {
        return dateOfBirth;                // 36. Return field
    }

    // 37. Setter for dateOfBirth — update DOB (could check not in future).
    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth != null && dateOfBirth.isAfter(LocalDate.now())) { // 38. small validation
            throw new IllegalArgumentException("Date of birth cannot be in the future");
        }
        this.dateOfBirth = dateOfBirth;    // 39. Assign if valid
    }

    // 40. Optional: helpful toString method to print object state nicely.
    @Override
    public String toString() {
        return "Person{name='" + name + "', dept='" + dept + "', age=" + age +
                ", phoneNumber='" + phoneNumber + "', dateOfBirth=" + dateOfBirth + "}";
    }
}
