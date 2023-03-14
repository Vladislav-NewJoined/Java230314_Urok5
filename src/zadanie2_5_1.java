import java.util.Scanner;

public class zadanie2_5_1 {
    // 2. Пользователь вводит три числа. Возвести 1 в степень 2, и результат в степень 3.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s,]+");
        System.out.print("Enter three numbers (the divider is: ',' (...разделитель - запятая...)): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double result1 = Math.pow(x, y);
        int res1 = (int) result1;
        System.out.println(res1);
        double result2 = Math.pow(result1, z);
        int res2 = (int) result2;
        System.out.println(res2);
    }
}
