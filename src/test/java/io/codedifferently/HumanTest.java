package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;


public class HumanTest 
{

    @Test
    public void constructorTest() 
    {
        //given
        String firstN = "Joe";
        String lastN = "Johnson";
        int energy = 100;

        //when
        Human test = new Human(firstN,lastN,energy);
        String actualFirst = test.getFirstName();
        String actualLast = test.getLastName();
        int actualEnergy = test.getEnergy();

        //then
        Assert.assertEquals("Joe", actualFirst);
        Assert.assertEquals("Johnson", actualLast);
        Assert.assertEquals(100, actualEnergy);
    }

    @Test
    public void eatTest()
    {
        //given
        Fruit pineapple = new Fruit("pineapple", 25);
        int expectedEnergy = 125;

        Human person = new Human("Betty", "Boop", 100);

        //when
        person.eat(pineapple);
        int actualEnergy = person.getEnergy();

        //then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest()
    {
        //given
        Human person = new Human("Betty", "Boop", 100);
        int expectedEnergy = 80;
        
        //when
        person.work(2);
        int actualEnergy = person.getEnergy();

        //then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest()
    {
        //given
        Human.maxEnergy = 100;
        Human person = new Human("Betty", "Boop", 80);
        
        Fruit banana = new Fruit("Banana", 45);
        Fruit apple = new Fruit("Apple", 15);
        Fruit kiwi = new Fruit("Kiwi", 35);

        //when
        person.eat(banana);
        person.eat(apple);
        person.eat(kiwi);
        int actualEnergy = person.getEnergy();

        //then
        Assert.assertEquals(100, actualEnergy);
    }
    
    @Test
    public void workMin()
    {
        //given
        Human person = new Human("Betty", "Boop", 80);

        //when
        person.work(9);
        int actualEnergy = person.getEnergy();

        //then
        Assert.assertEquals(80, actualEnergy);
    }

    @Test
    public void maxEnergyChangeTest() 
    {
        //given
        Human person = new Human("Betty", "Boop", 80);
        
        //when
        Human.maxEnergy = 150;
        Fruit banana = new Fruit("Banana", 45);
        Fruit apple = new Fruit("Apple", 25);
        Fruit kiwi = new Fruit("Kiwi", 35);

        person.eat(banana);
        person.eat(apple);
        person.eat(kiwi);
        int currentEnergy = person.getEnergy();

        //then
        Assert.assertEquals(Human.maxEnergy, currentEnergy);

    }
}