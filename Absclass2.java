abstract class Absclass2 {
    void add()
    {
        System.out.println("This is add method");
    }
	abstract void add2();
}

abstract class MAbs extends Absclass2 {
    void add()
    {
        System.out.println("This is very Medium");
    }

    public static void main(String[] args) {
        MAbs ma= new MAbs();
        ma.add();
        ma.add2();
	}
    
}
