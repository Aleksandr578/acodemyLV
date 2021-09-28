package practice.homework.homework2;

public class Animals {
    public static void main(String [] args){

        String [] animals = {"elephant", "crocodile", "cat", "giraffe", "cow"};
        for (String myAnimals : animals){
            if (myAnimals.equals("cat")){
                System.out.format("I found my fuzzy - %s!!!", myAnimals);
            }
        }
    }
}
