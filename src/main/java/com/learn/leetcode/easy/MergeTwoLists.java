package com.learn.leetcode.easy;

import com.learn.leetcode.medium.model.ListNode;

/**
 * @description: 整合两个集合
 * @author: gary
 * @create: 2021-05-11 17:07
 * @version: 1.0
 **/
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        ListNode list = new ListNode(0);
        ListNode temp = list;
        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val < listNode2.val) {
                temp.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                temp.next = listNode2;
                listNode2 = listNode2.next;
            }
            temp = temp.next;
        }
        if (listNode1 != null) {
            temp.next = listNode1;
        }
        if (listNode2 != null) {
            temp.next = listNode2;
        }
        return list.next;
    }

    public ListNode mergeTwoListsRecursion(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        ListNode mergeNode;
        if (listNode1.val < listNode2.val) {
            mergeNode = listNode1;
            mergeNode.next = mergeTwoListsRecursion(listNode1.next, listNode2);
        } else {
            mergeNode = listNode2;
            mergeNode.next = mergeTwoListsRecursion(listNode1, listNode2.next);
        }
        return mergeNode;
    }


    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        ListNode temp = list;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(2);
        System.out.println(temp);
        System.out.println(list);
    }

}
