package com.juneli.sort;

import com.juneli.sort.algorithm.HeapSort;
import com.juneli.sort.algorithm.SimpleSelectionSort;
import org.junit.Test;

/**
 * Created by June on 2017/7/21.
 */
public class SelectionSortTest {

    @Test
    public void testSimpleSelectionSort() {
        int[] toSortArr = new int[] {41, 12, 34, 12, 55, 11, 223, 443, 23, 24};
        new SimpleSelectionSort(toSortArr).sort().print();
    }

    @Test
    public void testHeapSort() {
        int[] toSortArr = new int[] {41, 12, 34, 12, 55, 11, 223, 443, 23, 24};
        new HeapSort(toSortArr).sort().print();
    }
}
