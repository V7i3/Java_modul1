// Вывести все простые числа от 1 до 1000
package Lesson1;

public class Task2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){
            for(int j = 2; j <= Math.sqrt(i) + 1; j++){
                if (i%j == 0){
                    //System.out.printf("%d ", i); 
                    break;
                }
                if (j == Math.sqrt(i) + 1 && i%j != 0){
                    System.out.printf("%d ", i); 
                }
            }
        }
    }
}
