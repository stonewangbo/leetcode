package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void test1(){
        TwoSum test = new TwoSum();
        int[] res =  test.twoSum1(new int[]{2,7,11,15},9);
        Assert.assertArrayEquals(res,new int[]{0,1});

         res =  test.twoSum1(new int[]{3,2,3},6);
        Assert.assertArrayEquals(res,new int[]{0,2});

        res =  test.twoSum1(new int[]{3,2,4},6);
        Assert.assertArrayEquals(res,new int[]{1,2});
    }

    @Test
    public void test2(){
        TwoSum test = new TwoSum();
        int[] res =  test.twoSum2(new int[]{2,7,11,15},9);
        Assert.assertArrayEquals(res,new int[]{0,1});

        res =  test.twoSum2(new int[]{3,2,3},6);
        Assert.assertArrayEquals(res,new int[]{0,2});

        res =  test.twoSum2(new int[]{3,2,4},6);
        Assert.assertArrayEquals(res,new int[]{1,2});
    }
}
