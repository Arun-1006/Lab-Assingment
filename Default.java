class Default{
    int a= 20;
    double b=5000;
    String s ="Arunshu";
    Default(){
        System.out.println("Default constructor Activated!");
        System.out.println(a+" "+b+" "+s);
    }
}
class DefaultMain {
    public static void main(String[] args) {
        Default d1= new Default();
    }
}