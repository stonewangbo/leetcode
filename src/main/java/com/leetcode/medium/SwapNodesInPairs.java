package com.leetcode.medium;

import com.leetcode.structure.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode res = head.next;
        ListNode lastB = null;

        while (curr!=null && curr.next!=null){
            ListNode a = curr;
            ListNode b = curr.next;
            curr = b.next;

                //swap
                a.next = b.next;
                b.next = a;
                if(lastB!=null) {
                    lastB.next = b;
                }
                lastB = a;
        }

        return res;
    }
}
