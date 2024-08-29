import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrices n: ");
        int n = scanner.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[] X = new int[n];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            boolean allGreater = true;
            for (int j = 0; j < n; j++) {
                if (A[i][j] <= B[i][j]) {
                    allGreater = false;
                    break;
                }
            }
            X[i] = allGreater ? 1 : 0;
        }
        System.out.println("The vector X is:");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }
    }
}
