import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();

        boolean attacks = row1 == row2
                || col1 == col2
                || Math.abs(row1 - row2) == Math.abs(col1 - col2);

        System.out.println(attacks ? "YES" : "NO");
    }
}