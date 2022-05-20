package com.aptech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    Sorting sorting = new Sorting();
    @Test
    void selectionSort() {
        assertEquals(sorting.selectionSort(new int[]{3,4,2,1}),new int[]{1,2,3,4});
    }

    @Test
    void binarySearch() {
    }

    @Test
    void testBinarySearch() {
    }
}