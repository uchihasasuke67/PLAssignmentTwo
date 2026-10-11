import java.util.Arrays;
import java.util.Scanner;

public class TaskAE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        };

        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}