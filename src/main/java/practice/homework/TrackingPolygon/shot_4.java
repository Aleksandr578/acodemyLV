package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class shot_4 {
    public static void main(String[] args) {

        /*
        4. Написать программу, которая запрашивает у пользователя
        целое число и выводит на консоль чётное оно или нет.

        Подсказка: используйте для определения чётное число или нет
        операцию остаток от деления (%). Если остаток от деления на 2
        равен нулю то число чётное, иначе не чётное.
         */

        System.out.format("Please, Input any integer b %n");
        Scanner integer2 = new Scanner(System.in);
        int b = integer2.nextInt();
        int a = b% 2;
        if (a == 0){
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
