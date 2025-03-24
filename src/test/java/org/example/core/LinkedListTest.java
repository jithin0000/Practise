package org.example.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList<String> SUT;
    @BeforeEach
    void setUp() {
       SUT = new LinkedList<>();
    }

    @Test
    void testInsertOnBeginning() {
        SUT.insertAtTheBeginning("A");
        SUT.insertAtTheBeginning("B");
        SUT.insertAtTheBeginning("C");

        assertEquals(SUT.remove(), "C");
        assertEquals(SUT.remove(), "B");
        assertEquals(SUT.remove(), "A");

        assertEquals(SUT.size(),0);

        SUT.insertAtTheBeginning("A");
        assertEquals(SUT.head(),"A");
        assertEquals(SUT.tail(),"A");

        SUT.insertAtTheBeginning("B");
        assertEquals(SUT.head(),"B");
        assertEquals(SUT.tail(),"A");


    }


    @Test
    void testInsertOnEnd() {
        SUT.insertAtTheEnd("B");
        assertEquals(SUT.head(), "B");
        assertEquals(SUT.tail(), "B");

        SUT.insertAtTheEnd("C");
        assertEquals(SUT.head(), "B");
        assertEquals(SUT.tail(), "C");

        assertEquals(SUT.size(),2);

        assertEquals(SUT.remove(),"B");
        assertEquals(SUT.remove(),"C");
        assertEquals(SUT.size(), 0);

        SUT.insertAtTheBeginning("A");
        SUT.insertAtTheBeginning("B");
        SUT.insertAtTheBeginning("C");
        SUT.insertAtTheBeginning("D");


        for (String s : SUT) {
            System.out.println(s);
        }


    }
}