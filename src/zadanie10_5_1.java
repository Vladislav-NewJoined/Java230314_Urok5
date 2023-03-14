import java.util.Scanner;

public class zadanie10_5_1 {
    // 10. Пользователь вводит N. Вывести букву английского алфавита по счету N.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number from 1 to 26: ");
        int num = scanner.nextInt();
        int letterCode = num + 96;
        //System.out.println(letterCode);
        char letter = (char) letterCode;
        System.out.println(letter);
    }
}