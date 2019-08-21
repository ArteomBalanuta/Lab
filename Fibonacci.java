
public class Fibonacci {
    private long[] start = new long[100];

    private Fibonacci() {
        start[0] = 0;
        start[1] = 1;
    }


    private static boolean isEvenInFibonacci(long numberPosition) {
        return numberPosition % 3 == 1;
    }

    private void getFibonacci() {
        for (int i = 0; i <= 50; i++) {
            long fNumber = start[i] + start[i + 1];
            start[2 + i] = fNumber;
            System.out.println(fNumber % 2 + "  " + fNumber);
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.getFibonacci();
        System.out.println(isEvenInFibonacci(5));
    }
}
