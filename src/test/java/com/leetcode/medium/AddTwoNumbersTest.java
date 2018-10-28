package com.leetcode.medium;

import com.leetcode.structure.ListNodeUtils;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void test(){
        //Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        //Output: 7 -> 0 -> 8
       // Explanation: 342 + 465 = 807.
        AddTwoNumbers trg = new AddTwoNumbers();
        int[] res =  ListNodeUtils.covert(
                trg.addTwoNumbers(ListNodeUtils.covert(new int[]{2,4,3}),
                        ListNodeUtils.covert(new int[]{5,6,4})));
        Assert.assertArrayEquals(new int[]{7,0,8},res);

    }
}
