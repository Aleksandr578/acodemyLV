package practice.homework.homework2;

import java.util.Scanner;

public class DiscountByAge {

    public static void main(String[] args){
        System.out.format("Enter your age %n");
        Scanner age = new Scanner(System.in);
        int x = age.nextInt();
        // for (int i = 18; i == 100; i++){}
        if (x < 22) {
            System.out.format("Your 10 percent discount %n");
        } else if (x < 66) {
            System.out.format("Your 15 percent discount %n");
        } else {
            System.out.format("Your 20 percent discount %n");
        }
    }
}
