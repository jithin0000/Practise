package org.example.excercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveValTest {

    RemoveVal SUT;

    @BeforeEach
    void setUp() {
        SUT = new RemoveVal();
    }

    @Test
    void testCase1() {
        int[] nums = new int[]{3,2,2,3};
        int res = SUT.removeElement(nums, 3);
        assertEquals(res,2);
    }

    @Test
    void testCase2() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int res = SUT.removeElement(nums,2);
        assertEquals(res,5);
    }
}