package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dogTest = new Dog(givenName,givenBirthDate,givenId);

        String actualName = dogTest.getName();
        Date actualBirthDate = dogTest.getBirthDate();
        Integer actualId = dogTest.getId();
        Assert.assertEquals(actualName, givenName);
        Assert.assertEquals(actualBirthDate, givenBirthDate);
        Assert.assertEquals(actualId, givenId);


    }
    @Test
    public void createCatTest(){
        String givenName = "Tiger";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat catTest = new Cat(givenName,givenBirthDate,givenId);

        String actualName = catTest.getName();
        Date actualBirthDate = catTest.getBirthDate();
        Integer actualId = catTest.getId();
        Assert.assertEquals(actualName, givenName);
        Assert.assertEquals(actualBirthDate, givenBirthDate);
        Assert.assertEquals(actualId, givenId);
    }
}
