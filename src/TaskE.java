import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row1 = scanner.nextInt();
        int col1 = scanner.nextInt();
        int row2 = scanner.nextInt();
        int col2 = scanner.nextInt();

        int rowDiff = Math.abs(row1 - row2);
        int colDiff = Math.abs(col1 - col2);

        boolean attacks = (rowDiff == 1 && colDiff == 2)
                || (rowDiff == 2 && colDiff == 1);

        System.out.println(attacks ? "YES" : "NO");
    }
}