package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private class Cattester{
        String givenName;
        Date givenDate;
        Integer givenId;
    }
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setName() {
        String expected = "Tiger";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat testCat = new Cat(expected, givenBirthDate, givenId);

        testCat.setName(expected);

        Assert.assertEquals(expected, testCat.getName());
    }

    @Test
    public void setBirthDate(){
        String expected = "Tiger";
        Date givenBirthDate = new Date(8);
        Integer givenId = 0;
        Cat testCat = new Cat(expected, givenBirthDate, givenId);

        testCat.setBirthDate(givenBirthDate);

        Assert.assertEquals(givenBirthDate, testCat.getBirthDate());
    }

    @Test
    public void speakTest(){
        String expected = "meow!";
        String actual = Cat.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest(){
        int expected = 1;
        int actual = Food.eat();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIdTest(){
        String expected = "Tiger";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat testCat = new Cat(expected, givenBirthDate, givenId);

        testCat.getId();

        Assert.assertEquals(givenId, testCat.getId());
    }

    @Test
    public void animalInheritanceTest(){

        String expected = "Tiger";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat testCat = new Cat(expected, givenBirthDate, givenId);
        Assert.assertTrue(testCat instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest(){
        String expected = "Tiger";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat testCat = new Cat(expected, givenBirthDate, givenId);
        Assert.assertTrue(testCat instanceof Mammal);
    }

}
