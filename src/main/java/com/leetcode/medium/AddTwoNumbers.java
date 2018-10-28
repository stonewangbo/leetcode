package com.leetcode.medium;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode res = null;
        ListNode temp = null;
        int nextAdd = 0;
        while(t1!=null || t2!=null){
            int val = (t1!=null?t1.val:0)+(t2!=null?t2.val:0)+nextAdd;
            ListNode curr = new ListNode(val%10);
            nextAdd = val/10;
            if(res==null){
                res  =curr;
            }
            if(temp!=null){
                temp.next = curr;
            }
            temp = curr;
            t1 = t1!=null?t1.next:null;
            t2 = t2!=null?t2.next:null;
        }
        if(nextAdd>0){
            temp.next=new ListNode(nextAdd);
        }
        return res;
    }
}
