package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDog(){
        Dog milo = new Dog(null,null,null);
        DogHouse.add(milo);

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogById(){
        Dog milo = new Dog(null,null,0);
        DogHouse.add(milo);
        DogHouse.remove(0);

        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogByName(){
        Dog milo = new Dog(null,null,null);
        DogHouse.add(milo);
        DogHouse.remove(milo);

        int expected = 0;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogById(){
        Dog milo = new Dog(null,null,0);
        DogHouse.add(milo);

        Dog expected = DogHouse.getDogById(0);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(expected, actual);
    }
}
