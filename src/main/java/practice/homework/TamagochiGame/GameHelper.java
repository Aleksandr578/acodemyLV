package practice.homework.TamagochiGame;

public class GameHelper {

    private static final Integer ANIMAL_MAX_AGE = 3;

    public void printInformation() {
        System.out.format("%nLet's play with little animal. You have to choose one and be happy together.%n" +
                "Maximal energy level is 10, minimal - 0.%n");
    }

    public void printStatus(Integer energy) {
        System.out.format(" :) ");
        for (int i = 1; i <= 10; i++) {
            if (i <= energy) {
                System.out.format(" + ");
            } else {
                System.out.format(" - ");
            }
        }
        System.out.format(" :( %n");
    }

    public void checkLifeStatus(Integer age) {
        if (age == ANIMAL_MAX_AGE) {
            System.out.format("%nIt was beautiful life, but it's over :(%n%n");
            theEnd();
            System.exit(0);
        }
    }

    public void theEnd() {
        System.out.format(
                "   ##   %n" +
                "   ##   %n" +
                "########%n" +
                "   ##%n" +
                "   ##%n" +
                "   ##%n" +
                "   ##%n");
    }
}
