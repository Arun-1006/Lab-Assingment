class MatrixAddition {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("First Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = j * 2 + 5;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = j * 2 + 5;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}