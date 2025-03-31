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

