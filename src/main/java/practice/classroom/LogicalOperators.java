package practice.classroom;

public class LogicalOperators {
    public static void main(String[] args) {

        // Conditional statement
        // operator: if
        //switch

        /*
       if(condition) {
       //code
       }
        */

        //Boolean Variable Expression

       boolean isStudent = true;

       if(isStudent) {
           System.out.println("He can ask for ISIC card");
       }

       boolean result = 10 > 0;

       if (4 > 5) {
           System.out.println("Yes, 10 > 0");
       }
       boolean isEmployee = true;
       if(isEmployee) {
           System.out.println("Yes, this person is {COMPANY} employee!");
       } else {
           System.out.println("No, this person is not {COMPANY} employee");
       }


       // Inline expression

        if (1 > 0) {
            System.out.println("Yes 1>0");
        } else  {
            System.out.println("1 < 0");
        }
       int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("yes, this is true");
        } else {
            System.out.println("no, this is false");
        }



        // logical operators OR AND
        // || - OR
        // && - AND

        int speedMercedes = 40;
        int speedBmw = 50;
        int speedPorche = 200;

        if (speedBmw > speedMercedes && speedBmw > speedPorche) {
            System.out.println("Yes, Bmw ist the grate");
        } else {
            System.out.println("Something went wrong");
        }

        // OR ||

        if (speedBmw < speedMercedes || speedBmw > 100) {
            System.out.println("Speed bmw is less then mercedes or speed bmw is greather then porche speed");
        } else {
            System.out.println("Something went wrong");
        }


            boolean isStudent1 = true;
            boolean isLecturer = false;

        if (isLecturer) {
            System.out.println("Yes, this person is a Lecturer");
        } else if (isStudent1) {
            System.out.println("Yes, this is Student");
        } else {
            System.out.println("GTFO!");
        }

        // operator: switch

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
                break;
            default:
                System.out.println("This value is not correct: " + dayOfTheWeek);
        }


    }
}
