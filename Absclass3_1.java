abstract class Absclass3_1 {
    void add()
    {
        System.out.println("He a very Smart boy");
    }

	abstract void add2();
}

abstract class MAbs extends Absclass3_1 {
    void add()
    {
        System.out.println("He is a good boy");
    }
}

class MAbs1 extends MAbs{
	void add2()
	{
	System.out.println("Arun is very Handsome");
	}

    public static void main(String[] args) {
        MAbs1 ma1=new MAbs1();
        ma1.add2();
        ma1.add();
	}
    
}
