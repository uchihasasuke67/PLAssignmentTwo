import java.util.Scanner;

public class TaskAC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        if (x > 0) {
            System.out.println(1);
        } else if (x < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}