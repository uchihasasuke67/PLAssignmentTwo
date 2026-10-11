import java.util.Arrays;
import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] sides = {
                scanner.nextLong(),
                scanner.nextLong(),
                scanner.nextLong()
        };

        Arrays.sort(sides);
        long b = sides[0];
        long c = sides[1];
        long a = sides[2];

        if (b + c <= a) {
            System.out.println("impossible");
        } else {
            long largestSquared = a * a;
            long otherSquared = b * b + c * c;

            if (largestSquared == otherSquared) {
                System.out.println("right");
            } else if (largestSquared < otherSquared) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }
    }
}