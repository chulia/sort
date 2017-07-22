package com.juneli.sort.algorithm;

/**
 * Created by June on 2017/7/21.
 */
public class HeapSort {

    private int[] toSortArr;

    public HeapSort(int[] toSortArr) {
        this.toSortArr = toSortArr;
    }

    public HeapSort sort() {
        if (toSortArr == null || toSortArr.length <= 1) {
            return this;
        }

        // 1.先将待排数组建成一个大顶堆或小顶堆（建堆的过程是一个循环调整堆的过程）
        int len = toSortArr.length;
        int start = (len-1)/2; //从最后一个非叶子节点起调整
        for (int i = start; i >= 0 ; i--) {
            adjustHeap(i, toSortArr.length-1);
        }

        // 2.循环输出堆顶并调整堆
        for (int i = 0; i < toSortArr.length; i++) {
            int temp = toSortArr[0];
            int lastNonSortIdx = toSortArr.length-i-1; // 待排序最后一个
            toSortArr[0] = toSortArr[lastNonSortIdx];
            toSortArr[lastNonSortIdx] = temp;
            adjustHeap(0, lastNonSortIdx-1); // 已排序序列不参与调整
        }

        return this;
    }

    /**
     * 调整堆为标准小顶堆或大顶堆
     * @param start 开始调整元素下标
     * @param end 结束调整元素下标
     */
    private void adjustHeap(int start, int end) {
        int leftNodeIdx = 2*start + 1;
        if (leftNodeIdx > end) { // start节点为叶子节点
            return;
        }

        // 查找左右子树较小者
        int rightNodeIdx = 2*start + 2;
        int minIdx = leftNodeIdx;
        int min = toSortArr[leftNodeIdx];
        if (rightNodeIdx <= end && toSortArr[rightNodeIdx] < min) {
            minIdx = rightNodeIdx;
            min = toSortArr[rightNodeIdx];
        }

        if (toSortArr[start] <= min) {
            return;
        }

        // 父节点与子节点中较小者交换并从较小子节点继续调整
        toSortArr[minIdx] = toSortArr[start];
        toSortArr[start] = min;
        adjustHeap(minIdx, end);
    }

    public void print() {
        for (int i = 0; i<toSortArr.length; i++) {
            System.out.print(" " + toSortArr[i]);
        }
    }
}
