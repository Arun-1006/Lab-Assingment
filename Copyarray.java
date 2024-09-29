public class Copyarray {


        public static void main(String args[]){
            int a[] = new int[6];
            int b[]= new int[6];

            a[0]=0;
            a[1]=6;
            a[2]=1;
            a[3]=2;
            a[4]=3;
            a[5]=4;

            b=a;
            System.out.println(b[0]);
            System.out.println(b[1]);
            System.out.println(b[2]);
            System.out.println(b[3]);
            System.out.println(b[4]);
            System.out.println(b[5]);
        }
    }

