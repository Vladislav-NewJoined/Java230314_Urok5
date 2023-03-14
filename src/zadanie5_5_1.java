import java.util.Scanner;

public class zadanie5_5_1 {
    // 5. Пользователь вводит три строки. Найти разницу в длине самой короткой и самой длинной.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three lines (by the Enter key): ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        System.out.println("The string's lengths: ");
        System.out.println(len1);
        System.out.println(len2);
        System.out.println(len3);

        int maxInt = Math.max(len1, len2);
        int max = Math.max(maxInt, len3);
        int minInt = Math.min(len1, len2);
        int min = Math.min(minInt, len3);
        int differ = max - min;

        System.out.println("The difference between max and min string lengths: ");
        System.out.println(differ);
    }
}
