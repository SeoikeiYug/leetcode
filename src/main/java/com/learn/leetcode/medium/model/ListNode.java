package com.learn.leetcode.medium.model;

/**
 * @description: 链表
 * @author: gary
 * @create: 2020-07-23 18:44
 * @version: 1.0
 **/
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
