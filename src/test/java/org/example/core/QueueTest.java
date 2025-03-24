package org.example.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue<String> SUT;

    @BeforeEach
    void setUp() {
        SUT = new Queue<>();
    }

    @Test
    void test() {
        SUT.enqueue("A");
        SUT.enqueue("B");

        assertEquals(SUT.size(),2);
        assertEquals(SUT.dequeue(),"A");
        assertEquals(SUT.dequeue(),"B");

    }
}




















