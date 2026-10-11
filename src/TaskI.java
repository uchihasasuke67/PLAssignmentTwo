import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        if (a == 0) {
            System.out.println(b == 0 ? "INF" : "NO");
            return;
        }

        if ((-b) % a != 0) {
            System.out.println("NO");
            return;
        }

        long x = (-b) / a;

        if (c * x + d == 0) {
            System.out.println("NO");
        } else {
            System.out.println(x);
        }
    }
}