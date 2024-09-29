public class Array2 {
    public static void main(String[] args) {
        int a[];
        a = new int[5];
        int i=0;
        a[0]=2;
        a[1]=5;
        a[2]=3;
        a[3]=7;
        a[4]=19;
        int max=a[0];

        for (i=1; i<5;i++)
        {
            if (a[i] > max)
            {
            max=a[i];
             }

        }
        System.out.println(max);
    }
}
