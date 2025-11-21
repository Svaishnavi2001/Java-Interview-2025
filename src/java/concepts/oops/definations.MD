
---

# ⭐ **Java OOP Concepts — Definitions**

## 1️⃣ **Class**

A **class** is a blueprint or template used to create objects.
It defines properties (variables) and behaviors (methods).

**Example:**
`Car` class defines wheels, engine, start(), stop(), etc.

---

## 2️⃣ **Object**

An **object** is an instance of a class.
It represents a real-world entity and has its own state and behavior.

**Example:**
`new Car()` creates an object of class Car.

---

## 3️⃣ **Encapsulation**

Encapsulation means **wrapping data and methods** together inside a class and **protecting data** using access modifiers.

* Use `private` variables
* Access through getters and setters

---

## 4️⃣ **Inheritance**

Inheritance allows one class to **acquire properties and methods** of another class.

* Child class → inherits from parent
* Achieves **code reusability**

**Keyword:** `extends`

---

## 5️⃣ **Polymorphism**

Polymorphism means **one name, many forms**.
Same method behaves differently based on the object.

Two types:

* **Method Overloading** (compile-time)
* **Method Overriding** (runtime)

---

## 6️⃣ **Abstraction**

Abstraction means **showing only essential details** and **hiding unnecessary complexity**.

Achieved using:

* Abstract classes
* Interfaces

Example:
You drive the car without knowing how engine works.

---

## 7️⃣ **Association**

Association is a relationship between two classes.
It's not ownership.
Example: Teacher **teaches** Student.

---

## 8️⃣ **Aggregation**

Aggregation is a **weak HAS-A** relationship.
Child can exist without parent.

Example:
Department has teachers, but teachers can exist without department.

---

## 9️⃣ **Composition**

Composition is a **strong HAS-A** relationship.
Child cannot exist without parent.

Example:
Car has an Engine.
Engine cannot exist without Car.

---

# ⭐ Summary Table

| Concept       | Definition                                       |
| ------------- | ------------------------------------------------ |
| Class         | Blueprint for objects                            |
| Object        | Instance of class                                |
| Encapsulation | Binding data + methods, protecting data          |
| Inheritance   | One class acquires another’s properties          |
| Polymorphism  | Same method, different behavior                  |
| Abstraction   | Hiding internal details, showing only essentials |
| Association   | Relationship between two classes                 |
| Aggregation   | Weak HAS-A relationship                          |
| Composition   | Strong HAS-A relationship                        |

---
