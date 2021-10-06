package practice.homework.Homework2;

public class MultiplicationTable {

    public static void main(String[] args){

        // Task 8

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.format("%4d", i * j);
            }
            {
                System.out.println();
            }
        }
    }
}
