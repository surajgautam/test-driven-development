package com.surajgautam.tdd.addition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Suraj Gautam.
 */
public class AdditionTest {

    private Addition addition;

    @Before
    public void setup() {
        addition = new Addition();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(5,addition.add(2,3));
    }

}
