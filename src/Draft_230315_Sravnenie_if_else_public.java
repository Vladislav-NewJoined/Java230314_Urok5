import java.util.Scanner;

public class Draft_230315_Sravnenie_if_else_public {
    // Cколько лет Вашему другу
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лет Вашему другу:");
        int age1 = scanner.nextInt();
        System.out.println("Сколько лет другому человеку:");
        int age2 = scanner.nextInt();
        int ageMaxManual = 0;
        if (age1 > age2) {
            ageMaxManual = age1;
        } else {
            ageMaxManual = age2;
        }
        System.out.println("Старшему из них: " + ageMaxManual);
        System.out.println("Разница составляет: " + Math.abs(age1 - age2));

        /* или ПЕРВЫЙ ВАРИАНТ
        if (age1 > age2) {
            ageMaxManual = age1;
        }
        if (age1 <= age2) {
            ageMaxManual = age2;
        }
        System.out.println("Старшему из них: " + ageMaxManual);
         */

        /* или ВТОРОЙ ВАРИАНТ
        if (x > 10) {
            System.out.println("x is big");
        } else if (x>100) {
            System.out.println("x is VERY big");
        } else {
            System.out.println("x is not so big");
            */
    }
}
