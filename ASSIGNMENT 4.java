
class Animal {
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}


public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat(); 

        myDog.makeSound(); 
        myCat.makeSound(); 
    }
}