package practice.homework;

public class ChristmasTree {
    public static void main(String[] args) {

        int dlina = 10;

        for (int i = 1; i <= dlina; i++) {
            for (int j = 1; j <= (dlina * 2) - 1; j++) {
                if (j > dlina - i && j < dlina + i) {
                    System.out.format("*");
                } else {
                    System.out.format(" ");
                }

            }
        }


        int sosulka = 10;

        for (int i = sosulka; i >= 1; i--) {
            for (int j = (sosulka * 2) - 1; j >= 1; j--) {
                if (j > sosulka - i && j < sosulka + i) {
                    System.out.format("*");
                } else {
                    System.out.format(" ");
                }

            }
            System.out.println();
        }


    }
}
