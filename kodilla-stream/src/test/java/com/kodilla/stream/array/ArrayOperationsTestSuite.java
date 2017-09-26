package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {

        //Given//

        int numbers[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        //When//

        OptionalDouble expectedResult = OptionalDouble.of(9.5);
        OptionalDouble result = ArrayOperations.getAverage(numbers);

        //Then//

        Assert.assertEquals(expectedResult, result);
    }
}