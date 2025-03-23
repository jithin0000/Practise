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
        /**
         * 0011122334
         * 0110122334
         * ij
         * 0 return i+1
         * 00 return i+1
         * 001, 010
         * i=0, j =0 , j=1, i++, echange(i,j)
         * i=1,j=1
         * xi,
         * index = i + 1
         */
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
        assertEquals(i,2);

    }


}