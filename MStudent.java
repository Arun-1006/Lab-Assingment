 class Student {
    String name;
    static String branch ="MCA";
    int roll;
    Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;

    }
    void display()
    {
        System.out.println(name+" "+roll+" "+branch);
    }

}
class MStudent{
    public static void main(String[] args) {
        Student s =new Student("Arunshu",19);
        Student s1 =new Student("Harry",45);
        Student s2 =new Student("Pratyush",60);
        s.display();
        s1.display();
        s2.display();
    }
}
