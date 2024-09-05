import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Введіть число x: ");
        String inputX = scanner.nextLine();
        System.out.print("Введіть число y: ");
        String inputY = scanner.nextLine();

        try {
            // Спроба перетворити введення на цілі числа
            int xInt = Integer.parseInt(inputX);
            int yInt = Integer.parseInt(inputY);

            // Обчислення для цілих чисел (варіант 2)
            double resultFromInt = calculateExpression(xInt, yInt);
            System.out.println("Варіант 2 (цілі числа, результат – дійсного типу): " + resultFromInt 
                               + ", тип даних: " + ((Object) resultFromInt).getClass().getSimpleName());

        } catch (NumberFormatException e1) {
            try {
                // Якщо введення не є цілими числами, перевіримо чи є вони дійсними
                double xDouble = Double.parseDouble(inputX);
                double yDouble = Double.parseDouble(inputY);

                // Обчислення для дійсних чисел (варіант 1)
                double resultDouble = calculateExpression(xDouble, yDouble);
                System.out.println("Варіант 1 (дійсні числа, результат – дійсного типу): " + resultDouble 
                                   + ", тип даних: " + ((Object) resultDouble).getClass().getSimpleName());

                // Обчислення з перетворенням на ціле число (варіант 3)
                int resultInt = (int) Math.round(resultDouble);
                System.out.println("Варіант 3 (дійсні числа, результат – цілого типу): " + resultInt 
                                   + ", тип даних: " + ((Object) resultInt).getClass().getSimpleName());

            } catch (NumberFormatException e2) {

                System.out.println("Помилка: введені дані не є числом.");
            }
        }
    }

    public static double calculateExpression(double x, double y) {
        return (x * y) + (Math.pow(x + y, 3) / (Math.pow(x, 2) + Math.pow(y, 2)) * (x - y));
    }
}


