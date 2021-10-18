package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class shot_3 {
    public static void main(String[] args) {

        /*
        3. Написать программу, которая запрашивает у пользователя
        целое число и выводит на консоль
        положительное оно, отрицательное или равно нулю.
         */

        System.out.format("Please, Input any integer z %n");
        Scanner integer1 = new Scanner(System.in);
        int z = integer1.nextInt();

        if (z > 0){
            System.out.println("This number is positive");
        } else if (z < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is zero");
        }

    }
}
