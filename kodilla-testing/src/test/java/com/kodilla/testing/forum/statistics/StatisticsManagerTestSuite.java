package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsManagerTestSuite {
    @Test
    public void testPostsCountZero() {
        //Given//
        Statistics statisticsMock = mock(Statistics.class);
        int postsQuantity = 0;
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        StatisticsManager statisticsManager = new StatisticsManager(statisticsMock);

        //When//
        statisticsManager.calculateAdvStatistics(statisticsMock);

        int result = statisticsManager.getPostsQuantity();

        //Then//
        Assert.assertEquals(0,result);
    }
}
