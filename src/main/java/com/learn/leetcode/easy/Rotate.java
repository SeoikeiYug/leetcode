package com.learn.leetcode.easy;

import java.util.Arrays;

/**
 * @description: rotate
 * @author: gary
 * @create: 2020-09-03 19:05
 * @version: 1.0
 **/
public class Rotate {

    /*
        示例 1:
        给定 matrix =
        [
          [1,2,3],
          [4,5,6],
          [7,8,9]
        ],
        原地旋转输入矩阵，使其变为:
        [
          [7,4,1],
          [8,5,2],
          [9,6,3]
        ]
     */

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        int[][] intA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate.rotate(intA);
    }

}
