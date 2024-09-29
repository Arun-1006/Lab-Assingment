abstract class Absclass {
    void add()
    {
        System.out.println("This is add method");
    }
}
class MAbs extends Absclass{
    void add1()
    {
        System.out.println("This derived class");
    }

    public static void main(String[] args) {
        MAbs ma=new MAbs();
        ma.add();
        ma.add1();

    }
}
