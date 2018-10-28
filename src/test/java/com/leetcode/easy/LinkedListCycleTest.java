package com.leetcode.easy;

import com.leetcode.structure.ListNode;
import com.leetcode.structure.ListNodeUtils;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleTest {
    @Test
    public void test(){
        LinkedListCycle tag = new LinkedListCycle();
        Assert.assertFalse(tag.hasCycle(ListNodeUtils.covert(new int[]{2,4,3})));

        //模拟有循环的情况
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        a1.next = a2;
        a2.next=a3;
        a3.next= a4;
        a4.next  = a2;

        Assert.assertTrue(tag.hasCycle(a1));
    }
}
