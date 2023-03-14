public class zadanie11_5_1 {
    // 11. Вывести случайную букву английского алфавита.
    public static void main(String[] args) {
        System.out.println("Выведено для примера пять случайных букв.");
        double random = Math.random();
        double randomBig = random * 26 + 97; // {буквы англ. алфавита находятся в диапазоне: 97:122}
        int randomBigFloor = (int) Math.floor(randomBig);
        char letter = (char) randomBigFloor;
        System.out.println(letter);

        random = Math.random();
        randomBig = random * 26 + 97; // {буквы англ. алфавита находятся в диапазоне: 97:122}
        randomBigFloor = (int) Math.floor(randomBig);
        letter = (char) randomBigFloor;
        System.out.println(letter);

        random = Math.random();
        randomBig = random * 26 + 97; // {буквы англ. алфавита находятся в диапазоне: 97:122}
        randomBigFloor = (int) Math.floor(randomBig);
        letter = (char) randomBigFloor;
        System.out.println(letter);

        random = Math.random();
        randomBig = random * 26 + 97; // {буквы англ. алфавита находятся в диапазоне: 97:122}
        randomBigFloor = (int) Math.floor(randomBig);
        letter = (char) randomBigFloor;
        System.out.println(letter);

        random = Math.random();
        randomBig = random * 26 + 97; // {буквы англ. алфавита находятся в диапазоне: 97:122}
        randomBigFloor = (int) Math.floor(randomBig);
        letter = (char) randomBigFloor;
        System.out.println(letter);

    }
}
