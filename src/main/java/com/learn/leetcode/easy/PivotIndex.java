package com.learn.leetcode.easy;

/**
 * @description: 中心索引
 * @author: gary
 * @create: 2020-08-31 18:13
 * @version: 1.0
 **/
public class PivotIndex {

    public int pivotIndex(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);

        int i;
        for (i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum += nums[i - 1];
            }
            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        System.out.println(i);
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();
        int[] sums = {1, 0};
        int i = pivotIndex.pivotIndex(sums);
        System.out.println(i);
    }

}
