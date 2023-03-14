import java.util.Scanner;

public class zadanie4_5_1 {
    // 4. Пользователь вводит, две строки. Найти разницу в длине.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two lines: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        System.out.println("The lengths of lines: ");
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("The difference between string lengths: ");
        System.out.println(Math.abs(len1 - len2));
    }
}