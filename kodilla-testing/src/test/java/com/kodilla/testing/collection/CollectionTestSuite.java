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


        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        exterminator.exterminate(emptyList);

        //Assert.assertTrue();


    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> theList = new ArrayList<Integer>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        Random theGenerator = new Random();

        for(int n=0; n<100; n++){

            theList.add(theGenerator.nextInt(100));

        }

        exterminator.exterminate(theList);

        //Assert.assertTrue();

    }
}
