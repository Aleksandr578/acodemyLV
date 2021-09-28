package practice.classroom;

public class LoopPractice {
    public static void main(String[] args) {

        // for

        /*

        for (statement1; statement2; statement3) {
        // code block to be executed
        }

        statement 1 - is executed (one time) of the code block
        // Initialise counter variable: (int i = 0);

        statement 2 - define the condition for executing the code block
        // Boolean condition
        // Element list = 10
        // i < 10

        //statement 3 - is executed (every time) after the code block has been executed
        // Increment/Decrement counter variable
         */

        for (int i = 0; i < 10; i ++) {
            System.out.println("Hello World");
        }

        String [] names = {"Nikita", "Andrej", "Max", "Anthon", "Andrej"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < numbers.length; i++) {
                if (numbers [i] > 4){
                    System.out.println(numbers[i]);
                }  else  {
                    System.out.println("Other numbers: " + numbers[i]);
                }
            }


            for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Andrej")) {
                System.out.println("I found Andrej!");
            }
        }

        for (String name : names) {
            if (name.equals("Max")) {
                System.out.println("Found Max!");
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers [i] > 4){
                System.out.println(numbers[i]);
            }  else if (numbers[i] < 4) {
                System.out.println("Hello: Numbers is less then 4: " + numbers[i]);
            }
        }

        for (int i = numbers.length; i > 10; i--) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length -1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }

        }
    }

