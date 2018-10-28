package com.leetcode.medium;

import com.leetcode.structure.ListNodeUtils;
import org.junit.Assert;
import org.junit.Test;

public class SwapNodesInPairsTest {

    @Test
    public void test(){
        //Given 1->2->3->4, you should return the list as 2->1->4->3.
        SwapNodesInPairs trg = new SwapNodesInPairs();
        int[] res =  ListNodeUtils.covert(
                trg.swapPairs(ListNodeUtils.covert(new int[]{1,2,3,4})));
        Assert.assertArrayEquals(new int[]{2,1,4,3},res);

    }
}
