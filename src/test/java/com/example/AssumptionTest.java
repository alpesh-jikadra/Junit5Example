package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Alpesh on 1/14/2017.
 */
public class AssumptionTest {
    @Test
    @DisplayName("this is normal test")
    void normarlTest(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("This test always have failed bu assume success")
    void assumptionTest(){
        //Assertions.assertTrue(false);
        Assumptions.assumeTrue(false);
    }
}
