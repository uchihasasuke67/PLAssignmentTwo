import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b - sqrtD) / (2 * a);
            double root2 = (-b + sqrtD) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
    }
}