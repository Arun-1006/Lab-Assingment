//Static method example
class Student1{
    String name;
    int roll;
    static String Branch="IT";
    Student1(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    void display()
    {
        System.out.println(name+" "+roll+" "+Branch);

    }

}
class MStudent1{
    public static void main(String[] args) {
        Student1 s =new Student1("Arunshu",19);


        Student1 s1 =new Student1("Pratyush",40);


        s.display();
        s1.display();

    }
}