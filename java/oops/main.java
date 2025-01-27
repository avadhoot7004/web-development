class Animal {
    // Method Overloading
    void sound() {
        System.out.println("Animals make sounds");
    }

    void sound(String type) {
        System.out.println("Animal sound: " + type);
    }
}
// Single Inheritance from class Animal
class Dog extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("bark");
    }
}

// Multilevel Inheritance as Puppy -> Dog -> Animal
class Puppy extends Dog {
    @Override
    void sound() {
        System.out.println("whine");
    }
}

// Hierarchical Inheritance as Animal class has multiple child classes
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Multiple Inheritance using Interfaces; usually multiple inheritance is not supported in java because of ambiguity
interface Flyable {
    void fly();
}

interface Swimable {
    void swim();
}

class Bird implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Bird flies");
    }

    @Override
    public void swim() {
        System.out.println("Bird swims");
    }
}

public class main {
    public static void main(String[] args) {
        // Single Inheritance
        Animal myAnimal = new Animal();
        myAnimal.sound();
        myAnimal.sound("Roar");

        Dog myDog = new Dog();
        myDog.sound(); // Overridden method

        // Multilevel Inheritance
        Puppy myPuppy = new Puppy();
        myPuppy.sound(); // Puppy class method

        // Hierarchical Inheritance
        Cat myCat = new Cat();
        myCat.sound(); // Cat class method

        // Multiple Inheritance using Interfaces
        Bird myBird = new Bird();
        myBird.fly();
        myBird.swim();
    }
}
