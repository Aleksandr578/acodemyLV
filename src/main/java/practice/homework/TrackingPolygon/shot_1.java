package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class shot_1 {
    public static void main(String[] args) {


        /*
        1. Написать программу, которая запрашивает у пользователя
        целое число от 1 до 7 и выводит на консоль соотметствующий
        этому числу день недели.
        Пример:
        Ввод: 3
        Вывод: Wednesday
        Ввод: 5
        Вывод: Friday
        */

        System.out.format("Input an integer x within 1-7%n");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This value is not correct: " + x);
        }

    }
}
