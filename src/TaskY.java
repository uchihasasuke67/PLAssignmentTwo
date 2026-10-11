import java.util.Scanner;

public class TaskY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();

        StringBuilder result = new StringBuilder();

        if (y > 1) {
            result.append(x).append(' ').append(y - 1).append(' ');
        }
        if (x > 1) {
            result.append(x - 1).append(' ').append(y).append(' ');
        }
        if (y < n) {
            result.append(x).append(' ').append(y + 1).append(' ');
        }
        if (x < m) {
            result.append(x + 1).append(' ').append(y);
        }

        System.out.println(result.toString().trim());
    }
}