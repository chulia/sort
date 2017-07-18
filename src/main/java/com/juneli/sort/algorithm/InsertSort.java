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
            for (int idx = 1; idx < toSortArr.length; idx++) {
                int temp = toSortArr[idx];
                int j = idx - 1;
                while (j >= 0 && temp < toSortArr[j]) {
                    toSortArr[j+1] = toSortArr[j];
                    j--;
                }
                toSortArr[j+1] = temp;
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
