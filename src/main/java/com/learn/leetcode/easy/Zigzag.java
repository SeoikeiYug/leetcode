package com.learn.leetcode.easy;

/**
 * @description: zigzag
 * @author: gary
 * @create: 2021-05-14 17:30
 * @version: 1.0
 **/
public class Zigzag {

    public String convert(String s, int numRows) {
        if (s == null || numRows == 1) {
            return s;
        }
        int len = s.length();
        if (len < numRows) {
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) {
                sb[idx].append(chars[i++]);
            }
            for (int idx = numRows - 2; idx > 0 && i < len; idx--) {
                sb[idx].append(chars[i++]);
            }
        }
        for (int idx = 1; idx < sb.length; idx++) {
            sb[0].append(sb[idx]);
        }

        return sb[0].toString();
    }

}
