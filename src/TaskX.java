import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] rides = {1, 5, 10, 20, 60};
        int[] prices = {15, 70, 125, 230, 440};

        int limit = n + 59;
        long[] dp = new long[limit + 1];
        int[] previousTicket = new int[limit + 1];

        for (int i = 1; i <= limit; i++) {
            dp[i] = Long.MAX_VALUE;

            for (int ticket = 0; ticket < rides.length; ticket++) {
                int previous = i - rides[ticket];

                if (previous >= 0 && dp[previous] != Long.MAX_VALUE
                        && dp[previous] + prices[ticket] < dp[i]) {
                    dp[i] = dp[previous] + prices[ticket];
                    previousTicket[i] = ticket;
                }
            }
        }

        int bestRides = n;
        for (int total = n + 1; total <= limit; total++) {
            if (dp[total] < dp[bestRides]
                    || (dp[total] == dp[bestRides] && total > bestRides)) {
                bestRides = total;
            }
        }

        int[] counts = new int[rides.length];
        int total = bestRides;

        while (total > 0) {
            int ticket = previousTicket[total];
            counts[ticket]++;
            total -= rides[ticket];
        }

        for (int i = 0; i < counts.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(counts[i]);
        }
        System.out.println();
    }
}