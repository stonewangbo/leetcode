package com.leetcode.easy;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //循环实现
    public int[] twoSum1(int[] nums, int target) {

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

    //第二种，快速实现
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a=0;a<nums.length;a++){
            int need = target-nums[a];
            if(map.containsKey(need)){
                return  new int[]{map.get(need),a};
            }
            map.put(nums[a],a);
        }

        return null;
    }
}
