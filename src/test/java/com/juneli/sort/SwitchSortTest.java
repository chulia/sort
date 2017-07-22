package com.juneli.sort;

import com.juneli.sort.algorithm.BubboSort;
import org.junit.Test;

/**
 * Created by June on 2017/7/22.
 */
public class SwitchSortTest {
    @Test
    public void testBubboSort() {
        int[] toSortArr = new int[] {41, 12, 34, 12, 55, 11, 223, 443, 23, 24};
        new BubboSort(toSortArr).sort().print();
    }
}
