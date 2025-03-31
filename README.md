1. Class Definition
java
Copy
Edit
public class Student {
public: The class is accessible from anywhere in the program.

class Student: Defines a class named Student.

2. Private Attributes
java
Copy
Edit
private String name;
private int grade;
private: These attributes are only accessible within the class.

String name: Stores the student's name.

int grade: Stores the student's grade.

3. Constructor
java
Copy
Edit
public Student(String name, int grade) {
    this.name = name;
    setGrade(grade); // Using setter to ensure validation
}
public Student(String name, int grade): Constructor that initializes name and grade when an object is created.

this.name = name;: Assigns the provided name to the class variable.

setGrade(grade);: Uses the setter method to ensure the grade is within a valid range.

4. Getter and Setter for name
java
Copy
Edit
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
getName(): Returns the name of the student.

setName(String name): Allows updating the student's name.

5. Getter and Setter for grade with Validation
java
Copy
Edit
public int getGrade() {
    return grade;
}

public void setGrade(int grade) {
    if (grade >= 0 && grade <= 100) {
        this.grade = grade;
    } else {
        this.grade = 0; // Default to 0 if out of range
    }
}
getGrade(): Returns the current grade value.

setGrade(int grade):

If grade is between 0 and 100, it is stored.

Otherwise, it sets grade to 0 (ensures invalid values are not stored).





1. Class Definition
java
Copy
Edit
public class MathOperations {
public: The class is accessible from anywhere in the program.

class MathOperations: Declares the class named MathOperations.

2. Method Overloading
Method overloading allows multiple methods to have the same name but different parameters.

First multiply() Method – Multiplying Two Integers
java
Copy
Edit
public int multiply(int a, int b) {
    return a * b;
}
public int multiply(int a, int b):

This method takes two integer parameters (a and b).

Returns their product (a * b).

Second multiply() Method – Multiplying Three Integers
java
Copy
Edit
public int multiply(int a, int b, int c) {
    return a * b * c;
}
This method is overloaded to handle three integers.

It takes three integer parameters (a, b, and c).

Returns their product (a * b * c).

3. main() Method – Testing Overloaded Methods
java
Copy
Edit
public static void main(String[] args) {
    MathOperations mathOps = new MathOperations();
    
    System.out.println("Multiplication of 2 numbers: " + mathOps.multiply(3, 4)); // Output: 12
    System.out.println("Multiplication of 3 numbers: " + mathOps.multiply(2, 3, 4)); // Output: 24
}
Creates an object of MathOperations:

java
Copy
Edit
MathOperations mathOps = new MathOperations();
Calls multiply() with two numbers (3 and 4):

java
Copy
Edit
mathOps.multiply(3, 4);
Calls the first multiply() method.

3 * 4 = 12.

Prints: "Multiplication of 2 numbers: 12".

Calls multiply() with three numbers (2, 3, 4):
