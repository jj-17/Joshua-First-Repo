package io.codedifferently;

import org.junit.Test;
import org.junit.Assert;


public class FruitTest {

    @Test
    public void constructorTest() 
    {
        //given
        String type = "apple";
        int energy = 40;

        //when
        Fruit fruityTest = new Fruit(type, energy);
        String actualType = fruityTest.getFruitType();
        int actualEnergy = fruityTest.getEnergy();

        //then
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);
    }


    
}