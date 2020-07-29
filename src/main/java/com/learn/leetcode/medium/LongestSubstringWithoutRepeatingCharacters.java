package com.learn.leetcode.medium;

/**
 * @description: 最长重复数
 * @author: gary
 * @create: 2020-07-29 10:35
 * @version: 1.0
 **/
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int abca = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubString("abcdbe");
        System.out.println(abca);
    }

    public int lengthOfLongestSubString(String s) {
        int length = s.length();
        int longest = 0;
        int[] index = new int[128];

        for (int j = 0, i = 0; j < length; j++) {
            i = Math.max(index[s.charAt(j)], i);
            longest = Math.max(longest, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }

        return longest;
    }

}
