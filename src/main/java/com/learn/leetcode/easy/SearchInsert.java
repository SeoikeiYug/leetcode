package com.learn.leetcode.easy;

/**
 * @description: 搜索插入位置
 * @author: gary
 * @create: 2020-08-31 19:52
 * @version: 1.0
 **/
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target && i == nums.length - 1 || nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1, 2, 3};
        int i = searchInsert.searchInsert(nums, 3);
        System.out.println(i);
    }

}
