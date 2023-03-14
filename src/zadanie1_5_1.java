import java.util.Scanner;

public class zadanie1_5_1 {
    // 1. Пользователь вводит два числа. Возвести второе в степень первого
    public static void main(String[] args) {
        System.out.println("Please enter exponentiation expression: \nThe example (the divider is 'Enter' key): 2 ^ 3");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double y = scanner.nextDouble();
        if (operator == '^') {
            System.out.println(Math.pow(y, x));
        }
    }
}