package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {

    @Before
    public void before() {

        System.out.println("Test Case: begin");

    }

    @After
    public void after() {

        System.out.println("Test Case: end");

    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given//
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When//
        boolean result = exterminator.exterminate(emptyList).isEmpty();

        //Then//
        Assert.assertTrue(result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given//
        ArrayList<Integer> theList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        Random theGenerator = new Random();

        for(int n=0; n<100; n++){
            theList.add(theGenerator.nextInt(100));
        }

        //When//
        boolean result1 = exterminator.exterminate(theList).contains(1);
        boolean result2 = exterminator.exterminate(theList).contains(3);
        boolean result3 = exterminator.exterminate(theList).contains(5);
        boolean result4 = exterminator.exterminate(theList).contains(7);
        boolean result5 = exterminator.exterminate(theList).contains(9);

        //Then - sprawdzamy czy lista wynikowa zawiera wskazane wyżej liczby nieparzyste//
        Assert.assertFalse(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
        Assert.assertFalse(result5);
    }
}