import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        boolean possible = false;

        for (int fivePacks = 0; fivePacks * 5 <= k; fivePacks++) {
            if ((k - fivePacks * 5) % 3 == 0) {
                possible = true;
                break;
            }
        }

        System.out.println(possible ? "YES" : "NO");
    }
}