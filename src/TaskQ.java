import java.util.Scanner;

public class TaskQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean exists = a + b > c
                && a + c > b
                && b + c > a;

        System.out.println(exists ? "YES" : "NO");
    }
}