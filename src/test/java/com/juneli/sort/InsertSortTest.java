package com.juneli.sort;

import com.juneli.sort.algorithm.InsertSort;
import com.juneli.sort.algorithm.ShellSort;
import org.junit.Test;

/**
 * Created by June on 2017/7/18.
 */
public class InsertSortTest {
    @Test
    public void testInsertSort() {
        int[] toSortArr = new int[] {41, 12, 34, 12, 55, 11, 223, 443, 23, 24};
        new InsertSort(toSortArr).sort().print();
    }

    @Test
    public void testShellSort() {
        int[] toSortArr = new int[] {41, 12, 34, 12, 55, 11, 223, 443, 23, 24};
        new ShellSort(toSortArr).sort().print();
    }
}
