// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Lesson1;

public class Task1 {

    public static void main(String[] args) {

       int n = 1;
       System.out.printf("Треугольое число = %d\n", triangle(n));
       System.out.printf("Факториал = %d\n", factorial(n));
       
    }

    public static int triangle(int n){
        return ((n+1)*n)/2;
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}