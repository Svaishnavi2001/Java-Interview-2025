Here are **clear, simple, exam-ready definitions of all important Exception Handling concepts WITH examples**.
This is perfect for notes, viva, and written exams.

---

# ✅ **1. Exception**

### **Definition:**

An **exception** is an unexpected event that occurs during program execution and interrupts the normal flow of the program.

### **Example:**

```java
int a = 10 / 0;   // ArithmeticException
```

---

# ✅ **2. Exception Handling**

### **Definition:**

Exception handling is the mechanism to detect and manage exceptions so the program does not crash.

### **Example:**

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

# ✅ **3. try Block**

### **Definition:**

The try block contains the code that might throw an exception.

### **Example:**

```java
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[5]);   // Risky code
}
```

---

# ✅ **4. catch Block**

### **Definition:**

The catch block handles the exception thrown by the try block.

### **Example:**

```java
try {
    int a = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}
```

---

# ✅ **5. finally Block**

### **Definition:**

The finally block is executed **whether an exception occurs or not**.

### **Example:**

```java
try {
    System.out.println("Inside try");
} finally {
    System.out.println("Always runs");
}
```

---

# ✅ **6. throw Keyword**

### **Definition:**

`throw` is used to **manually** throw an exception from inside a method or block.

### **Example:**

```java
if (age < 18) {
    throw new ArithmeticException("Not eligible");
}
```

---

# ✅ **7. throws Keyword**

### **Definition:**

`throws` is used in the method signature to declare that the method may throw exceptions.

### **Example:**

```java
void myMethod() throws IOException {
    FileReader fr = new FileReader("abc.txt");
}
```

---

# ✅ **8. Checked Exception**

### **Definition:**

Exceptions that are checked at **compile time**.
Programmer must handle them using try-catch or throws.

### **Example:**

```java
try {
    FileReader fr = new FileReader("file.txt"); // FileNotFoundException
} catch (Exception e) {
    System.out.println(e);
}
```

---

# ✅ **9. Unchecked Exception**

### **Definition:**

Exceptions that occur **at runtime** and are not checked by the compiler.

### **Example:**

```java
int a = Integer.parseInt("abc");  // NumberFormatException
```

---

# ✅ **10. Error**

### **Definition:**

Errors represent serious problems that the program cannot recover from.

### **Example:**

```java
// Causes StackOverflowError
void test() {
    test();
}
```

---

# ✅ **11. Custom Exception**

### **Definition:**

A user-defined exception created by extending the Exception class.

### **Example:**

```java
class AgeException extends Exception {
    AgeException(String msg) { super(msg); }
} // This closing brace was missing
```

Usage:

```java
if (age < 18) {
    throw new AgeException("Age must be 18+");}
    
    
```

---

#
