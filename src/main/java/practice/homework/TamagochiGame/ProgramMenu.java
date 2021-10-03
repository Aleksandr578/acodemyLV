package practice.homework.TamagochiGame;

import java.util.Random;
import java.util.Scanner;

public class ProgramMenu {

    public static void printMenu() {
        System.out.format("%nPlease choose:%n" +
                "1 Say name and moon%n" +
                "2 Voice%n" +
                "3 Walk%n" +
                "4 Eat%n" +
                "5 Sleep%n" +
                "6 Work%n" +
                "7 Train%n" +
                "0 Exit%n");
    }

    public static void printMenuChooseAnimal() {
        System.out.format("%nLet's play game! Please choose animal:%n" +
                "1 Dog%n" +
                "2 Cat%n" +
                "3 Pig%n" +
                "4 I can't choose, let it be surprise!");
    }

    public Animal getAnimalType(Integer menuNumber) {
        String name = getAnimalNumber();
        switch (menuNumber) {
            case 1: {
                return new Dog(name, 10.2, "brown");
            }
            case 2: {
                return new Cat(name, 5.4, "gray");
            }
            case 3: {
                return new Pig(name, 15.3, "pink");
            }
            default:{
                return getRandomAnimal();
            }
        }
    }

    private Animal getRandomAnimal() {
        Integer randomAnimalNumber = new Random().nextInt(3) + 1;
        switch (randomAnimalNumber) {
            case 1: return new Dog("Surprise dog", 19.0, "black and white");
            case 2: return new Cat("Surprise cat", 2.4, "white");
            default: return new Pig("Surprise pig", 19.3, "black");
        }
    }

    private String getAnimalNumber() {
        System.out.format("%nPlease input animal's name%n");return new Scanner(System.in).nextLine();
    }

    public Integer chooseMenuNumber() {
        Integer menuNumber = 0;
        while (true) {
            System.out.format("%nPlease choose menu number!%n");
            Scanner scanner = new Scanner(System.in);
            try {
                menuNumber = scanner.nextInt();
                break;
            } catch (NumberFormatException e) {
                System.out.format("%nNot valid number!!%n");
            }
        }
        return menuNumber;
    }

    public void execute(Integer menuNumber, Animal animal) {
        switch (menuNumber) {
            case 1: {
                animal.sayNameAndMoon();
                break;
            }
            case 2: {
                animal.talk();
                break;
            }
            case 3: {
                animal.walk();
                break;
            }
            case 4: {
                animal.eat();
                break;
            }
            case 5: {
                animal.sleep();
                break;
            }
            case 6: {
                animal.work();
                break;
            }
            case 7: {
                animal.train();
                break;
            }
            default:{
                System.exit(0);
            }
        }
    }
}
