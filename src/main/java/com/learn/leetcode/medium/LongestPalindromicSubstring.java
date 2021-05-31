package com.learn.leetcode.medium;

/**
 * @description: 最长回文
 * @author: gary
 * @create: 2021-05-26 20:27
 * @version: 1.0
 **/
public class LongestPalindromicSubstring {

    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        // 获取字符串的长度
        int length = s.length();
        // 如果长度为1或者0直接返回
        if (length < 2) {
            return s;
        }
        // 定义最长回文长度
        int maxLength = 1;
        int begin = 0;

        char[] charArray = s.toCharArray();
        for (int i = 0; i < length - 1; i++) {
            int oddLen = expandAroundCenter(charArray, i, i);
            int evenLen = expandAroundCenter(charArray, i, i + 1);
            int currentMaxLen = Math.max(oddLen, evenLen);
            if (currentMaxLen > maxLength) {
                maxLength = currentMaxLen;
                begin = i - (maxLength - 1) / 2;
            }
        }

        return s.substring(begin, begin + maxLength);
    }

    /**
     *
     * @param charArray 回文数组
     * @param left      起始左边界
     * @param right     起始右边界
     * @return 回文串的长度
     */
    private int expandAroundCenter(char[] charArray, int left, int right) {
        // 当 left = right 的时候，回文中心是一个字符，回文串的长度是奇数
        // 当 left + 1 = right 的时候，此时回文中心是两个字符，回文串的长度是偶数
        int length = charArray.length;
        int i = left;
        int j = right;
        while (i >= 0 && j < length) {
            if (charArray[i] == charArray[j]) {
                i--;
                j++;
            } else {
                break;
            }
        }
        // 跳出 while 循环时，恰好满足 charArray[i] != charArray[j]
        // 回文串的长度是 j - i + 1 - 2(不包含i和j当前所在的位置)
        return j - i - 1;
    }

}
