package com.learn.leetcode.easy;

import com.learn.leetcode.easy.model.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description: mergeInterval
 * @author: gary
 * @create: 2020-09-03 17:20
 * @version: 1.0
 **/
public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{};
        }
        //保存结果集合
        List<int[]> result = new ArrayList<>();
        //将原集合进行排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        //获取第一个数组里面的两个值
        int currentA = intervals[0][0];
        int currentB = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (currentB < intervals[i][0]) {
                //两个数组没有重叠直接把第一个加入数据集
                result.add(new int[]{currentA, currentB});
                //使用第二个和下一组比较
                currentA = intervals[i][0];
                currentB = intervals[i][1];
            } else {
                //两个数据有重叠
                currentB = Math.max(currentB, intervals[i][1]);
            }
        }
        //当所有都有重叠的时候
        result.add(new int[]{currentA, currentB});

        //转换数组类型，模型确定
        int[][] model = new int[result.size()][2];
        return result.toArray(model);
    }

}
