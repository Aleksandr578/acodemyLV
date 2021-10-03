package practice.homework.TamagochiGame;

public class Cat extends Animal {

    public Cat(String name, Double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void talk() {
        if (!animalIsActive(1)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Mjau mjau%n");
            changeEnergy(-1);
        }
    }

    @Override
    public void walk() {
        if (!animalIsActive(1)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Walk? Why?!! I want to sit and eat mouses%n");
            changeEnergy(-1);
        }
    }

    @Override
    public void eat() {
        System.out.format("Mmm..Nice! I want more milk!%n");
        changeEnergy(2);
    }

    @Override
    public void sleep() {
        System.out.format("ZzzzZzzzz%n");
        changeEnergy(3);
    }

    @Override
    public void work() {
        if (!animalIsActive(5)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("You must work, I'll watch TV!%n");
            changeEnergy(-5);
        }
    }

    @Override
    public void train() {
        if (!animalIsActive(4)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("What? Is it joke?%n");
            changeEnergy(-4);
        }
    }
}
