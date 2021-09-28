package practice.homework;

import java.util.Scanner;

public class TrackingPolygon {
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

        /*
        5. Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наибольшее из них.
        Нельзя пользоваться классом Math, можно использовать только if else.
         */

        /*
        6. Написать программу, которая запрашивает у пользователя
        три целых числа и выводит на консоль наибольшее из них.

        PS: перед решением этой задачи распишите на бумаге
        или в коментарии все возможные варианты (комбинации).
        Это поможет вам правильно написать программу!
        Нельзя пользоваться классом Math.
         */

        /*
        7. Вопрос интервью супер популярный
        Создайте класс FizzBuzz.
        В классе FizzBuzz создайте метод со следующей сигнатурой:

        class FizzBuzz {

        public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
        }

        }

        Создайте класс FizzBuzzTest и напишите автоматические тесты,
        которые покрывают все возможные сценарии.
         */

        /*
        8. Запрос числа:

        System.out.println("Please.enter number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Строка:

        String text = input.nextLine();
         */

        /*
        9. Напишите программу, в которой:
        - запросите у пользователя с консоли длину массива
        - создайте массив указанной пользователем длины
        - заполните массив числами полученными от пользователя
        - распечатайте на консоль все элементы массива.
         */

        /*
        10. Напишите программу, в которой:
        - создайте массив произвольной длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива
        - найдите наименьшее число в массиве и выведети его на консоль.
         */


            }}