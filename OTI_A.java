class OTI_A {
    static int count = 0;  // Static variable to keep track of object count

    // Constructor for OTI_A
    OTI_A() {
        count++;
        System.out.println(count);  // Prints the current count
    }
}

class MOTI_A {
    public static void main(String args[]) {
        // Creating instances of OTI_A
        OTI_A a = new OTI_A();
        OTI_A a1 = new OTI_A();
        OTI_A a2 = new OTI_A();
    }
}
