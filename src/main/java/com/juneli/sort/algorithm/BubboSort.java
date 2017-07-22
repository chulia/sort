package com.juneli.sort.algorithm;

/**
 * Created by June on 2017/7/22.
 */
public class BubboSort {

    private int[] toSortArr;

    public BubboSort(int[] toSortArr) {
        this.toSortArr = toSortArr;
    }

    public BubboSort sort() {
        if (toSortArr == null || toSortArr.length <= 1) {
            return this;
        }

        for (int i = 0; i < toSortArr.length-1; i++) { // 总共length-1趟排序
            for (int j = 0; j<toSortArr.length-i-1; j++) { // 每趟排序将最大值下沉到待排序序列的最后位置
                if (toSortArr[j] > toSortArr[j+1]) {
                    int temp = toSortArr[j+1];
                    toSortArr[j+1] = toSortArr[j];
                    toSortArr[j] = temp;
                }
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
