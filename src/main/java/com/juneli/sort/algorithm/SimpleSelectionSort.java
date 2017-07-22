package com.juneli.sort.algorithm;

/**
 * Created by June on 2017/7/21.
 */
public class SimpleSelectionSort {

    private int[] toSortArr;

    public SimpleSelectionSort(int[] toSortArr) {
        this.toSortArr = toSortArr;
    }

    public SimpleSelectionSort sort() {
        if (toSortArr == null || toSortArr.length <= 1) {
            return this;
        }

        for (int i = 0; i < toSortArr.length; i++) { //
            int minIdx = selectMinIdx(toSortArr, i);
            if (minIdx != i) { // 查找到的最小值不是待排序第一个则交换最小值和待排序第一个值的位置
                int min = toSortArr[minIdx];
                toSortArr[minIdx] = toSortArr[i];
                toSortArr[i] = min;
            }

        }
        return this;
    }

    /**
     * 查找数组中从start开始的序列最小值
     * @param toSortArr
     * @param start
     * @return
     */
    private int selectMinIdx(int[] toSortArr, int start) {
        int minIdx = start;
        int min = toSortArr[start];
        for (int j = start+1; j < toSortArr.length; j++) {
            if (toSortArr[j] < min) {
                minIdx = j;
            }
        }
        return minIdx;
    }

    public void print() {
        for (int i = 0; i < toSortArr.length; i++) {
            System.out.print(" " + toSortArr[i]);
        }
    }
}
