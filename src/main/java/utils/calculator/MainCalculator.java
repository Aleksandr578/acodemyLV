package utils.calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("Casio");
        double addition = calculator.add(10, 15);
        System.out.println(addition);
        double subtract = calculator.subtract(30, 10);
        System.out.println(subtract);
        double multiply = calculator.multiply(9, 4);
        System.out.println(multiply);
        double divide = calculator.divide(30, 5);
        System.out.println(divide);

        System.out.format("Enter an arithmetic example (X arithmetic action Y %n");
        Scanner integer = new Scanner(System.in);
        int x = integer.nextInt();
        int y = integer.nextInt();
    }

}
