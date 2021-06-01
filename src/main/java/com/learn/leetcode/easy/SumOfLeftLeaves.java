package com.learn.leetcode.easy;

import com.learn.leetcode.easy.model.TreeNode;

/**
 * @description: 二叉树左边数值相加
 * @author: gary
 * @create: 2021-05-31 18:59
 * @version: 1.0
 **/
public class SumOfLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.val = 3;
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int i = SumOfLeftLeaves.sumOfLeftLeaves(root);
        System.out.println(i);
    }

}
