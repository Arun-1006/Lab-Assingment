abstract class Absclass1 {
    void add()
    {
        System.out.println("This is add method");
    }
   abstract void add2();
}
class MAbs extends Absclass1 {
    void add2()
    {
        System.out.println("This is very Medium");
    }

    public static void main(String[] args) {
        MAbs ma=new MAbs();
        ma.add();
        ma.add2();

    }
}
