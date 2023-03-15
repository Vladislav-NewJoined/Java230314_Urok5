// Инфо здесь: https://www.geeksforgeeks.org/basic-calculator-program-using-java/

import java.lang.*;
import java.util.Scanner;

public class zadanie7_5_1 {
    /*7. Сделать калькулятор для трех чисел: пользователь вводит первое, потом
    оператор, второе, оператор, третье. Посчитать первое на второе, потом
    результат с третьим. Пример:
            11
            +
            4
            *
            20
    Вывод: 300 */
    public static void main(String[] args) {
        // stores three numbers
        double num1, num2, num3;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the fist two numbers");
        // take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the first operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {

            // case to add two numbers
            case '+':
                o = num1 + num2;
                break;

            // case to subtract two numbers
            case '-':
                o = num1 - num2;
                break;

            // case to multiply two numbers
            case '*':
                o = num1 * num2;
                break;

            // case to divide two numbers
            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The first result:");
        // print the first result
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
        System.out.println("Enter the third number");
        num3 = sc.nextDouble();
        System.out.println("Enter the second operator (+,-,*,/)");

        char op2 = sc.next().charAt(0);
        double o2 = 0;

        switch (op2) {

            // case to add the third number
            case '+':
                o2 = o + num3;
                break;

            // case to subtract the third number
            case '-':
                o2 = o - num3;
                break;

            // case to multiply the third number
            case '*':
                o2 = o * num3;
                break;

            // case to divide the third number
            case '/':
                o2 = o / num3;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");

        // print the final result
        System.out.println(o + " " + op2 + " " + num3
                + " = " + o2);
    }
}