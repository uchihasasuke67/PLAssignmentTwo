import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long change = c * 100 + d - (a * 100 + b);

        System.out.println((change / 100) + " " + (change % 100));
    }
}