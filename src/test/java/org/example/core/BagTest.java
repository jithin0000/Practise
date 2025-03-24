package org.example.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    Bag<String> SUT;

    @BeforeEach
    void setUp() {
        SUT = new Bag<>();
    }

    @Test
    void test() {
       SUT.add("A");
        SUT.add("B");
        SUT.add("C");

        for (String s : SUT) {
            System.out.println(s);
        }

        assertEquals(SUT.size(),3);


    }
}