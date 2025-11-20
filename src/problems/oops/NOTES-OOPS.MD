# OOPS (Object-Oriented Programming) Concepts

A clear and beginner-friendly guide covering the fundamental concepts of OOPS used in Java.

---

## 📌 1. **Class**

A class is a blueprint/template for creating objects. It defines properties (variables) and behaviors (methods).

**Example:**

```java
class Student {
    String name;
    int age;
}
```

---

## 📌 2. **Object**

An object is an instance of a class. It represents a real-world entity.

**Example:**

```java
Student s1 = new Student();
```

---

## 📌 3. **Encapsulation**

Encapsulation is wrapping data (variables) and methods into a single unit (class) and protecting the data using **private** access.

* Achieved using private fields + public getters/setters.

**Example:**

```java
private String name;
public String getName() { return name; }
public void setName(String name) { this.name = name; }
```

---

## 📌 4. **Inheritance** (IS-A Relationship)

Allows one class to inherit the properties and behavior of another class.

* Promotes code reuse
* Uses keyword **extends**

**Example:**

```java
class Student extends Person { }
```

Student **IS A** Person.

---

## 📌 5. **Polymorphism**

Polymorphism means "many forms". A single method behaves differently based on the object.

### **Types:**

#### ✔ Compile-time Polymorphism (Method Overloading)

Same method name, different parameters.

#### ✔ Runtime Polymorphism (Method Overriding)

Child class provides its own version of the parent class method.

**Example:**

```java
@Override
public String toString() { return "Custom Output"; }
```

---

## 📌 6. **Abstraction**

Hiding internal implementation and showing only essential details.

Achieved using:

* Abstract classes
* Interfaces

**Example:**

```java
abstract class Animal {
    abstract void sound();
}
```

---

## 📌 7. **Composition** (HAS-A Relationship)

One class contains another class as a field.

**Example:**

```java
class Car {
    Engine engine; // Car HAS-A engine
}
```

More flexible than inheritance.

---

## 📌 8. **Association**

Relationship where two classes are connected but independent.

Example: Teacher ↔ Student

---

## 📌 9. **Aggregation** (Weak HAS-A)

Special form of association where child can exist without parent.

Example:

* Department has Students (students can exist without department)

---

## 📌 10. **Composition vs Aggregation**

| Feature    | Composition             | Aggregation                  |
| ---------- | ----------------------- | ---------------------------- |
| Dependency | Strong                  | Weak                         |
| Lifetime   | Child depends on parent | Child can live independently |
| Example    | House HAS-A Room        | Department HAS-A Student     |

---

## 📌 11. **Constructor**

A special method used to initialize objects.

Types:

* Default constructor
* Parameterized constructor
* Constructor Overloading

---

## 📌 12. **Method Overloading**

Same method name, different parameters.

---

## 📌 13. **Method Overriding**

Same method name & parameters in child class, overriding parent behavior.

---

## 📌 14. **Access Modifiers**

| Modifier  | Access Level              |
| --------- | ------------------------- |
| public    | Everywhere                |
| private   | Same class only           |
| protected | Same package + subclasses |
| default   | Same package              |

---

## 📌 15. **Super Keyword**

Used to:

* Call parent class constructor
* Access parent class methods/variables

---

## 📌 16. **this Keyword**

Refers to the current object. Used to differentiate between instance variable and parameter.

---

## 📌 17. **Final Keyword**

Used to declare:

* final variable → constant
* final method → cannot be overridden
* final class → cannot be extended

---

## 🎉 Summary

OOPS helps in writing clean, structured, and reusable code. The key idea is to model real-world problems using objects and relationships.

If you want, I can also add diagrams or create a PDF version of this README.
