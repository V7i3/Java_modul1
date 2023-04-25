/* Реализовать простой калькулятор
* Введите первое число: 12
* Введите операцию: +
* Введите второе число: 1
* Ответ: 13
*/

package Lesson1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите операцию: ");
        char operation = in.next().charAt(0);

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        in.close();

        switch(operation){
            case '+':
                System.out.print(num1 + num2);
                break;
            case '-':
                System.out.print(num1 - num2);
                break;
            case '*':
                System.out.print(num1 * num2);
                break;
            case '/':
                System.out.print((float)num1 / num2);
                break;
            default:
                System.out.println("Неверная операция");
        }

    }
}
