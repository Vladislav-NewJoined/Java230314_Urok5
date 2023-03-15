// Инфо здесь: https://www.geeksforgeeks.org/basic-calculator-program-using-java/

import java.lang.*;
import java.util.Scanner;

public class zadanie8_5_1 {
/*8. Решить предыдущую задачу, но операции считать по приоритету
(умножение и деление выше сложения вычитания). Предыдущий пример даст
ответ 11 + 80 равно 91 */

    public static void main(String[] args) {
        // stores three numbers
        double num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first two numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the first operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        double o = 0;
        double o2 = 0;
        double o3 = 0;
        double o4 = 0;

        switch (op) {

            // case to add two numbers
            case '+':
                o = num1 + num2;
                System.out.println("The first result:");
                // print the first result
                System.out.println(num1 + " " + op + " " + num2
                        + " = " + o);
                break;

            // case to subtract two numbers
            case '-':
                o2 = num1 - num2;
                System.out.println("The first result:");
                // print the first result
                System.out.println(num1 + " " + op + " " + num2
                        + " = " + o2);
                break;

            // case to multiply two numbers
            case '*':
                o3 = num1 * num2;
                System.out.println("The first result:");
                // print the first result
                System.out.println(num1 + " " + op + " " + num2
                        + " = " + o3);
                break;

            // case to divide two numbers
            case '/':
                o4 = num1 / num2;
                System.out.println("The first result:");
                // print the first result
                System.out.println(num1 + " " + op + " " + num2
                        + " = " + o4);
                break;

            default:
                System.out.println("You enter wrong input");
        }

        //System.out.println("The first result:");
        // print the first result
        //System.out.println(num1 + " " + op + " " + num2
        //        + " = " + o);

        System.out.println("Enter the third number");
        num3 = sc.nextDouble();
        System.out.println("Enter the second operator (+,-,*,/)");

        char op2 = sc.next().charAt(0);
        double o5 = 0;
        double o6 = 0;
        double o7 = 0;
        double o8 = 0;
        double o9 = 0;
        double o10 = 0;
        double o11 = 0;
        double o12 = 0;
        double o13 = 0;
        double o14 = 0;
        double o15 = 0;
        double o16 = 0;
        double o17 = 0;
        double o18 = 0;
        double o19 = 0;
        double o20 = 0;

        switch (op) {

            // case to add the third number
            case '+':
                switch (op2) {
                    case '+':
                        o5 = num1 + num2 + num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 + " = " + o5);
                        break;
                    case '-':
                        o6 = num1 + num2 - num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 + " = " + o6);
                        break;
                    case '*':
                        o7 = num1 + (num2 * num3);
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + "(" + num2 + " " + op2 + " " + num3 + ")" +
                                " = " + o7);
                        break;
                    case '/':
                        o8 = num1 + (num2 / num3);
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + "(" + num2 + " " + op2 + " " + num3 + ")" +
                                " = " + o8);
                        break;
                    default:
                        System.out.println("You enter wrong input");
                }
                break;

            // case to subtract the third number
            case '-':
                switch (op2) {
                    case '+':
                        o9 = num1 - num2 + num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o9);
                        break;
                    case '-':
                        o10 = num1 - num2 - num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o10);
                        break;
                    case '*':
                        o11 = num1 - (num2 * num3);
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + "(" + num2 + " " + op2 + " " + num3 + ")" +
                                " = " + o11);
                        break;
                    case '/':
                        o12 = num1 - (num2 / num3);
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + "(" + num2 + " " + op2 + " " + num3 + ")" +
                                " = " + o12);
                        break;
                    default:
                        System.out.println("You enter wrong input");
                }
                break;

            // case to multiply the third number
            case '*':
                switch (op2) {
                    case '+':
                        o13 = num1 * num2 + num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o13);
                        break;
                    case '-':
                        o14 = num1 * num2 - num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o14);
                        break;
                    case '*':
                        o15 = num1 * num2 * num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o15);
                        break;
                    case '/':
                        o16 = num1 * num2 * num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o16);
                        break;
                    default:
                        System.out.println("You enter wrong input");
                }
                break;

            // case to divide the third number
            case '/':
                switch (op2) {
                    case '+':
                        o17 = num1 / num2 + num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o17);
                        break;
                    case '-':
                        o18 = num1 / num2 - num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o18);
                        break;
                    case '*':
                        o19 = num1 / num2 * num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o19);
                        break;
                    case '/':
                        o20 = num1 / num2 / num3;
                        System.out.println("The final result:");
                        System.out.println(num1 + " " + op + " " + num2 + " " + op2 + " " + num3 +
                                " = " + o20);
                        break;
                    default:
                        System.out.println("You enter wrong input");
                }
                break;

            default:
                System.out.println("You enter wrong input");
        }
    }
}
