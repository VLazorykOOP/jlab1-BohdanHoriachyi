import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius r: ");
        double r = scanner.nextDouble();
        System.out.print("Enter number of points n: ");
        int n = scanner.nextInt();
        double[] A = new double[2 * n];
        System.out.println("Enter the coordinates of the points:");
        for (int i = 0; i < 2 * n; i++) {
            A[i] = scanner.nextDouble();
        }
        int count = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            double x = A[i];
            double y = A[i + 1];
            if (Math.sqrt(x * x + y * y) <= r) {
                count++;
            }
        }
        System.out.println("Number of points inside the circle: " + count);
    }
}
