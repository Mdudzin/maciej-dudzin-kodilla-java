package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLog() {

        //Given//
        //When//
        Logger.getInstance().log("Random log");

        //Then//
        Assert.assertEquals("Random log", Logger.getInstance().getLastLog());
    }
}