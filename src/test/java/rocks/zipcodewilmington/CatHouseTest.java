package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addTest(){
        Cat tiger = new Cat(null,null,null);
        CatHouse.add(tiger);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void removeCat(){
        Cat tiger = new Cat(null, null, null);
        CatHouse.remove(tiger);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatById(){
        Cat tiger = new Cat(null, null, 0);
        CatHouse.remove(0);
        int expected = 0;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Cat tiger = new Cat(null, null, 0);
        CatHouse.add(tiger);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatById(){
        Cat tiger = new Cat(null, null, 0);
        CatHouse.add(tiger);
        Cat expected = CatHouse.getCatById(0);
        Cat actual = CatHouse.getCatById(0);

        Assert.assertEquals(expected, actual);
    }
}
