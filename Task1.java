import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        double result = (x * y) + (Math.pow((x + y), 3) / (Math.pow(x, 2) + Math.pow(y, 2))) * (x - y);
        System.out.println("result: " + result);
    }
}
