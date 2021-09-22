package practice;

public class PrimitiveType {
    public static void main(String[] args) {

        // Double primitiv type practice

        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;

        //Floot primitive type practice

        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 1000.1f;

        int i = 0;

        while (i <= 100) {
            System.out.println("Alexander is professional QA for all " + i + "%!");

            switch (i) {
                case 0 : System.out.println("Work harder"); break;
                case 30 : System.out.println("Good start"); break;
                case 60 : System.out.println("One more effort, please"); break;
                case 100 : System.out.println("Nice! You are employed"); break;
            }
            i = i + 10;
        }

        //Int primitive type practice

        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        int firstVariable = 200;
        int secondVariable = 400;

System.out.println(Integer.max(firstVariable, secondVariable));
System.out.println(Integer.compare(firstVariable, secondVariable));

        //Method coll
        printHelloWorld();

        //String

        String myName = "Aleksandr";
        String lastName = "Ionov";
        System.out.println(myName + " " + lastName);
        System.out.format("%s %s%n", myName, lastName);
        String nameAndUserName = String.format("%s %s", myName, lastName);
        System.out.println(nameAndUserName);

        // Boolean

        boolean isStudent = true;
    }

    // Method declaration
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }
}

