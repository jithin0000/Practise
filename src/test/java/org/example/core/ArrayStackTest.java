package org.example.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    ArrayStack<String> SUT;

    @BeforeEach
    void setUp() {
        SUT = new ArrayStack<>();
    }

    @Test
    void test() {
        SUT.push("A");
        SUT.push("B");
        SUT.push("C");

        assertEquals(SUT.size(), 3);
        assertEquals(SUT.pop(), "C");
        assertEquals(SUT.pop(), "B");
        assertEquals(SUT.pop(), "A");
        assertEquals(SUT.size(),0);
    }

}