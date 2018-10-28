package com.leetcode.easy;


public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res =  new int[2];
        for(int a=0;a<nums.length;a++){
            for(int b=1;a<nums.length;a++){
                if(a==b)continue;

                if(nums[a]+nums[b]==target){
                    res[0]=a;
                    res[1]=b;
                    return res;
                }
            }
        }

        return null;
    }
}
