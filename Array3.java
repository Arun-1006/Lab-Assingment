public class Array3 {
    public static void main(String[] args) {
        int a[]=new int[2];
        int b[]=new int [5];

        int i;
        for (i=0; i<2;i++)
            a[i]=i*2+1;
        b=a;
        for(i=0;i<5;i++){
            System.out.println(b[i]);
        }


    }
}
