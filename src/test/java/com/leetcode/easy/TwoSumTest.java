package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test(){
        TwoSum test = new TwoSum();
        int[] res =  test.twoSum(new int[]{2,7,11,15},9);
        Assert.assertArrayEquals(res,new int[]{0,1});
    }
}
