package com.aptech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sorting sorting = new Sorting();
        int[] arr1 ={3,1,2,5,6,8,7};
        System.out.println(Arrays.toString(sorting.selectionSort(arr1)));
    }
}
