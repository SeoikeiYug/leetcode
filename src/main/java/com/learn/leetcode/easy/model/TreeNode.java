package com.learn.leetcode.easy.model;

/**
 * @description: 二叉树
 * @author: gary
 * @create: 2021-05-31 18:56
 * @version: 1.0
 **/
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
