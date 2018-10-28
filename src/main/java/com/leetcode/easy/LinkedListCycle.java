package com.leetcode.easy;

import com.leetcode.structure.ListNode;
//Definition for singly-linked list.
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode pLow = head;
        ListNode pFirst = head!=null?head.next:null;
        while(pLow!=null && pFirst!=null){
            if(pLow==pFirst) return true;
            pLow = pLow.next;

            pFirst = pFirst.next!=null? pFirst.next.next:null;

        }
        return false;
    }
}
