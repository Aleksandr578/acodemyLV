package practice.homework.TamagochiGame;

abstract public class Animal {

    private String name;
    private Integer energy = 10;
    private Integer age = 0;
    private Double weight;
    private String color;

    public Animal(String name, Double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void congratulations() {
        System.out.format("%nCongratulations! You become a happy friend of %s little animal, weight %2.2f kg%n", color, weight);
    }

    public void sayNameAndMoon() {
        System.out.format("%nMy name is %s.%n Energy: %d and I'm %d years old!%n", name, energy, age);
    }

    abstract public void talk();

    abstract public void walk();

    abstract public void eat();

    abstract public void sleep();

    abstract public void work();

    abstract public void train();

    public void happyBirthday() {
        this.age++;
        System.out.format("Happy Birthday, little friend.%n");
        System.out.format(
                "    ####     #### %n" +
                "   ##  ##  ##  ## %n" +
                "     ##  ##  ## %n" +
                "   #############%n" +
                "   #           #%n" +
                "   #           #%n" +
                "   #           #%n" +
                "   #############%n");
    }

    public boolean animalIsActive(Integer requiredEnergy) {
        return this.energy > requiredEnergy;
    }

    public void changeEnergy(Integer change) {
        if (change < 0) {
            energy = Math.max(0, energy + change);
            System.out.format("%nEnergy is decreased by %d. Energy level is %d.%n", Math.abs(change), energy);
        } else {
            energy = Math.min(10, energy + change);
            System.out.format("%nEnergy is increased by %d. Energy level is %d.%n", Math.abs(change), energy);
        }
    }

    public Integer getEnergy() {
        return energy;
    }

    public Integer getAge() {
        return age;
    }
}
