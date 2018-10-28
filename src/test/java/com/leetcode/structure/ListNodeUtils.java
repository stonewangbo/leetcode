package com.leetcode.structure;


import com.leetcode.structure.ListNode;

import java.util.Arrays;


public class ListNodeUtils {

    public static int[] covert(ListNode ln){
        int[] res = new int[2];
        ListNode temp = ln;
        int curr= 0 ;
        while(temp!=null){
            if(res.length-1<curr) {
                res = Arrays.copyOf(res, res.length * 2);
            }
            res[curr] = temp.val;
            temp = temp.next;
            curr++;
        }

        return  Arrays.copyOf(res, curr);
    }

    public static  ListNode covert(int[] arr){
        ListNode res = new ListNode(arr[0]);
        ListNode temp = res;
        for(int i=1;i<arr.length;i++){
            ListNode curr = new ListNode(arr[i]);
            temp.next = curr;
            temp = curr;
        }
        return  res;
    }
}
