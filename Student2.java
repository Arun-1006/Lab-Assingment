//Static method change example
class Student2{
    String name;
    int roll;
    static String Branch="IT";
    Student2(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    void display()
    {
        System.out.println(name+" "+roll+" "+Branch);

    }

	static void change()
	{
	Branch="CSE";
	}

}
class MStudent2{
    public static void main(String[] args) {
        Student2 s =new Student2("Arunshu",19);


        Student2 s1 =new Student2("Pratyush",40);


        s.display();
        s1.display();
	Student2.change();
	s.display();
	s1.display();

    }
}