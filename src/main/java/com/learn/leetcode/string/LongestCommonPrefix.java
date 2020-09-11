package com.learn.leetcode.string;

/**
 * @description: longestCommonPrefix
 * @author: gary
 * @create: 2020-09-08 17:02
 * @version: 1.0
 **/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        String prefix = "";
        if (length != 0) {
            int minLength = strs[0].length();
            for (String str : strs) {
                if (str.length() < minLength) {
                    minLength = str.length();
                }
            }
            prefix = strs[0].substring(0, minLength);
        }
        for (String str : strs) {
            //关键代码，不断的从后往前截取字符串，然后与之相比，直到startsWith()返回true
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
