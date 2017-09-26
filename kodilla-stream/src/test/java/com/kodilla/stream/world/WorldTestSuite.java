package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigInteger;

public class WorldTestSuite {
    @Test
    public void testContinentGetPeopleQuantity(){
        //Given//
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigInteger("38432992")));
        europe.addCountry(new Country("Germany", new BigInteger("80722792")));
        europe.addCountry(new Country("France", new BigInteger("66318000")));

        //When//
        BigInteger result = europe.getPeopleQuantity();
        BigInteger expectedResult = new BigInteger("185473784");

        //Then//
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testWorldGetPeopleQuantity() {
        //Given//
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigInteger("38432992")));
        europe.addCountry(new Country("Germany", new BigInteger("80722792")));
        europe.addCountry(new Country("France", new BigInteger("66318000")));

        Continent asia = new Continent();
        europe.addCountry(new Country("Japan", new BigInteger("127110047")));
        europe.addCountry(new Country("Korea", new BigInteger("50801405")));
        europe.addCountry(new Country("China", new BigInteger("1360720000")));

        Continent america = new Continent();
        europe.addCountry(new Country("USA", new BigInteger("325365189")));
        europe.addCountry(new Country("Canada", new BigInteger("35702707")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);

        //When//
        BigInteger result = world.getPeopleQuantity();
        BigInteger expectedResult = new BigInteger("2085173132");

        //Then//
        Assert.assertEquals(expectedResult, result);
    }
}
