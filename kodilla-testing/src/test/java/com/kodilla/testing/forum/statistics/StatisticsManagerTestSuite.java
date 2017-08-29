package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsManagerTestSuite {
    @Test
    public void testPostsCountZero() {
        //Given//
        Statistics statisticsMock = mock(Statistics.class);

        int postsQuantity = 1;
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);

        int commentsQuantity = 1;
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        List<String> users = new List<String>();
        users.add("Maciek");
        users.add("Magda");
        when(statisticsMock.usersNames()).thenReturn(users);

        StatisticsManager statisticsManager = new StatisticsManager(statisticsMock);

        //When//
        statisticsManager.calculateAdvStatistics(statisticsMock);

        statisticsManager.showStatistics();

        int result = statisticsManager.getPostsQuantity();

        //Then//
        Assert.assertEquals(1,result);
    }
}
