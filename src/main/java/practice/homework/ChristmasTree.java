package practice.homework;

public class ChristmasTree {
    public static void main(String[] args) {

        int length = 10;

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= (length * 2) - 1; j++) {
                if (j > length - i && j < length + i) {
                    System.out.format("*");
                } else {
                    System.out.format(" ");
                }

            }
        }


        int icicle = 10;

        for (int i = icicle; i >= 1; i--) {
            for (int j = (icicle * 2) - 1; j >= 1; j--) {
                if (j > icicle - i && j < icicle + i) {
                    System.out.format("*");
                } else {
                    System.out.format(" ");
                }

            }
            System.out.println();
        }


    }
}
