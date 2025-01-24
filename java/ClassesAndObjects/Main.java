class Person {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    
}

public class Main {
    public static void main(String[] args) {
        // Creating an object
        Person person = new Person("Sheldon Cooper", 30);

        // Accessing methods
        person.displayDetails();

        // Modifying and accessing private fields using getters and setters
        person.setName("John Wick");
        person.setAge(50);

        System.out.println("Updated Name: " + person.getName()+"\n" + "Updated Age: " + person.getAge());
    }
}