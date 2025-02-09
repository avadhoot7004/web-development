//Inheritance and method overloading
class Parent {
    void parentMethod() {
        System.out.println("From parent class");
    }
    void parentMethod(int age) {
        System.out.println("Age is: " + age);
    }
}

class Child extends Parent {
    @Override 
    void parentMethod() {
        System.out.println("Overridden parent method from child");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.parentMethod();
        obj1.parentMethod(45);

        Child obj2 = new Child();
        obj2.parentMethod();
        System.out.print("Inherited method from parent class-> ");
        obj2.parentMethod(50);
    }
}