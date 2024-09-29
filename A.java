public class A {
    int i,j;
    void show(){
        System.out.println(i+" "+j);
    }
}
class B extends A{
    int k=40;
    void add(){
        System.out.println(i+j+k);
    }
}
class single{
    public static void main(String[] args) {
        B b1 = new B();
	A a1 = new A();
        a1.i = 20;
        a1.j = 30 ;
        a1.show();
        b1.add();
    }
}
