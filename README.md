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





Superclass: Animal
java
Copy
Edit
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
The Animal class contains a general method makeSound().

This method will be overridden in the subclasses.

2. Subclass: Dog
java
Copy
Edit
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
The Dog class inherits from Animal using extends.

It overrides makeSound() to provide a specific implementation ("Dog barks: Woof Woof!").

The @Override annotation ensures the method correctly overrides the superclass method.

3. Subclass: Cat
java
Copy
Edit
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
Similar to Dog, the Cat class inherits from Animal.

It overrides makeSound() to provide its own implementation ("Cat meows: Meow Meow!").

4. Demonstrating Polymorphism
java
Copy
Edit
public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Dog object with Animal reference
        Animal myCat = new Cat(); // Cat object with Animal reference

        myDog.makeSound(); // Calls Dog's overridden method
        myCat.makeSound(); // Calls Cat's overridden method
    }
}
Key Concepts Demonstrated:
✅ Polymorphism:

Animal myDog = new Dog(); and Animal myCat = new Cat(); demonstrate dynamic method dispatch.

The method called is based on the actual object type (Dog or Cat), not the reference type (Animal).

✅ Dynamic Method Dispatch:

When myDog.makeSound() is called, Java dynamically determines that myDog is a Dog, so it calls Dog's makeSound().

Similarly, myCat.makeSound() calls Cat's overridden method.

Expected Output
yaml
Copy
Edit
Dog barks: Woof Woof!
Cat meows: Meow Meow!
This output shows how Java correctly calls the overridden methods of the respective subclasses.








1. Abstract Class: Appliance
java
Copy
Edit
abstract class Appliance {
    // Abstract method to be implemented by subclasses
    abstract void turnOn();
}
The Appliance class is abstract (using abstract keyword), meaning it cannot be instantiated.

It contains an abstract method turnOn(), which has no implementation.

The subclasses (Fan and TV) must implement this method.

2. Subclass: Fan
java
Copy
Edit
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now spinning!");
    }
}
Fan inherits from Appliance using extends.

It implements the turnOn() method with specific behavior: "Fan is now spinning!".

3. Subclass: TV
java
Copy
Edit
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now displaying channels!");
    }
}
TV inherits from Appliance and implements turnOn().

It provides its own behavior: "TV is now displaying channels!".

4. Demonstrating Abstraction
java
Copy
Edit
public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance myFan = new Fan(); // Fan object
        Appliance myTV = new TV();   // TV object

        myFan.turnOn(); // Calls Fan's turnOn() method
        myTV.turnOn();  // Calls TV's turnOn() method
    }
}
Objects are created using superclass references (Appliance):

java
Copy
Edit
Appliance myFan = new Fan();
Appliance myTV = new TV();
This demonstrates polymorphism because the actual method called is based on the object type.

When calling myFan.turnOn();, it executes Fan's implementation.

When calling myTV.turnOn();, it executes TV's implementation.








Expected Output
csharp
Copy
Edit
Fan is now spinning!
TV is now displaying channels!
This confirms that each subclass implements the abstract method differently.
