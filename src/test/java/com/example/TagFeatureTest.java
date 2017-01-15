package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

/**
 * Created by Alpesh on 1/14/2017.
 */

@Tag("marvelous-test")
@Tags({
        @Tag("fantastic-test"),
        @Tag("awesome-test")
})
public class TagFeatureTest {

    @Test
    void normalTest(){

    }

    @Test
    @Tag("Fast-test")
    void fastTest(){

    }
}
