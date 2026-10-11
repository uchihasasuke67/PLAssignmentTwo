import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean possible = (k % n == 0 && k / n < m)
                || (k % m == 0 && k / m < n);

        System.out.println(possible ? "YES" : "NO");
    }
}