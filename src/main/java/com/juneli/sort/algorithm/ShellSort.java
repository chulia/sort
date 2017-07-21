package com.juneli.sort.algorithm;

/**
 * Created by June on 2017/7/18.
 */
public class ShellSort {
    private int[] toSortArr;

    public ShellSort(int[] toSortArr) {
        this.toSortArr = toSortArr;
    }

    public ShellSort sort() {
        if (toSortArr == null || toSortArr.length <= 1) {
            return this;
        }

        int dk = 5;
        while (dk >= 1) {
            shellInsertSort(toSortArr, dk); // 逐渐缩小增量直到增量为1，每个增量对应一趟排序
            dk = dk/2;
        }
        return this;
    }

    private void shellInsertSort(int[] toSortArr, int dk) {
        for (int start = 0; start < dk; start++) {
            insertSort(toSortArr, start, dk); // 每个增量序列都用直接插入排序
        }
    }

    /**
     * 增量序列使用直接插入排序
     * @param toSortArr
     * @param start
     * @param dk
     */
    private void insertSort(int[] toSortArr, int start, int dk) {
        for (int idx = start+dk; idx < toSortArr.length; idx += dk) {
            int temp = toSortArr[idx];
            int j = idx - dk;
            while (j>=start && temp < toSortArr[j]) {
                toSortArr[j+dk] = toSortArr[j];
                j -= dk;
            }
            toSortArr[j+dk] = temp;
        }
    }

    public void print() {
        for (int i = 0; i < toSortArr.length; i++) {
            System.out.print(" " + toSortArr[i]);
        }
    }

}
