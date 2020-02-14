package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDog(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null, null, null);
        Date givenDate = new Date();

        dog.setBirthDate(givenDate);

        Date dogDate = dog.getBirthDate();
        Assert.assertEquals(dogDate, givenDate);
    }

    @Test
    public void speakTest(){
       String expected = "bark!";
       String actual = Dog.speak();

       Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        int expected = 1;
        int actual = Food.eat();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void animalInheritanceTest(){
        Dog dogTest= new Dog(null, null, null);
        Assert.assertTrue(dogTest instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog dogTest = new Dog(null, null, null);
        Assert.assertTrue(dogTest instanceof Mammal);
    }
}
