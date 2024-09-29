class Person {
    String name;
    int age;

    // Constructor for Person class
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method in Person class
    void display() {
        System.out.println("This is the Person class");
        System.out.println(name + " " + age);
    }
}

// Student class that extends Person
class Student extends Person {
    String branch;
    int sId; // sId instead of s-id (variable names can't have hyphens)

    // Constructor for Student class
    Student(String name, int age, String branch, int sId) {
        // Super keyword to call the parent (Person) constructor
        super(name, age);
        this.branch = branch;
        this.sId = sId;
    }

    // Overriding display method in Student class
    @Override
    void display() {
        System.out.println("This is the Student class");
        System.out.println(name + " " + age + " " + branch + " " + sId);
    }
}

// Main class to demonstrate inheritance
class Inheritance2 {
    public static void main(String[] args) {
        // Creating an instance of Student, but reference type is Person
        Person p = new Student("Arun", 19, "CS", 10);
        p.display(); // This will call the overridden display() method in Student class
    }
}
