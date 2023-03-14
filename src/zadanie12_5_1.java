public class zadanie12_5_1 {
    // 12. Вывести случайное число от 11 до 22
    public static void main(String[] args) {
        double random = Math.random();
        double randomBig = random * 22 + 11; // {11:22}
        int randomBigFloor = (int) Math.floor(randomBig);
        System.out.println(randomBigFloor);
        random = Math.random();
        randomBig = random * 22 + 11;
        randomBigFloor = (int) Math.floor(randomBig);
        System.out.println(randomBigFloor);
        random = Math.random();
        randomBig = random * 22 + 11;
        randomBigFloor = (int) Math.floor(randomBig);
        System.out.println(randomBigFloor);
        random = Math.random();
        randomBig = random * 22 + 11;
        randomBigFloor = (int) Math.floor(randomBig);
        System.out.println(randomBigFloor);
    }
}
