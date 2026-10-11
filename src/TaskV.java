import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int lastTwoDigits = n % 100;
        int lastDigit = n % 10;
        String word;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            word = "korov";
        } else if (lastDigit == 1) {
            word = "korova";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            word = "korovy";
        } else {
            word = "korov";
        }

        System.out.println(n + " " + word);
    }
}