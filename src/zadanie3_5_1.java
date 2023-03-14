import java.util.Scanner;

public class zadanie3_5_1 {
    // 3. Решить предыдущую задачу, но Math.pow можно использовать только на одной строчке вашей программы(хоть и много раз)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s,]+");
        System.out.print("Enter three numbers (the divider is: ',' (...разделитель - запятая...)): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        System.out.println((int)Math.pow(x, y) + "; " + (int)Math.pow(Math.pow(x, y), z));
    }
}
