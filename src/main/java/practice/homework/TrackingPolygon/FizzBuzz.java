package practice.homework.TrackingPolygon;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.format("Please, Input any integer L%n");
        Scanner integer5 = new Scanner(System.in);
        int L = integer5.nextInt();
        if (L % 3 == 0 && L % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (L % 5 == 0) {
            System.out.println("Buzz");
        } else if (L % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(L);
        }
    }
}
