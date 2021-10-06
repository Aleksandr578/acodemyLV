package objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

public class Person {

    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;

    public void  retrieveInformation() {
        System.out.printf(
                "Name is: %s\nSurname is: %s\nAge is: %d\nWeight is: %f\nIs hetero: %s\n",
                name, surname, age, weight, isHetero);
    }

}

