public class Student {
    String name;
    static String branch = "MCA";  // Static variable for branch
    int roll;

    // Constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Method to display student details
    void display() {
        System.out.println(name + " " + roll + " " + branch);
    }
}

class MStudent1 {
    public static void main(String[] args) {
        // Creating Student objects
        Student s = new Student("Arunshu", 19);
        Student s1 = new Student("Harry", 45);
        Student s2 = new Student("Pratyush", 60);

        // Displaying student details
        s.display();
        s1.display();
        s2.display();
    }
}
