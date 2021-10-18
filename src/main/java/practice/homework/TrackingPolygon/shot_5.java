package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class shot_5 {
    public static void main(String[] args) {

         /*
        5. Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наибольшее из них.
        Нельзя пользоваться классом Math, можно использовать только if else.
         */

        System.out.format("Please, Input any integer W and any integer V%n");
        Scanner integer3 = new Scanner(System.in);
        int W = integer3.nextInt();
        int V = integer3.nextInt();
        if (W > V){
            System.out.println("This integer is biger - " + W);
        } else {
            System.out.println("This integer is biger - " + V);
        }

    }
}
