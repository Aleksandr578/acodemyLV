package practice.homework.TamagochiGame;

public class Game {

    public static void main (String [] args) {
        ProgramMenu programMenu = new ProgramMenu();
        GameHelper gameHelper = new GameHelper();

        gameHelper.printInformation();
        programMenu.printMenuChooseAnimal();
        Integer menuNumber = programMenu.chooseMenuNumber();
        Animal animal = programMenu.getAnimalType(menuNumber);
        animal.congratulations();
        animal.sayNameAndMoon();

        int days = 0;
        boolean goodMood = true;

        while (true) {
            gameHelper.printStatus(animal.getEnergy());
            programMenu.printMenu();
            menuNumber = programMenu.chooseMenuNumber();
            programMenu.execute(menuNumber, animal);
            days++;

            if (days % 3 == 0) {
                animal.happyBirthday();
            }
            if (!goodMood && animal.getEnergy() == 0) {
                System.out.format("You are bad friend! Animal is caput!%n");
                gameHelper.theEnd();
                break;
            }
            if (animal.getEnergy() == 0) {
                goodMood = false;
            }
            gameHelper.checkLifeStatus(animal.getAge());
        }
    }
}
