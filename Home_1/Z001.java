package Home_1;
//Реализовать функцию возведения числа а в степень b. a, b – целые числа.

//
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1

import java.util.Scanner;

public class Z001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.print("Введите степень числа: ");
        int sqrNum = scanner.nextInt();
        scanner.close();
        
        expWithoutRec(num, sqrNum);

    }    
    
        private static void expWithoutRec(int x, int y) {
            int x1 = x;
            int y1 = y;
            while (y > 1) {
                x *= x1;
                y--;
            }
            System.out.println("Число  "+ x1 + " в степени  " + y1 + " равно " + x);
        }

    }


