import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a == 0) {
            System.out.println(b == 0 ? "INF" : "NO");
        } else if ((-b) % a == 0) {
            System.out.println((-b) / a);
        } else {
            System.out.println("NO");
        }
    }
}