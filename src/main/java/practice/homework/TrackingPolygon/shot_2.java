package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class shot_2 {
    public static void main(String[] args) {

        /*
        2. Написать программу, которая запрашивает у
        пользователя
        целое число и выводит на консоль
        положительное оно или отрицательное.
        */

        System.out.format("Please, Input any integer y %n");
        Scanner integer = new Scanner(System.in);
        int y = integer.nextInt();
        if (y >= 0){
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is negative");
        }

    }
}
