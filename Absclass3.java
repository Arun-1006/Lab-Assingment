abstract class Absclass3 {
    void add()
    {
        System.out.println("This a very Smart boy");
    }

	abstract void add2();
}

class MAbs extends Absclass3 {
    void add1()
    {
        System.out.println("This is a good boy");
    }

	void add2()
	{
	System.out.println("Arun is very Handsome");
	}

    public static void main(String[] args) {
        MAbs ma1=new MAbs();
        ma1.add1();
        ma1.add();
	ma1.add2();
	}
    
}
