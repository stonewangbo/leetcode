package com.leetcode.easy;



public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for(int a=0;a<nums.length-1;a++){
            for(int b=1;b<nums.length;b++){

                if(a==b)continue;
                if(nums[a]+nums[b]==target){
                    return new int[]{a,b};
                }


            }

        }

        return null;
    }
}
