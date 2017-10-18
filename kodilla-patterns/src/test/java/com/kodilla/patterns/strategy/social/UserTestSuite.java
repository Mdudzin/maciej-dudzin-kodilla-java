package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //Given//
        User maciej = new Millenials("Maciej");
        User agata = new YGeneration("Agata");
        User filip = new ZGeneration("Filip");

        //When//
        System.out.println(maciej.sharePost());
        System.out.println(agata.sharePost());
        System.out.println(filip.sharePost());

        //Then//
        Assert.assertEquals("This user is now sharing via Facebook", maciej.sharePost());
        Assert.assertEquals("This user is now sharing via Twitter", agata.sharePost());
        Assert.assertEquals("This user is now sharing via Snapchat", filip.sharePost());
    }
    @Test
    public void testIndividualSharingStrategy() {

        //Given//
        User maciej = new Millenials("Maciej");

        //When//
        maciej.setSocialPublisher(new SnapchatPublisher());
        String maciejShareResult = maciej.sharePost();

        //Then//
        Assert.assertEquals("This user is now sharing via Snapchat", maciejShareResult);
    }
}