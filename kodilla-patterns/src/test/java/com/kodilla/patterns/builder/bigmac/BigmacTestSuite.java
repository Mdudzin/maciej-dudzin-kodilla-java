package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given//
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Sesame")
                .sauce("Barbecue")
                .burgers(3)
                .ingredient("Garlic")
                .ingredient("Onion")
                .ingredient("Tomato")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);
        //When//
        int howManyIngredients = bigmac.getIngredients().size();
        //Then//
        Assert.assertEquals(4, howManyIngredients);
    }
}