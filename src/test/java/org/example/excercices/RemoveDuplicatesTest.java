package org.example.excercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    RemoveDuplicates SUT;

    @BeforeEach
    void setUp() {
        SUT = new RemoveDuplicates();
    }

    @Test
    void testCase1() {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = SUT.removeDuplicates(nums);
        assertEquals(i,5);

    }
    @Test
    void testCase2() {

        int[] nums = {1,1,2};
        int i = SUT.removeDuplicates(nums);
        assertEquals(i,2);

    }
    @Test
    void testCase3() {

        int[] nums = {1,2};
        int i = SUT.removeDuplicates(nums);
        assertEquals(i,1);

    }


}