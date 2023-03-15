public class zadanie9_5_1 {
    // 9. Вывести английский алфавит
    public static void main(String[] args) {
        int charCode = 97;
        char value = (char) charCode;

        while (charCode < 123) {
            System.out.println(value);
            charCode++;
            value = (char) charCode;
        }
    }
}
