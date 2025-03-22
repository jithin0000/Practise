package org.example.excercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum SUT;

    @BeforeEach
    void setUp() {
        SUT = new TwoSum();
    }

    @Test
    void name() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = SUT.twoSum(nums, target);
        assertEquals(ints[0],0);
        assertEquals(ints[1],1);
    }
    @Test
    void testcase2() {
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] ints = SUT.twoSum(nums, target);
        assertEquals(ints[0],1);
        assertEquals(ints[1],2);
    }
}