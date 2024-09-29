class MethodOverloading {
    int a;
    double b;
    String s ;
    void add (int a , double b){
        System.out.println("Method overloading !");
        this.a= a;
        this.b= b;

    }
    void add(int a,double b, String s){
        this.add(a,b);
        this.s=s;
        System.out.println(a+" "+b+" "+s);
    }

}
class MethodOverloadingMain{
    public static void main(String[] args) {
        MethodOverloading a1= new MethodOverloading();
        a1.add(10,20);
        a1.add(20,40,"Arunshu");

    }

}
