package practice.homework.TamagochiGame;

public class Dog extends Animal {

    public Dog(String name, Double weight, String color) {
        super(name, weight, color);
    }

    @Override
    public void talk() {
        if (!animalIsActive(1)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Hav hav%n");
            changeEnergy(-1);
        }
    }

    @Override
    public void walk() {
        if (!animalIsActive(1)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("Walk it's nice!! Dogs like it!%n");
            changeEnergy(-1);
        }
    }

    @Override
    public void eat() {
        System.out.format("Mmm..Nice! I want more meet!%n");
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
            System.out.format("Hav-hav! I'm guard!%n");
            changeEnergy(-5);
        }
    }

    @Override
    public void train() {
        if (!animalIsActive(4)) {
            System.out.format("Oh...I'm so tired.%n");
        } else {
            System.out.format("I don't like training.... It's so hard!%n");
            changeEnergy(-4);
        }
    }
}
