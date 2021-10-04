package practice.homework.TamagochiGame;

public class Pig extends Animal {

    public Pig(String name, Double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void talk() {
        if (!animalIsActive(2)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Hrju hrju%n");
            changeEnergy(-2);
        }
    }

    @Override
    public void walk() {
        if (!animalIsActive(3)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("I like nature! Hrjuu!%n");
            changeEnergy(-3);
        }
    }

    @Override
    public void eat() {
        System.out.format("Mmm..Nice! I want more grass!%n");
        changeEnergy(3);
    }

    @Override
    public void sleep() {
        System.out.format("Hrju, ZzZzZ%n");
        changeEnergy(3);
    }

    @Override
    public void work() {
        if (!animalIsActive(2)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Bakon is not ready. Eat grass.%n");
            changeEnergy(-2);
        }
    }

    @Override
    public void train() {
        if (!animalIsActive(6)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Oh...Morning run?.%n");
            changeEnergy(-6);
        }
    }
}
