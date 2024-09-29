class AnonymousArray{
    static void show(int a[]){
        System.out.println("Anonymous Array: ");
        for (int i=0; i< a.length; i++)
            System.out.println(a[i]+" ");
    }
    public static void main(String args[]){
        show(new int[]{1,2,3,4,5,6,7});
    }
}