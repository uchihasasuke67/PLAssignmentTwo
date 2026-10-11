import java.util.Scanner;

public class TaskAA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean hasEven = a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
        boolean hasOdd = a % 2 != 0 || b % 2 != 0 || c % 2 != 0;

        System.out.println(hasEven && hasOdd ? "YES" : "NO");
    }
}