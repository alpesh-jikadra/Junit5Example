package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Created by Alpesh on 1/14/2017.
 */
public class LambdaTest {
    @Test
    void assertionShouldBeTrue(){
        assertEquals(2==2,true);
    }
    @Test
    void assertionShouldBeTrueWithLambda(){
        assertEquals(3 == 2, true, () -> "3 not equal to 2 !");
    }
}
