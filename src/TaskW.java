import java.util.Scanner;

public class TaskW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long bestCost = Long.MAX_VALUE;
        long bestOne = 0;
        long bestTen = 0;
        long bestSixty = 0;

        long[] sixtyOptions = {n / 60, (n + 59) / 60};

        for (long sixty : sixtyOptions) {
            long remaining = Math.max(0, n - sixty * 60);

            long tenFloor = remaining / 10;
            long[] tenOptions = {tenFloor, (remaining + 9) / 10};

            for (long ten : tenOptions) {
                long one = Math.max(0, remaining - ten * 10);
                long cost = sixty * 440 + ten * 125 + one * 15;

                if (cost < bestCost) {
                    bestCost = cost;
                    bestOne = one;
                    bestTen = ten;
                    bestSixty = sixty;
                }
            }
        }

        System.out.println(bestOne + " " + bestTen + " " + bestSixty);
    }
}