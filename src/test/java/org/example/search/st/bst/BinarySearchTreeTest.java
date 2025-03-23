package org.example.search.st.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    BinarySearchTree<String,Integer>SUT;
    String[] t1 = new String[]{"S","E", "A","R","C","H","E","X","A","M","P","L","E"};

    @BeforeEach
    void setUp() {
        SUT = new BinarySearchTree<>();
    }

    @Test
    void testSearch() {
        for (int i = 0; i < t1.length; i++) {
            SUT.put(t1[i], i);
        }
        assertEquals(SUT.get("E"),12);
        assertNull(SUT.get("Q"));
        assertEquals(SUT.size(),10);
    }

    @Test
    void testmin() {
        for (int i = 0; i < t1.length; i++) {
            SUT.put(t1[i], i);
        }
        assertEquals(SUT.min(),"A");

    }

    @Test
    void testFloor() {
        for (int i = 0; i < t1.length; i++) {
            SUT.put(t1[i], i);
        }

        assertEquals(SUT.floor("G"), "E");
        assertEquals(SUT.floor("X"), "X");

    }
}



















