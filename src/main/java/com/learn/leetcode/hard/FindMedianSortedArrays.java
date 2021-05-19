package com.learn.leetcode.hard;

/**
 * @description: findMedianSortedArrays
 * @author: gary
 * @create: 2021-05-18 19:00
 * @version: 1.0
 **/
public class FindMedianSortedArrays {

    public double findMedianSortedArraysWithOneArray(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int len = m + n;
        int left = -1, right = -1;
        int aStart = 0, bStart = 0;
        for (int i = 0; i <= len / 2; i++) {
            left = right;
            if (aStart < m && (bStart >= n || num1[aStart] < num2[bStart])) {
                right = num1[aStart++];
            } else {
                right = num2[bStart++];
            }
        }
        if ((len & 1) == 0) {
            return (left + right) / 2.0;
        } else {
            return right;
        }
    }

    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;
        int[] nums = new int[m + n];
        if (m == 0) {
            if (n % 2 == 0) {
                return (num2[n / 2 - 1] + num2[n / 2]) / 2.0;
            } else {
                return num2[n / 2];
            }
        }
        if (n == 0) {
            if (m % 2 == 0) {
                return (num1[m / 2 - 1] + num1[m / 2]) / 2.0;
            } else {
                return num1[m / 2];
            }
        }
        int count = 0;
        int i = 0, j = 0;
        while (count != (m + n)) {
            if (i == m) {
                while (j != n) {
                    nums[count++] = num2[j++];
                }
                break;
            }
            if (j == n) {
                while (i != m) {
                    nums[count++] = num1[i++];
                }
                break;
            }
            if (num1[i] < num2[j]) {
                nums[count++] = num1[i++];
            } else {
                nums[count++] = num2[j++];
            }
        }
        if (count % 2 == 0) {
            return (nums[count / 2 - 1] + nums[count /2]) / 2.0;
        } else {
            return nums[count / 2];
        }
    }

}
