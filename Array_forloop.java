public class Array_forloop {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int [5];

        int i;
        for (i=0; i<5;i++)
            a[i]=i*4+2;
        b=a;
        for(i=0;i<2;i++){
            System.out.println(b[i]);
        }


    }
}
