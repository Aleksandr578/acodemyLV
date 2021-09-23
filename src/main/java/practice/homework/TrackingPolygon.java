package practice.homework;

public class TrackingPolygon {
    public static void main(String[] args) {


        /*
        Написать программу, которая запрашивает у пользователя
        целое число от 1 до 7 и выводит на консоль соотметствующий
        этому числу день недели.
        Пример:
        Ввод: 3
        Вывод: Wednesday
        Ввод: 5
        Вывод: Friday
        */

        String anInteger = "i";
        String text = "Input an integer within 1-7";

        int dayOfTheWeek = 3;

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            default:
                System.out.println("This value is not correct: " + dayOfTheWeek);
        }




    }
}
