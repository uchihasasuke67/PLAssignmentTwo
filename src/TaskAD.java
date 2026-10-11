import java.util.Scanner;

public class TaskAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctAnswer = scanner.nextInt();
        int studentAnswer = scanner.nextInt();

        boolean correct = (correctAnswer == 1) == (studentAnswer == 1);
        System.out.println(correct ? "YES" : "NO");
    }
}