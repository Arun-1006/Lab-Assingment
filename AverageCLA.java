class AverageCLA {
    public static void main(String args[]) {

        int a, b;
        int c = 0;
        double avg;

        for (int i = 0; i < args.length; i++) {
            a = Integer.parseInt(args[i]);
            c = c + a;
        }

        avg = c / args.length;
        System.out.println("Average = " + avg);
    }
}