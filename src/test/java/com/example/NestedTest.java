package com.example;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by Alpesh on 1/14/2017.
 */
public class NestedTest {
    private Queue<String> items;

    @BeforeEach
    void setup(){
        System.out.println("Before Each called");
        this.items = new LinkedList<String>();
    }

    @Test
    void isEmpty(){
        Assertions.assertTrue(items.isEmpty());
    }

    @Nested
    class WhenEmpty{

        @Test
        void removeShouldThrowException(){
            Assertions.expectThrows(NoSuchElementException.class, items::remove);
        }
        @Disabled
        @Test
        void sizeMustBeZero(){
            Assertions.assertEquals(0,items.size());
        }

    }

    @Nested
    class WhenWithOneElement{

        @Test
        void addingOneElementShouldIncreaseSize(){
            items.add("One");
            Assertions.assertEquals(1, items.size());
        }
    }

}
