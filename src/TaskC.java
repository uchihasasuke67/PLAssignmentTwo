import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();

        if (Math.abs(row1 - row2) == Math.abs(col1 - col2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}