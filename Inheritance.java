 class person{
	String name;
	int age;
	person(String name, int age)
	{
	this.name=name;
	this.age=age;
	}
	void display()
	}
	System.out.println("This is person class");
	System.out.println("name+" "+age);
	}
    }

 class student extends person{
	String branch;
	int s-id;
	student(String name,int age,String branch,int s-id)
	{
	System.out.println(name.age);
	This branch=branch;
	This s-id=s-id;
	}
	
	void display()
	{
	System.out.println("This student class");
	System.out.println(name+" "+age+" "+branch+" "+s-id);
	}

}

class Inheritance{
public static void main(String args[]){
	person p= new student("Arun",19,"CS",10);
	p.display()
	}

   }


}