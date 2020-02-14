package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public static String speak() {
        return "bark!";
    }
}
