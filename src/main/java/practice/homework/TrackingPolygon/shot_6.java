package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class shot_6 {
    public static void main(String[] args) {

        /*
        6. Написать программу, которая запрашивает у пользователя
        три целых числа и выводит на консоль наибольшее из них.

        PS: перед решением этой задачи распишите на бумаге
        или в коментарии все возможные варианты (комбинации).
        Это поможет вам правильно написать программу!
        Нельзя пользоваться классом Math.
         */

        System.out.format("Please, Input any integer Q, any integer S  and any integer E%n");
        Scanner integer4 = new Scanner(System.in);
        int Q = integer4.nextInt();
        int S = integer4.nextInt();
        int E = integer4.nextInt();
        if (Q > S && Q > E){
            System.out.println("This integer is biger - " + Q);
        } else if (S > Q && S > E){
            System.out.println("This integer is biger - " + S);
        } else {
            System.out.println("This integer is biger - " + E);
        }

    }
}
