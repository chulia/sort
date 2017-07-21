package com.juneli.sort.algorithm;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * Created by June on 2017/7/17.
 * simple insert sort algorithm
 */
public class InsertSort {
    private int[] toSortArr;

    public InsertSort(int[] toSortArr) {
        this.toSortArr = toSortArr;
    }

    public InsertSort sort() {
        if (toSortArr != null && toSortArr.length > 1) {
            for (int idx = 1; idx < toSortArr.length; idx++) { // 待排序列从第2个开始到最后一个
                int temp = toSortArr[idx];
                int j = idx - 1; // 已排序列最后一个
                while (j >= 0 && temp < toSortArr[j]) { // 待排序列第一个依次和已排序列比较
                    toSortArr[j+1] = toSortArr[j]; // 已排序列依次后移
                    j--;
                }
                toSortArr[j+1] = temp; // 待排序列第一个填入空位
            }
        }

        return this;
    }

    public void print() {
        for (int i = 0; i < toSortArr.length; i++) {
            System.out.print(" " + toSortArr[i]);
        }
    }
}
