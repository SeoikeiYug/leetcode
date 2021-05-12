package com.learn.leetcode.easy;

/**
 * @description: remove
 * @author: gary
 * @create: 2021-05-12 20:02
 * @version: 1.0
 **/
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3};
        int i = RemoveDuplicates.removeDuplicates(nums);
        System.out.println(i);
    }

}
