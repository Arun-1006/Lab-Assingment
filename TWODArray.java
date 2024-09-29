class  TDArray{
    public static void main(String[] args) {
        int a[][]= new int[4][4];
        System.out.println("Two-Dimensional Array: ");
        for (int i =0; i<4; i++){
            for (int j=0; j<4;j++){
                a[i][j]=j*2+3;
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}